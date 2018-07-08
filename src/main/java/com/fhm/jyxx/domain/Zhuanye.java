package com.fhm.jyxx.domain;

public class Zhuanye {
    private long id;

    private int zhuanyelock;

    private String name;

    private Xi xi;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getZhuanyelock() {
        return zhuanyelock;
    }

    public void setZhuanyelock(int zhuanyelock) {
        this.zhuanyelock = zhuanyelock;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Xi getXi() {
        return xi;
    }

    public void setXi(Xi xi) {
        this.xi = xi;
    }
}
