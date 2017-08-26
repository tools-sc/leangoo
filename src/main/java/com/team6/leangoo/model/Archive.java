package com.team6.leangoo.model;

import javax.persistence.*;

public class Archive {
    @Id
    @Column(name = "archive_id")
    private Integer archiveId;

    private Integer type;

    @Column(name = "project_or_board_id")
    private Integer projectOrBoardId;

    /**
     * @return archive_id
     */
    public Integer getArchiveId() {
        return archiveId;
    }

    /**
     * @param archiveId
     */
    public void setArchiveId(Integer archiveId) {
        this.archiveId = archiveId;
    }

    /**
     * @return type
     */
    public Integer getType() {
        return type;
    }

    /**
     * @param type
     */
    public void setType(Integer type) {
        this.type = type;
    }

    /**
     * @return project_or_board_id
     */
    public Integer getProjectOrBoardId() {
        return projectOrBoardId;
    }

    /**
     * @param projectOrBoardId
     */
    public void setProjectOrBoardId(Integer projectOrBoardId) {
        this.projectOrBoardId = projectOrBoardId;
    }
}