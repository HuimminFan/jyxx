package com.fhm.jyxx.domain;

import java.util.Date;

public class Jianli {
    private long id;

    private int jianlilock;

    private String jianlimingchen;//简历名称

    private String path;//简历路径

    private User qiuzhiren;//求职者

    private Date createtime;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getJianlilock() {
        return jianlilock;
    }

    public void setJianlilock(int jianlilock) {
        this.jianlilock = jianlilock;
    }

    public String getJianlimingchen() {
        return jianlimingchen;
    }

    public void setJianlimingchen(String jianlimingchen) {
        this.jianlimingchen = jianlimingchen;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public User getQiuzhiren() {
        return qiuzhiren;
    }

    public void setQiuzhiren(User qiuzhiren) {
        this.qiuzhiren = qiuzhiren;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }
}
