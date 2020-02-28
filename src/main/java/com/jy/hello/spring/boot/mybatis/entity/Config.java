package com.jy.hello.spring.boot.mybatis.entity;

import javax.persistence.*;

public class Config {
    @Id
    private String uuid;

    private String name;

    private String path;

    /**
     * 项说明
     */
    private String remork;

    /**
     * 备注
     */
    private String beizhu;

    /**
     * @return uuid
     */
    public String getUuid() {
        return uuid;
    }

    /**
     * @param uuid
     */
    public void setUuid(String uuid) {
        this.uuid = uuid == null ? null : uuid.trim();
    }

    /**
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * @return path
     */
    public String getPath() {
        return path;
    }

    /**
     * @param path
     */
    public void setPath(String path) {
        this.path = path == null ? null : path.trim();
    }

    /**
     * 获取项说明
     *
     * @return remork - 项说明
     */
    public String getRemork() {
        return remork;
    }

    /**
     * 设置项说明
     *
     * @param remork 项说明
     */
    public void setRemork(String remork) {
        this.remork = remork == null ? null : remork.trim();
    }

    /**
     * 获取备注
     *
     * @return beizhu - 备注
     */
    public String getBeizhu() {
        return beizhu;
    }

    /**
     * 设置备注
     *
     * @param beizhu 备注
     */
    public void setBeizhu(String beizhu) {
        this.beizhu = beizhu == null ? null : beizhu.trim();
    }
}