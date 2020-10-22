package com.northland.domain;

/**
 * 网店零售订单 收货人地址修改  BC_Sal_OrderMaster
 */
public class Customer_Info {

    private String billNo;  //单据号
    private String buyerMobileTel; // 买家移动电话
    private String consigneeName;//收货人姓名
    private String province; //省
    private String city;    //城市
    private String area;//区县
    private String zipCode;//邮政编码
    private String address;//详细地址
    private Integer dispatchStatus; //派单状态  0 未派单 1、已派单 2、已接单 null、已结单
    private String dispatchStatusStr;


    public String getBillNo() {
        return billNo;
    }

    public void setBillNo(String billNo) {
        this.billNo = billNo;
    }

    public String getBuyerMobileTel() {
        return buyerMobileTel;
    }

    public void setBuyerMobileTel(String buyerMobileTel) {
        this.buyerMobileTel = buyerMobileTel;
    }

    public String getConsigneeName() {
        return consigneeName;
    }

    public void setConsigneeName(String consigneeName) {
        this.consigneeName = consigneeName;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getDispatchStatus() {
        return dispatchStatus;
    }

    public void setDispatchStatus(Integer dispatchStatus) {
        this.dispatchStatus = dispatchStatus;
    }

    public String getDispatchStatusStr() {

            if(dispatchStatus == null) {
                dispatchStatusStr = "已结单";
            }else if (dispatchStatus == 0) {
                dispatchStatusStr = "未派单";
            } else if (dispatchStatus == 1) {
                dispatchStatusStr = "已派单";
            } else if (dispatchStatus == 2) {
                dispatchStatusStr = "已接单";
            }else if(dispatchStatus == 3){
                dispatchStatusStr = "已拒单";
            }
        return dispatchStatusStr;
    }

    public void setDispatchStatusStr(String dispatchStatusStr) {
        this.dispatchStatusStr = dispatchStatusStr;
    }
}
