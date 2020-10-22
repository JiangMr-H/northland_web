package com.northland.domain;


/**
 * JIT 拣货单
 */
public class BC_JIT_PickMaster {

    private Long CompanyID;

    private String pick_no;

    private String SDSalShipMasterBillNo;

    private String buyer_address;


    public Long getCompanyID() {
        return CompanyID;
    }

    public void setCompanyID(Long companyID) {
        CompanyID = companyID;
    }

    public String getPick_no() {
        return pick_no;
    }

    public void setPick_no(String pick_no) {
        this.pick_no = pick_no;
    }

    public String getSDSalShipMasterBillNo() {
        return SDSalShipMasterBillNo;
    }

    public void setSDSalShipMasterBillNo(String SDSalShipMasterBillNo) {
        this.SDSalShipMasterBillNo = SDSalShipMasterBillNo;
    }

    public String getBuyer_address() {
        return buyer_address;
    }

    public void setBuyer_address(String buyer_address) {
        this.buyer_address = buyer_address;
    }
}
