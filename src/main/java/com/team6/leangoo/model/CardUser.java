package com.team6.leangoo.model;

import javax.persistence.*;

@Table(name = "card_user")
public class CardUser {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "user_id")
    private Integer userId;

    @Column(name = "card_id")
    private Integer cardId;

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
     * @return user_id
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * @param userId
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * @return card_id
     */
    public Integer getCardId() {
        return cardId;
    }

    /**
     * @param cardId
     */
    public void setCardId(Integer cardId) {
        this.cardId = cardId;
    }
}