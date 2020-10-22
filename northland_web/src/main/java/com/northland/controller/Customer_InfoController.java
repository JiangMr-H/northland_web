package com.northland.controller;


import com.northland.domain.Customer_Info;
import com.northland.service.Customer_Info_ModifiService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AnonymousAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 *  修改客户信息
 */
@Controller
@RequestMapping("Customer_Info")
public class Customer_InfoController {

    @Autowired
    Customer_Info_ModifiService customer_info_modifiService;

    @RequestMapping("/findByBillNo.do")
    public ModelAndView findByBillNo(@RequestParam(name = "billNo",required = true) String BillNo)throws Exception{

        ModelAndView mv = new ModelAndView();
        List<Customer_Info> Customer_Infos = customer_info_modifiService.findByBillNoList(BillNo);
        mv.addObject("Customer_InfoList",Customer_Infos);
        mv.setViewName("Customer_Infor");
        return mv;
    }

    @RequestMapping("/findByBillNoForUpdate.do")
    public ModelAndView findByBillNoForUpdate(@RequestParam(name = "billNo",required = true) String BillNo)throws Exception{

        ModelAndView mv = new ModelAndView();
        Customer_Info customer_info = customer_info_modifiService.findByBillNoForUpdate(BillNo);

        if(customer_info.getDispatchStatusStr()=="已派单" || customer_info.getDispatchStatusStr()=="已接单"){
            mv.addObject("Message","该订单"+customer_info.getDispatchStatusStr()+",不能再修改地址");
            mv.addObject("Customer_Info",customer_info);
            mv.setViewName("Customer_Info-update2");
        }else {
            mv.addObject("Customer_Info",customer_info);
            mv.setViewName("Customer_Info-update");
        }
        return mv;
    }


    @RequestMapping("/updateCustomer_Info.do")
    public String UpdateCustomer_Info(@RequestParam(name = "billNo",required = true)String BillNo,
                                      @RequestParam(name = "buyerMobileTel",required = true)String BuyerMobileTel,
                                      @RequestParam(name = "consigneeName",required = true)String ConsigneeName,
                                      @RequestParam(name = "province",required = true)String Province,
                                      @RequestParam(name = "city",required = true)String City,
                                      @RequestParam(name = "area",required = true)String Area,
                                      @RequestParam(name = "zipCode",required = true)String ZipCode,
                                      @RequestParam(name = "address",required = true)String Address)
    {
        String Operator =null;
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        if (!(authentication instanceof AnonymousAuthenticationToken)) {
            Operator = authentication.getName();
        }

        Customer_Info customerInfo = customer_info_modifiService.findByBillNoForUpdate(BillNo);
        customer_info_modifiService.InsertCustomer_Info_Log(customerInfo.getBillNo(),
                customerInfo.getBuyerMobileTel(),customerInfo.getConsigneeName(),customerInfo.getProvince(),customerInfo.getCity(),
                customerInfo.getArea(),customerInfo.getZipCode(),customerInfo.getAddress()
                ,BuyerMobileTel,ConsigneeName,Province,City,Area,ZipCode,Address,Operator);
        customer_info_modifiService.UpdateCustomer_Info(BillNo,BuyerMobileTel,ConsigneeName,Province,City,Area,ZipCode,Address);

        return "redirect:findByBillNo.do?billNo="+BillNo;
    }


}
