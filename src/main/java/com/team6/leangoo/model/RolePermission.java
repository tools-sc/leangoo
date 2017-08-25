package com.team6.leangoo.model;

import javax.persistence.*;

@Table(name = "role_permission")
public class RolePermission {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "role_id")
    private Integer roleId;

    @Column(name = "permisson_id")
    private Integer permissonId;

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
     * @return permisson_id
     */
    public Integer getPermissonId() {
        return permissonId;
    }

    /**
     * @param permissonId
     */
    public void setPermissonId(Integer permissonId) {
        this.permissonId = permissonId;
    }
}