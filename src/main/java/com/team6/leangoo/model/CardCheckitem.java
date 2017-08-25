package com.team6.leangoo.model;

import javax.persistence.*;

@Table(name = "card_checkitem")
public class CardCheckitem {
    @Id
    @Column(name = "checkItem_id")
    private Integer checkitemId;

    @Column(name = "checkItem_name")
    private String checkitemName;

    @Column(name = "checkItem_value")
    private Integer checkitemValue;

    @Column(name = "card_id")
    private Integer cardId;

    /**
     * @return checkItem_id
     */
    public Integer getCheckitemId() {
        return checkitemId;
    }

    /**
     * @param checkitemId
     */
    public void setCheckitemId(Integer checkitemId) {
        this.checkitemId = checkitemId;
    }

    /**
     * @return checkItem_name
     */
    public String getCheckitemName() {
        return checkitemName;
    }

    /**
     * @param checkitemName
     */
    public void setCheckitemName(String checkitemName) {
        this.checkitemName = checkitemName;
    }

    /**
     * @return checkItem_value
     */
    public Integer getCheckitemValue() {
        return checkitemValue;
    }

    /**
     * @param checkitemValue
     */
    public void setCheckitemValue(Integer checkitemValue) {
        this.checkitemValue = checkitemValue;
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