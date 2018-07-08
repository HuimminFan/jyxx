package com.fhm.jyxx.domain;

import java.util.Date;

public class Liuyan {
    private long id;

    private User user;

    private int liuyanlock;

    private String title;

    private String content;

    private Date createtime;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public int getLiuyanlock() {
        return liuyanlock;
    }

    public void setLiuyanlock(int liuyanlock) {
        this.liuyanlock = liuyanlock;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }
}
