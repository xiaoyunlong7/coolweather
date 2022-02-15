package com.coolweather.android.db;

import org.litepal.crud.DataSupport;
/*
存放市的实体类
cityName城市名
cityCode纪录城市代号
provincrId记录当前市所属省的id
 */
public class City extends DataSupport {

    private int id;
    private String cityName;
    private int cityCode;
    private int provincrId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public int getCityCode() {
        return cityCode;
    }

    public void setCityCode(int cityCode) {
        this.cityCode = cityCode;
    }

    public int getProvincrId() {
        return provincrId;
    }

    public void setProvincrId(int provincrId) {
        this.provincrId = provincrId;
    }

}
