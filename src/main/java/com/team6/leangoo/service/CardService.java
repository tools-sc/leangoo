package com.team6.leangoo.service;

import com.team6.leangoo.mapper.BoardMapper;
import com.team6.leangoo.mapper.CardMapper;
import com.team6.leangoo.model.Board;
import com.team6.leangoo.model.Card;
import com.team6.leangoo.model.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by AgZou on 2017/9/14.
 */
@Service
@Transactional
public class CardService {
    @Autowired
    private BoardMapper boardMapper;
    @Autowired
    private CardMapper cardMapper;

    public Board getCardList(Integer boardId) {
        return boardMapper.getList(boardId);
    }

    public Integer changeCard(Card card) {
        return cardMapper.updateByPrimaryKeySelective(card);
    }

    public Integer newCard(Card card) {
        return cardMapper.insert(card);
    }
}
