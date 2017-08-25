package com.team6.leangoo.model;

import javax.persistence.*;

public class List {
    @Id
    @Column(name = "list_id")
    private Integer listId;

    @Column(name = "list_name")
    private String listName;

    @Column(name = "list_locate")
    private String listLocate;

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
     * @return list_name
     */
    public String getListName() {
        return listName;
    }

    /**
     * @param listName
     */
    public void setListName(String listName) {
        this.listName = listName;
    }

    /**
     * @return list_locate
     */
    public String getListLocate() {
        return listLocate;
    }

    /**
     * @param listLocate
     */
    public void setListLocate(String listLocate) {
        this.listLocate = listLocate;
    }
}