package com.roydon.jianmo;

/**
 * Louyu
 *
 * @AUTHOR: roydon
 * @DATE: 2023/6/4
 **/
public class Louyu {
    private Integer jieshu;
    private Integer huanshu;
    private Louyu bei;
    private Louyu nan;
    private Louyu xi;
    private Louyu dong;
    private double[] daolu;

    public Louyu(Integer jieshu, Integer huanshu, Louyu bei, Louyu nan, Louyu xi, Louyu dong, double[] daolu) {
        this.jieshu = jieshu;
        this.huanshu = huanshu;
        this.bei = bei;
        this.nan = nan;
        this.xi = xi;
        this.dong = dong;
        this.daolu = daolu;
    }

    public double[] getDaolu() {
        return daolu;
    }

    public void setDaolu(double[] daolu) {
        this.daolu = daolu;
    }

    public Integer getJieshu() {
        return jieshu;
    }

    public void setJieshu(Integer jieshu) {
        this.jieshu = jieshu;
    }

    public Integer getHuanshu() {
        return huanshu;
    }

    public void setHuanshu(Integer huanshu) {
        this.huanshu = huanshu;
    }

    public Louyu getBei() {
        return bei;
    }

    public void setBei(Louyu bei) {
        this.bei = bei;
    }

    public Louyu getNan() {
        return nan;
    }

    public void setNan(Louyu nan) {
        this.nan = nan;
    }

    public Louyu getXi() {
        return xi;
    }

    public void setXi(Louyu xi) {
        this.xi = xi;
    }

    public Louyu getDong() {
        return dong;
    }

    public void setDong(Louyu dong) {
        this.dong = dong;
    }
}
