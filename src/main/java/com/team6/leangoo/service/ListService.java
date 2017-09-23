package com.team6.leangoo.service;

import com.team6.leangoo.mapper.*;
import com.team6.leangoo.model.BoardList;
import com.team6.leangoo.model.Card;
import com.team6.leangoo.model.List;
import com.team6.leangoo.model.ListCard;
import com.team6.leangoo.util.CheckId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class ListService {
    @Autowired
    private  ListMapper listMapper;
    @Autowired
    private  BoardMapper boardMapper;
    @Autowired
    private  BoardListMapper boardListMapper;
    @Autowired
    private  CardMapper cardMapper;
    @Autowired
    private  ListCardMapper listCardMapper;


    public Integer newList(List list, BoardList boardList) {
        listMapper.insert(list);
        Integer boardId = boardList.getBoardId();
        if (CheckId.canInsert(boardMapper, boardId)) {
            boardList.setListId(list.getListId());
            boardListMapper.insert(boardList);
            return list.getListId();
        } else return -1;
    }

    public Integer delList(List list) {
        BoardList boardList = new BoardList();
        ListCard listCard = new ListCard();
        Card card = new Card();
        boardList.setListId(list.getListId());
        boardListMapper.delete(boardList);
        listCard.setListId(list.getListId());
        for (ListCard temp : listCardMapper.select(listCard)) {
            card.setCardId(temp.getCardId());
            cardMapper.deleteByPrimaryKey(card);
        }
        return listMapper.deleteByPrimaryKey(list);
    }
}
