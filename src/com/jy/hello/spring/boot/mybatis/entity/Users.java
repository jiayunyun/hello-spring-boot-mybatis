package com.jy.hello.spring.boot.mybatis.entity;

import javax.persistence.*;

public class Users {
    @Id
    private Integer id;

    /**
     * 密码
     */
    @Column(name = "Password")
    private String password;

    /**
     * 账号
     */
    private String name;

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
     * 获取密码
     *
     * @return Password - 密码
     */
    public String getPassword() {
        return password;
    }

    /**
     * 设置密码
     *
     * @param password 密码
     */
    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    /**
     * 获取账号
     *
     * @return name - 账号
     */
    public String getName() {
        return name;
    }

    /**
     * 设置账号
     *
     * @param name 账号
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }
}