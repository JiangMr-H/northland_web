package com.northland.domain;

/**
 * 调拨申请单
 */
public class SD_Inv_MoveReqMaster {

    private Long CompanyID;

    private String BillNo;

    private String Address;

    public Long getCompanyID() {
        return CompanyID;
    }

    public void setCompanyID(Long companyID) {
        CompanyID = companyID;
    }

    public String getBillNo() {
        return BillNo;
    }

    public void setBillNo(String billNo) {
        BillNo = billNo;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }
}
