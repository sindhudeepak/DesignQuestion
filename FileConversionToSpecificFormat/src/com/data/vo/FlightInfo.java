package com.data.vo;

import java.util.Date;

/**
 * Created by sindhud on 27/11/17.
 */
public class FlightInfo {
    private String flight_Status;
    private String dep_Loc;
    private String arr_Loc;
    private Date validTill;
    private String deptTime;
    private String ArrivalTime;
    private Long distance;

    public String getFlight_Status() {
        return flight_Status;
    }

    public void setFlight_Status(String flight_Status) {
        this.flight_Status = flight_Status;
    }

    public void setDep_Loc(String dep_Loc) {
        this.dep_Loc = dep_Loc;
    }

    public void setArr_Loc(String arr_Loc) {
        this.arr_Loc = arr_Loc;
    }

    public void setValidTill(Date validTill) {
        this.validTill = validTill;
    }

    public void setDeptTime(String deptTime) {
        this.deptTime = deptTime;
    }

    public void setArrivalTime(String arrivalTime) {
        ArrivalTime = arrivalTime;
    }

    public void setDistasnce(Long distance) {
        this.distance = distance;
    }

    public String getDep_Loc() {
        return dep_Loc;
    }

    public String getArr_Loc() {
        return arr_Loc;
    }

    public Date getValidTill() {
        return validTill;
    }

    public String getDeptTime() {
        return deptTime;
    }

    public String getArrivalTime() {
        return ArrivalTime;
    }

    public Long getDistasnce() {
        return distance;
    }

    @Override
    public String toString() {
        return "FlightInfo{" +
                "flight_Status='" + flight_Status + '\'' +
                ", dep_Loc='" + dep_Loc + '\'' +
                ", arr_Loc='" + arr_Loc + '\'' +
                ", validTill=" + validTill +
                ", deptTime='" + deptTime + '\'' +
                ", ArrivalTime='" + ArrivalTime + '\'' +
                ", distasnce=" + distance +
                '}';
    }
}
