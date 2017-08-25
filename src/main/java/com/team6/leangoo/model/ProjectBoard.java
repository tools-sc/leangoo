package com.team6.leangoo.model;

import javax.persistence.*;

@Table(name = "project_board")
public class ProjectBoard {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "board_id")
    private Integer boardId;

    @Column(name = "project_id")
    private Integer projectId;

    /**
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return board_id
     */
    public Integer getBoardId() {
        return boardId;
    }

    /**
     * @param boardId
     */
    public void setBoardId(Integer boardId) {
        this.boardId = boardId;
    }

    /**
     * @return project_id
     */
    public Integer getProjectId() {
        return projectId;
    }

    /**
     * @param projectId
     */
    public void setProjectId(Integer projectId) {
        this.projectId = projectId;
    }
}