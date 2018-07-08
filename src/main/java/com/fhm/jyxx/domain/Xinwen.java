package com.fhm.jyxx.domain;
import java.util.*;

public class Xinwen {
    private long id;

    private int xinwenlock;

    private String title;

    private String content;

    private Date createtime;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getXinwenlock() {
        return xinwenlock;
    }

    public void setXinwenlock(int xinwenlock) {
        this.xinwenlock = xinwenlock;
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
