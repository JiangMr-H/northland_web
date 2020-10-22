package com.northland.service;

import com.northland.domain.BC_JIT_PickMaster;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface IBC_JIT_PickMasterService {

    //按调拨单号查询

    List<BC_JIT_PickMaster> findAllBySDSalShipMasterBillNo(String SDSalShipMasterBillNo) throws Exception;

    List<BC_JIT_PickMaster> findAll();

    BC_JIT_PickMaster findBySD(String sdSalShipMasterBillNo);

    void update(String sdSalShipMasterBillNo, String pick_no, String buyer_address);

    void updateSDMRM(String sdSalShipMasterBillNo, String buyer_address);
}
