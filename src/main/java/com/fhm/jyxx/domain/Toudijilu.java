package com.fhm.jyxx.domain;

import java.util.Date;

public class Toudijilu {
    private long id;

    private com.fhm.jyxx.domain.Zhiwei zhiwei;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Zhiwei getZhiwei() {
        return zhiwei;
    }

    public void setZhiwei(Zhiwei zhiwei) {
        this.zhiwei = zhiwei;
    }

    public Jianli getJianli() {
        return jianli;
    }

    public void setJianli(Jianli jianli) {
        this.jianli = jianli;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public String getReadzhuangtai() {
        return readzhuangtai;
    }

    public void setReadzhuangtai(String readzhuangtai) {
        this.readzhuangtai = readzhuangtai;
    }

    public String getYingpinzhuangtai() {
        return yingpinzhuangtai;
    }

    public void setYingpinzhuangtai(String yingpinzhuangtai) {
        this.yingpinzhuangtai = yingpinzhuangtai;
    }

    private com.fhm.jyxx.domain.Jianli jianli;

    private Date createtime;

    private String readzhuangtai;//未阅读  已阅读

    private String yingpinzhuangtai;//应聘状态
}
