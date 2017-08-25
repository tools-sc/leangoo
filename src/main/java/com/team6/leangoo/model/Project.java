package com.team6.leangoo.model;

import java.util.Date;
import javax.persistence.*;

public class Project {
    @Id
    @Column(name = "project_id")
    private Integer projectId;

    @Column(name = "project_name")
    private String projectName;

    @Column(name = "project_intro")
    private String projectIntro;

    @Column(name = "project_create_date")
    private Date projectCreateDate;

    @Column(name = "project_start_date")
    private Date projectStartDate;

    @Column(name = "project_end_date")
    private Date projectEndDate;

    /**
     * @return project_id
     */
    public Integer getProjectId() {
        return projectId;
    }

    /**
     * @param projectId
     */
    public void setProjectId(Integer projectId) {
        this.projectId = projectId;
    }

    /**
     * @return project_name
     */
    public String getProjectName() {
        return projectName;
    }

    /**
     * @param projectName
     */
    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    /**
     * @return project_intro
     */
    public String getProjectIntro() {
        return projectIntro;
    }

    /**
     * @param projectIntro
     */
    public void setProjectIntro(String projectIntro) {
        this.projectIntro = projectIntro;
    }

    /**
     * @return project_create_date
     */
    public Date getProjectCreateDate() {
        return projectCreateDate;
    }

    /**
     * @param projectCreateDate
     */
    public void setProjectCreateDate(Date projectCreateDate) {
        this.projectCreateDate = projectCreateDate;
    }

    /**
     * @return project_start_date
     */
    public Date getProjectStartDate() {
        return projectStartDate;
    }

    /**
     * @param projectStartDate
     */
    public void setProjectStartDate(Date projectStartDate) {
        this.projectStartDate = projectStartDate;
    }

    /**
     * @return project_end_date
     */
    public Date getProjectEndDate() {
        return projectEndDate;
    }

    /**
     * @param projectEndDate
     */
    public void setProjectEndDate(Date projectEndDate) {
        this.projectEndDate = projectEndDate;
    }
}