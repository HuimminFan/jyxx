package com.fhm.jyxx.domain;

import java.util.Date;

public class Jiuye {
    private long id;

    private int jiuyelock;

    private User user;//关联学生

    private Date createtime;//

    private String jiuyefenbu;//就业分布  南方  北方

    private String xingbie;//性别  男，女

    private String jiuyeshijian;//就业时间

    private String biyeqianhoujiuye;//毕业前就业   毕业后就业

    private String congshihangye;//从事行业

    private User laoshi;//关联老师

    private String jiuyeshengfen;//就业省份

    private String jiuyeyuefen;//就业月份

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getJiuyelock() {
        return jiuyelock;
    }

    public void setJiuyelock(int jiuyelock) {
        this.jiuyelock = jiuyelock;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public String getJiuyefenbu() {
        return jiuyefenbu;
    }

    public void setJiuyefenbu(String jiuyefenbu) {
        this.jiuyefenbu = jiuyefenbu;
    }

    public String getXingbie() {
        return xingbie;
    }

    public void setXingbie(String xingbie) {
        this.xingbie = xingbie;
    }

    public String getJiuyeshijian() {
        return jiuyeshijian;
    }

    public void setJiuyeshijian(String jiuyeshijian) {
        this.jiuyeshijian = jiuyeshijian;
    }

    public String getBiyeqianhoujiuye() {
        return biyeqianhoujiuye;
    }

    public void setBiyeqianhoujiuye(String biyeqianhoujiuye) {
        this.biyeqianhoujiuye = biyeqianhoujiuye;
    }

    public String getCongshihangye() {
        return congshihangye;
    }

    public void setCongshihangye(String congshihangye) {
        this.congshihangye = congshihangye;
    }

    public User getLaoshi() {
        return laoshi;
    }

    public void setLaoshi(User laoshi) {
        this.laoshi = laoshi;
    }

    public String getJiuyeshengfen() {
        return jiuyeshengfen;
    }

    public void setJiuyeshengfen(String jiuyeshengfen) {
        this.jiuyeshengfen = jiuyeshengfen;
    }

    public String getJiuyeyuefen() {
        return jiuyeyuefen;
    }

    public void setJiuyeyuefen(String jiuyeyuefen) {
        this.jiuyeyuefen = jiuyeyuefen;
    }
}
