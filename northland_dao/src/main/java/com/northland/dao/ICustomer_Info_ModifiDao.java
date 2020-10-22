package com.northland.dao;

import com.northland.domain.Customer_Info;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface ICustomer_Info_ModifiDao {

    @Select("select o.BillNo,o.BuyerMobileTel,o.ConsigneeName,o.Province,o.City,o.Area,o.ZipCode,o.Address,o.dispatchStatus from BC_Sal_OrderMaster o where BillNo=#{billNo}")
    List<Customer_Info> findByBillNoList(String billNo);

    @Select("select o.BillNo,o.BuyerMobileTel,o.ConsigneeName,o.Province,o.City,o.Area,o.ZipCode,o.Address,o.dispatchStatus  from BC_Sal_OrderMaster o where BillNo=#{billNo}")
    Customer_Info findByBillNoForUpdate(String billNo);


    @Update("update BC_Sal_OrderMaster set BuyerMobileTel=#{buyerMobileTel},ConsigneeName=#{consigneeName}," +
            "Province=#{province}, City=#{city},Area=#{area},ZipCode=#{zipCode},Address=#{address} where BillNo=#{billNo}")
    void UpdateCustomer_Info(@Param("billNo")String billNo, @Param("buyerMobileTel")String buyerMobileTel,
                             @Param("consigneeName")String consigneeName, @Param("province")String province,
                             @Param("city")String city, @Param("area")String area, @Param("zipCode")String zipCode,
                             @Param("address")String address);


    @Insert("insert into northland_web_CustomerInfo_Log(BillNo,OldBuyerMobileTel,OldConsigneeName,OldProvince,OldCity,OldArea,OldZipCode," +
            "OldAddress,NewBuyerMobileTel,NewConsigneeName,NewProvince,NewCity,NewArea,NewZipCode,NewAddress,UpdateTime,RecordTime,Operator)values(" +
            "#{billNo},#{OldBuyerMobileTel},#{OldConsigneeName},#{OldProvince},#{OldCity},#{OldArea},#{OldZipCode},#{OldAddress},#{buyerMobileTel}," +
            "#{consigneeName},#{province},#{city},#{area},#{zipCode},#{address},getdate(),getdate(),#{operator})")
    void InsertCustomer_Info_Log(@Param("OldBuyerMobileTel")String OldBuyerMobileTel, @Param("OldConsigneeName")String OldConsigneeName, @Param("OldProvince")String OldProvince,
                                 @Param("OldCity")String OldCity, @Param("OldArea")String OldArea, @Param("OldZipCode")String OldZipCode, @Param("OldAddress")String OldAddress,
                                 @Param("billNo")String billNo, @Param("buyerMobileTel")String newBuyerMobileTel,
                                 @Param("consigneeName")String newConsigneeName, @Param("province")String newProvince,
                                 @Param("city")String newCity, @Param("area")String newArea, @Param("zipCode")String newZipCode,
                                 @Param("address")String newAddress, @Param("operator")String operator);




}
