package com.fhm.jyxx.domain;
import java.util.*;

public class Gonggao {
    private long id;

    private int gonggaolock;

    private String title;

    private String content;

    private Date createtime;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getGonggaolock() {
        return gonggaolock;
    }

    public void setGonggaolock(int gonggaolock) {
        this.gonggaolock = gonggaolock;
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
