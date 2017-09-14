package com.team6.leangoo.controller;

import com.team6.leangoo.model.Card;
import com.team6.leangoo.service.CardService;
import com.team6.leangoo.util.AjaxResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by AgZou on 2017/9/14.
 */
@RestController
@RequestMapping("/Card")
public class CardController {
    @Autowired
    final private CardService cardService;

    public CardController(CardService cardService) {
        this.cardService = cardService;
    }

    @RequestMapping(value = "/getCardList", method = RequestMethod.POST)
    public AjaxResult getCardList(Integer boardId) {
        AjaxResult ajaxResult = new AjaxResult();
        try {
            ajaxResult.setData(cardService.getCardList(boardId).getLists());
            ajaxResult.seterrcode(0);
        } catch (Exception e) {
            e.printStackTrace();
            ajaxResult.seterrcode(10);
            ajaxResult.setinfo("请求失败");
        } finally {
            return ajaxResult;
        }
    }
    @RequestMapping(value = "/changeCard",method = RequestMethod.POST)
    public AjaxResult changeCard(Card card){
            AjaxResult ajaxResult=new AjaxResult();
        try {
            ajaxResult.setData(cardService.changeCard(card));
            ajaxResult.seterrcode(0);
        } catch (Exception e) {
            e.printStackTrace();
            ajaxResult.seterrcode(10);
            ajaxResult.setinfo("请求失败");
        } finally {
            return ajaxResult;
        }
    }
    @RequestMapping(value="/newCard",method = RequestMethod.POST)
    public AjaxResult newCard(Card card){
        AjaxResult ajaxResult=new AjaxResult();
        try {
            ajaxResult.setData(cardService.newCard(card));
            ajaxResult.seterrcode(0);
        } catch (Exception e) {
            e.printStackTrace();
            ajaxResult.seterrcode(10);
            ajaxResult.setinfo("请求失败");
        } finally {
            return  ajaxResult;
        }
    }
}
