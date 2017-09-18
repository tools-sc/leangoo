package com.team6.leangoo.mapper;

import com.team6.leangoo.model.Board;
import com.team6.leangoo.util.MyMapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BoardMapper extends MyMapper<Board> {
    public List getArchiveBoards(Integer userId);
    public Board getList(@Param("boardId") Integer boardId);
}