package de.exxcellent.challenge.model;

import com.opencsv.bean.CsvBindByName;

/**
 * Class represents one weather day.
 *
 * @author Marc Fuchs <marcf1108@hotmail.de>
 */
public class Weather extends Data {
    @CsvBindByName(column = "Day")
    private int day;
    @CsvBindByName(column = "MxT")
    private int maximumTemperature;
    @CsvBindByName(column = "MnT")
    private int minimumTemperature;
    @CsvBindByName(column = "AvT")
    private int avT;
    @CsvBindByName(column = "AvDP")
    private float avDP;
    @CsvBindByName(column = "1HrP TPcpn")
    private int oneHrP_TPcpn;
    @CsvBindByName(column = "PDir")
    private int pDir;
    @CsvBindByName(column = "AvSp")
    private float avSp;
    @CsvBindByName(column = "Dir")
    private int dir;
    @CsvBindByName(column = "MxS")
    private int mxS;
    @CsvBindByName(column = "SkyC")
    private float skyC;
    @CsvBindByName(column = "MxR")
    private int mxR;
    @CsvBindByName(column = "Mn")
    private int mn;
    @CsvBindByName(column = "R AvSLP")
    private float r_AvSLP;

    /**
     * Calculates the difference between maximumTemperature and minimumTemperature.
     * @return Returns the calculated difference.
     */
    public int calcDeltaTemperature() {
        return this.maximumTemperature - this.minimumTemperature;
    }

    /**
     * Returns a String that represents the Object and its values.
     */
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
