package com.team6.leangoo.model;

import javax.persistence.*;

public class Lane {
    @Id
    @Column(name = "lane_id")
    private Integer laneId;

    @Column(name = "lane_locate")
    private Integer laneLocate;

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

    /**
     * @return lane_locate
     */
    public Integer getLaneLocate() {
        return laneLocate;
    }

    /**
     * @param laneLocate
     */
    public void setLaneLocate(Integer laneLocate) {
        this.laneLocate = laneLocate;
    }
}