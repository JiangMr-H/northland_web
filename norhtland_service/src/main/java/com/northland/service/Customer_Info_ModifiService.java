package com.northland.service;

import com.northland.domain.Customer_Info;

import java.util.List;

public interface Customer_Info_ModifiService {

    List<Customer_Info> findByBillNoList(String billNo);

    Customer_Info findByBillNoForUpdate(String billNo);

    void UpdateCustomer_Info(String billNo, String buyerMobileTel, String consigneeName, String province, String city, String area, String zipCode, String address);

    void InsertCustomer_Info_Log(String billNo, String buyerMobileTel, String consigneeName, String province, String city, String area, String zipCode, String address, String NewBuyerMobileTel, String NewConsigneeName, String NewProvince, String NewCity, String NewArea, String NewZipCode, String NewAddress, String operator);

}
