package com.fhm.jyxx.domain;
import java.util.*;

public class Wendang {
    private long id;

    private int wendanglock;

    private String title;

    private String path;//简历路径

    private Date createtime;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getWendanglock() {
        return wendanglock;
    }

    public void setWendanglock(int wendanglock) {
        this.wendanglock = wendanglock;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }
}
