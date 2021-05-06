package com.northland.controller;

import com.northland.dao.IProductInformationDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import static com.northland.controller.ProductInformationController.AllForExcel;

@Component
public class Task {

    @Autowired
    IProductInformationDao iProductInformationDao;

    /**
     * 每30分钟执行一次
     */
    @Scheduled(cron = "0 0/30 * * * ?")
    public void test(){
        AllForExcel.clear();
        AllForExcel = iProductInformationDao.findExcel();
        System.out.println("task定时任务");
    }


}
