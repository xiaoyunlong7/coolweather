package com.coolweather.android.db;

import org.litepal.crud.DataSupport;

/*
存放省的实体类
id是每个实体类中该有的字段
provinceName记录省的名字
provinceCode记录省的代号
 */
public class Province extends DataSupport {

    private int id;
    private String provinceName;
    private int provinceCode;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProvinceName() {
        return provinceName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

    public int getProvinceCode() {
        return provinceCode;
    }

    public void setProvinceCode(int provinceCode) {
        this.provinceCode = provinceCode;
    }

<<<<<<< HEAD
=======
    @Override
    public String toString() {
        return "Province{" +
                "id=" + id +
                ", provinceName='" + provinceName + '\'' +
                ", provinceCode=" + provinceCode +
                '}';
    }

>>>>>>> e8cf54e6e4c4c0ce3f75143e9e94ab51e408f9c0
}
