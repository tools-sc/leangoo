package com.team6.leangoo.model;

import javax.persistence.*;

@Table(name = "lane_card")
public class LaneCard {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "card_id")
    private Integer cardId;

    @Column(name = "list_id")
    private Integer listId;

    @Column(name = "lane_card_locate")
    private Integer laneCardLocate;

    @Column(name = "lane_id")
    private Integer laneId;

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

    /**
     * @return list_id
     */
    public Integer getListId() {
        return listId;
    }

    /**
     * @param listId
     */
    public void setListId(Integer listId) {
        this.listId = listId;
    }

    /**
     * @return lane_card_locate
     */
    public Integer getLaneCardLocate() {
        return laneCardLocate;
    }

    /**
     * @param laneCardLocate
     */
    public void setLaneCardLocate(Integer laneCardLocate) {
        this.laneCardLocate = laneCardLocate;
    }

    /**
     * @return lane_id
     */
    public Integer getLaneId() {
        return laneId;
    }

    /**
     * @param laneId
     */
    public void setLaneId(Integer laneId) {
        this.laneId = laneId;
    }
}