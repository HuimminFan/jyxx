package com.fhm.jyxx.domain;

import java.util.Date;
public class Zhiwei {
    private long id;

    private int zhiweilock;

    private String zhiweileibie;//职位类别

    private String zhiweimingchen;//岗位名称

    private String zhaopinrenshu;//招聘人数

    private String gongzuodidian;//工作地点

    private String yuexin;//月薪

    private String xueli;//学历

    private String gongzuonianxian;//工作年限

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getZhiweilock() {
        return zhiweilock;
    }

    public void setZhiweilock(int zhiweilock) {
        this.zhiweilock = zhiweilock;
    }

    public String getZhiweileibie() {
        return zhiweileibie;
    }

    public void setZhiweileibie(String zhiweileibie) {
        this.zhiweileibie = zhiweileibie;
    }

    public String getZhiweimingchen() {
        return zhiweimingchen;
    }

    public void setZhiweimingchen(String zhiweimingchen) {
        this.zhiweimingchen = zhiweimingchen;
    }

    public String getZhaopinrenshu() {
        return zhaopinrenshu;
    }

    public void setZhaopinrenshu(String zhaopinrenshu) {
        this.zhaopinrenshu = zhaopinrenshu;
    }

    public String getGongzuodidian() {
        return gongzuodidian;
    }

    public void setGongzuodidian(String gongzuodidian) {
        this.gongzuodidian = gongzuodidian;
    }

    public String getYuexin() {
        return yuexin;
    }

    public void setYuexin(String yuexin) {
        this.yuexin = yuexin;
    }

    public String getXueli() {
        return xueli;
    }

    public void setXueli(String xueli) {
        this.xueli = xueli;
    }

    public String getGongzuonianxian() {
        return gongzuonianxian;
    }

    public void setGongzuonianxian(String gongzuonianxian) {
        this.gongzuonianxian = gongzuonianxian;
    }

    public String getGongzuoleixing() {
        return gongzuoleixing;
    }

    public void setGongzuoleixing(String gongzuoleixing) {
        this.gongzuoleixing = gongzuoleixing;
    }

    public String getXingbie() {
        return xingbie;
    }

    public void setXingbie(String xingbie) {
        this.xingbie = xingbie;
    }

    public String getZhiweimiaoshu() {
        return zhiweimiaoshu;
    }

    public void setZhiweimiaoshu(String zhiweimiaoshu) {
        this.zhiweimiaoshu = zhiweimiaoshu;
    }

    public String getYouxianqi() {
        return youxianqi;
    }

    public void setYouxianqi(String youxianqi) {
        this.youxianqi = youxianqi;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public User getZhiweifaburen() {
        return zhiweifaburen;
    }

    public void setZhiweifaburen(User zhiweifaburen) {
        this.zhiweifaburen = zhiweifaburen;
    }

    public String getGongzuoshengfen() {
        return gongzuoshengfen;
    }

    public void setGongzuoshengfen(String gongzuoshengfen) {
        this.gongzuoshengfen = gongzuoshengfen;
    }

    private String gongzuoleixing;//全职， 兼职，不限

    private String xingbie;//性别，男 ，女

    private String zhiweimiaoshu;//岗位描述

    private String youxianqi;//有效期

    private Date createtime;

    private User zhiweifaburen;//岗位发布人

    private String gongzuoshengfen;//工作省份
}
