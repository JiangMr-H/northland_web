package com.northland.service.Impl;

import com.northland.dao.ICustomer_Info_ModifiDao;
import com.northland.domain.Customer_Info;
import com.northland.service.Customer_Info_ModifiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class Customer_Info_ModifiServiceImpl implements Customer_Info_ModifiService {

    @Autowired
    private ICustomer_Info_ModifiDao iCustomer_info_modifiDao;

    @Override
    public List<Customer_Info> findByBillNoList(String billNo) {
        return iCustomer_info_modifiDao.findByBillNoList(billNo);
    }

    @Override
    public Customer_Info findByBillNoForUpdate(String billNo) {
        return iCustomer_info_modifiDao.findByBillNoForUpdate(billNo);
    }

    @Override
    public void UpdateCustomer_Info(String billNo, String buyerMobileTel, String consigneeName, String province, String city, String area, String zipCode, String address) {
        iCustomer_info_modifiDao.UpdateCustomer_Info(billNo,buyerMobileTel,consigneeName,province,city,area,zipCode,address);
    }

    @Override
    public void InsertCustomer_Info_Log(String billNo, String buyerMobileTel, String consigneeName, String province, String city, String area, String zipCode,
                                        String address, String NewBuyerMobileTel, String NewConsigneeName, String NewProvince, String NewCity, String NewArea, String NewZipCode, String NewAddress, String operator) {
        iCustomer_info_modifiDao.InsertCustomer_Info_Log(billNo,buyerMobileTel,consigneeName,province,city,area,zipCode,address,NewBuyerMobileTel,NewConsigneeName
                ,NewProvince,NewCity,NewArea,NewZipCode,NewAddress,operator);
    }


}
