package com.team6.leangoo.service;

import com.team6.leangoo.mapper.ProjectBoardMapper;
import com.team6.leangoo.mapper.ProjectMapper;
import com.team6.leangoo.mapper.ProjectUserMapper;
import com.team6.leangoo.mapper.UserMapper;
import com.team6.leangoo.model.Board;
import com.team6.leangoo.model.Project;
import com.team6.leangoo.model.ProjectBoard;
import com.team6.leangoo.model.ProjectUser;
import com.team6.leangoo.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Created with IntelliJ IDEA.
 * User: lfxiui
 * Date: 2017/9/13
 * Time: 10:11
 */
@Service
@Transactional
public class ProjectService {
    @Autowired
    private ProjectMapper projectMapper;
    @Autowired
    private ProjectUserMapper projectUserMapper;
    @Autowired
    private UserMapper userMapper;
    @Autowired
    private ProjectBoardMapper projectBoardMapper;
    @Autowired
    private BoardService boardService;

    public List getArchiveProjectList(User user) {
        List<Project> projects = projectMapper.getArchiveProjects(user.getUserId());
        List list = new ArrayList();
        for (Project temp : projects) {
            Map map = new HashMap();
            map.put("projectId", temp.getProjectId());
            map.put("projectName", temp.getProjectName());

            list.add(map);
        }
        return list;
    }

    public int updateProject(Project project) {
        return projectMapper.updateByPrimaryKeySelective(project);
    }

    public List<Project> getUserProjectList(User user) {
        List<Project> projects = projectMapper.getUserProjectList(user.getUserId());
        for (Project temp : projects) {
            if (temp.getBoardList() != null && temp.getBoardList().size() > 0) {
                temp.setBoardList(temp.getBoardList().stream()
                        .filter(board -> board.getBoardIsArchive() != null && board.getBoardIsArchive() != 1).collect(Collectors.toList()));
            }
        }
        return projects;
    }

    public Project getProjectInfo(Project project) {
        return projectMapper.selectOne(project);
    }

    public List getProjectLeaguerList(Project project) {
        List<User> leaguers = projectMapper.getProjectLeaguerList(project.getProjectId());
        List leaguserList = new ArrayList();
        Map map = null;
        for (User temp : leaguers) {
            map = new HashMap();
            map.put("userAccount", temp.getUserAccount());
            map.put("userEmail", temp.getUserEmail());
            map.put("userAvatar", temp.getUserAvatar());
            leaguserList.add(map);
        }
        return leaguserList;
    }

    public int addProjectLeaguer(Project project, User user) {
        ProjectUser projectUser = new ProjectUser();
        projectUser.setProjectId(project.getProjectId());
        projectUser.setIsPersonal(0);
        user = userMapper.selectOne(user);
        projectUser.setUserId(user.getUserId());
        if (projectUserMapper.selectOne(projectUser) == null) {
            return projectUserMapper.insert(projectUser);
        } else {
            return 0;
        }
    }

    public int deleteProjectLeaguer(Project project, User user) {
        ProjectUser projectUser = new ProjectUser();
        projectUser.setProjectId(project.getProjectId());
        user = userMapper.selectOne(user);
        projectUser.setUserId(user.getUserId());
        projectUser = projectUserMapper.selectOne(projectUser);
        if (projectUser != null) {
            return projectUserMapper.delete(projectUser);
        } else {
            return 0;
        }
    }

    public List getBoardListByProjectId(Project project) {
        List<Board> boards = projectMapper.getBoardListByProjectId(project.getProjectId());
        List boardList = new ArrayList();
        Map map = null;
        for (Board temp : boards) {
            map = new HashMap();
            map.put("boardId", temp.getBoardId());
            map.put("boardName", temp.getBoardName());
            boardList.add(map);
        }
        return boardList;
    }

    public Integer getUserPersonalProjectId(Integer userId) {
        ProjectUser projectUser = new ProjectUser();
        projectUser.setUserId(userId);
        projectUser.setIsPersonal(1);
        List<ProjectUser> projectUsers = projectUserMapper.select(projectUser);
        if (projectUsers.size() > 0){
            return projectUsers.get(0).getProjectId();
        }else{
            return 0;
        }
        //return projectUserMapper.select(projectUser).get(0).getProjectId();
    }

    public Integer newProject(Integer userId, Project project) {
        projectMapper.insert(project);
        ProjectUser projectUser = new ProjectUser();
        projectUser.setUserId(userId);
        projectUser.setProjectId(project.getProjectId());
        projectUser.setIsPersonal(0);
        projectUserMapper.insert(projectUser);
        return project.getProjectId();
    }

    public Integer delProject(Project project) {
        ProjectBoard projectBoard = new ProjectBoard();
        projectBoard.setProjectId(project.getProjectId());
        List<ProjectBoard> projectBoards = projectBoardMapper.select(projectBoard);
        Board board = new Board();
        projectBoards.forEach(pb -> {
            board.setBoardId(pb.getBoardId());
            boardService.delBoard(board);
            board.setBoardId(null);
        });
        ProjectUser projectUser =new ProjectUser();
        projectUser.setProjectId(project.getProjectId());
        projectUserMapper.delete(projectUser);
        return  projectMapper.delete(project);
    }
    public Integer reArchiveProject(Project project){
        project.setProjectIsArchive(0);
        return projectMapper.updateByPrimaryKeySelective(project);
    }
}
