package com.northland.dao;

import com.northland.domain.BC_JIT_PickMaster;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface IBC_JIT_PickMasterDao {

    //按调拨单号查询
    @Select("select pick_no,SDSalShipMasterBillNo,buyer_address\n" +
            "   from BC_JIT_PickMaster where SDSalShipMasterBillNo=#{SDSalShipMasterBillNo}")
    List<BC_JIT_PickMaster> findAllBySDSalShipMasterBillNo(String SDSalShipMasterBillNo) throws Exception;

    @Select("  select pick_no,SDSalShipMasterBillNo,buyer_address\n" +
            "   from BC_JIT_PickMaster ")
    List<BC_JIT_PickMaster> findAll();

    @Select("select pick_no,SDSalShipMasterBillNo,buyer_address\n" +
            "   from BC_JIT_PickMaster where SDSalShipMasterBillNo=#{SDSalShipMasterBillNo}")
    BC_JIT_PickMaster findBySD(String sdSalShipMasterBillNo);

    @Update("update BC_JIT_PickMaster set buyer_address=#{buyer_address} where SDSalShipMasterBillNo=#{sdSalShipMasterBillNo} and pick_no=#{pick_no}")
    void update(@Param("sdSalShipMasterBillNo") String sdSalShipMasterBillNo, @Param("pick_no")String pick_no, @Param("buyer_address") String buyer_address);


    @Update("  update SD_Inv_MoveReqMaster set Address=#{buyer_address} where BillNo=#{sdSalShipMasterBillNo}")
    void updateSDMRM(@Param("sdSalShipMasterBillNo")String sdSalShipMasterBillNo, @Param("buyer_address") String buyer_address);
}
