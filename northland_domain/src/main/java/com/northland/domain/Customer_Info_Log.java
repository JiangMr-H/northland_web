package com.northland.domain;

import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class Customer_Info_Log {

    private Long id;
    private String operator; //操作者
    private String billNo;  //单据号
    private String oldBuyerMobileTel; // 买家移动电话
    private String oldConsigneeName;//收货人姓名
    private String oldProvince; //省
    private String oldCity;    //城市
    private String oldArea;//区县
    private String oldZipCode;//邮政编码
    private String oldAddress;//详细地址
    private String newBuyerMobileTel; // 买家移动电话
    private String newConsigneeName;//收货人姓名
    private String newProvince; //省
    private String newCity;    //城市
    private String newArea;//区县
    private String newZipCode;//邮政编码
    private String newAddress;//详细地址
    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm")
    private Date updateTime;
    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm")
    private Date recordTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public String getBillNo() {
        return billNo;
    }

    public void setBillNo(String billNo) {
        this.billNo = billNo;
    }

    public String getOldBuyerMobileTel() {
        return oldBuyerMobileTel;
    }

    public void setOldBuyerMobileTel(String oldBuyerMobileTel) {
        this.oldBuyerMobileTel = oldBuyerMobileTel;
    }

    public String getOldConsigneeName() {
        return oldConsigneeName;
    }

    public void setOldConsigneeName(String oldConsigneeName) {
        this.oldConsigneeName = oldConsigneeName;
    }

    public String getOldProvince() {
        return oldProvince;
    }

    public void setOldProvince(String oldProvince) {
        this.oldProvince = oldProvince;
    }

    public String getOldCity() {
        return oldCity;
    }

    public void setOldCity(String oldCity) {
        this.oldCity = oldCity;
    }

    public String getOldArea() {
        return oldArea;
    }

    public void setOldArea(String oldArea) {
        this.oldArea = oldArea;
    }

    public String getOldZipCode() {
        return oldZipCode;
    }

    public void setOldZipCode(String oldZipCode) {
        this.oldZipCode = oldZipCode;
    }

    public String getOldAddress() {
        return oldAddress;
    }

    public void setOldAddress(String oldAddress) {
        this.oldAddress = oldAddress;
    }

    public String getNewBuyerMobileTel() {
        return newBuyerMobileTel;
    }

    public void setNewBuyerMobileTel(String newBuyerMobileTel) {
        this.newBuyerMobileTel = newBuyerMobileTel;
    }

    public String getNewConsigneeName() {
        return newConsigneeName;
    }

    public void setNewConsigneeName(String newConsigneeName) {
        this.newConsigneeName = newConsigneeName;
    }

    public String getNewProvince() {
        return newProvince;
    }

    public void setNewProvince(String newProvince) {
        this.newProvince = newProvince;
    }

    public String getNewCity() {
        return newCity;
    }

    public void setNewCity(String newCity) {
        this.newCity = newCity;
    }

    public String getNewArea() {
        return newArea;
    }

    public void setNewArea(String newArea) {
        this.newArea = newArea;
    }

    public String getNewZipCode() {
        return newZipCode;
    }

    public void setNewZipCode(String newZipCode) {
        this.newZipCode = newZipCode;
    }

    public String getNewAddress() {
        return newAddress;
    }

    public void setNewAddress(String newAddress) {
        this.newAddress = newAddress;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Date getRecordTime() {
        return recordTime;
    }

    public void setRecordTime(Date recordTime) {
        this.recordTime = recordTime;
    }
}
