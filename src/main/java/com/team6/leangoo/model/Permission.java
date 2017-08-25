package com.team6.leangoo.model;

import javax.persistence.*;
import java.util.*;
import java.util.List;

public class Permission {
    @Id
    @Column(name = "permission_id")
    private Integer permissionId;

    @Column(name = "permission_name")
    private String permissionName;

    @Column(name = "permission_url")
    private String permissionUrl;

    @Column(name = "permission_method")
    private String permissionMethod;
    @Transient
    private java.util.List<Role> roles=new ArrayList<>();//这个变量,根据表里的对应关系手写的

    public List<Role> getRoles() {
        return roles;
    }

    public void setRoles(List<Role> roles) {
        this.roles = roles;
    }

    /**
     * @return permission_id
     */
    public Integer getPermissionId() {
        return permissionId;
    }

    /**
     * @param permissionId
     */
    public void setPermissionId(Integer permissionId) {
        this.permissionId = permissionId;
    }

    /**
     * @return permission_name
     */
    public String getPermissionName() {
        return permissionName;
    }

    /**
     * @param permissionName
     */
    public void setPermissionName(String permissionName) {
        this.permissionName = permissionName;
    }

    /**
     * @return permission_url
     */
    public String getPermissionUrl() {
        return permissionUrl;
    }

    /**
     * @param permissionUrl
     */
    public void setPermissionUrl(String permissionUrl) {
        this.permissionUrl = permissionUrl;
    }

    /**
     * @return permission_method
     */
    public String getPermissionMethod() {
        return permissionMethod;
    }

    /**
     * @param permissionMethod
     */
    public void setPermissionMethod(String permissionMethod) {
        this.permissionMethod = permissionMethod;
    }
}