package de.exxcellent.challenge.model;

public class Weather extends Data {
    private int day;
    private int maximumTemperature;
    private int minimumTemperature;
    private int avT;
    private float avDP;
    private int oneHrP_TPcpn;
    private int pDir;
    private float avSp;
    private int dir;
    private int mxS;
    private float skyC;
    private int mxR;
    private int mn;
    private float r_AvSLP;

    public int calcDeltaTemperature() {
        return this.maximumTemperature - this.minimumTemperature;
    }

    @Override
    public String toString() {
        return "Weather [Day=" + this.day
        + ", maximumTemperature=" + this.maximumTemperature
        + ", minimumTemperature=" + this.minimumTemperature
        + ", AvT=" + this.avT
        + ", AvDP=" + this.avDP
        + ", 1HrP TPcpn=" + this.oneHrP_TPcpn
        + ", PDir=" + this.pDir
        + ", AvSp=" + this.avSp
        + ", Dir=" + this.dir
        + ", MxS=" + this.mxS
        + ", SkyC=" + this.skyC
        + ", MxR=" + this.mxR
        + ", Mn=" + this.mn
        + ", R AvSLP=" + this.r_AvSLP
        + ", calcDeltaTemperature=" + this.calcDeltaTemperature()
        + "]";
    }
}
