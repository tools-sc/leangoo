package com.team6.leangoo.model;

import javax.persistence.*;
import java.util.*;
import java.util.List;

public class Role {
    @Id
    @Column(name = "role_id")
    private Integer roleId;

    @Column(name = "role_name")
    private String roleName;

    @Column(name = "role_level")
    private String roleLevel;
    @Transient
    private java.util.List<User> users=new ArrayList<>();
    @Transient
    private java.util.List<Permission> permissions =new ArrayList<>();// 这个变量,根据表里的对应关系手写的

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    public List<Permission> getPermissions() {
        return permissions;
    }

    public void setPermissions(List<Permission> permissions) {
        this.permissions = permissions;
    }

    /**
     * @return role_id
     */
    public Integer getRoleId() {
        return roleId;
    }

    /**
     * @param roleId
     */
    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    /**
     * @return role_name
     */
    public String getRoleName() {
        return roleName;
    }

    /**
     * @param roleName
     */
    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    /**
     * @return role_level
     */
    public String getRoleLevel() {
        return roleLevel;
    }

    /**
     * @param roleLevel
     */
    public void setRoleLevel(String roleLevel) {
        this.roleLevel = roleLevel;
    }
}