package com.northland.controller;


import com.northland.domain.BC_JIT_PickMaster;
import com.northland.service.IBC_JIT_PickMasterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * 修改JIT、调拨单地址
 */
@Controller
@RequestMapping("BC_JIT_PickMaster")
public class BC_JIT_PickMasterController {

    @Autowired
    private IBC_JIT_PickMasterService ibc_jit_pickMasterService;


    @RequestMapping("/findAllBySDSalShipMasterBillNo.do")
    public ModelAndView findAllBySDSalShipMasterBillNo(@RequestParam(name = "SDSalShipMasterBillNo",required = true) String SDSalShipMasterBillNo)throws Exception{

        ModelAndView mv = new ModelAndView();
        List<BC_JIT_PickMaster> BC_JIT_PickMasters = ibc_jit_pickMasterService.findAllBySDSalShipMasterBillNo(SDSalShipMasterBillNo);
        mv.addObject("BC_JIT_PickMasterList",BC_JIT_PickMasters);
        mv.setViewName("Select");
        return mv;
    }

    @RequestMapping("/findBySD.do")
    public ModelAndView findAllBySD(@RequestParam(name = "SDSalShipMasterBillNo",required = true) String SDSalShipMasterBillNo)throws Exception{

        ModelAndView mv = new ModelAndView();
        BC_JIT_PickMaster BC_JIT_PickMasters = ibc_jit_pickMasterService.findBySD(SDSalShipMasterBillNo);
        mv.addObject("BC_JIT_PickMaster",BC_JIT_PickMasters);
        mv.setViewName("BC_JIT_PickMaster-update");
        return mv;
    }

    @RequestMapping("update.do")
    public String UpdateSDSalShipMasterBill(@RequestParam(name = "SDSalShipMasterBillNo",required = true) String SDSalShipMasterBillNo,
                                                   @RequestParam(name = "pick_no",required = true)String pick_no,
                                                    @RequestParam(name = "buyer_address",required = true)String buyer_address)throws Exception{
        //修改JIT
        ibc_jit_pickMasterService.update(SDSalShipMasterBillNo,pick_no,buyer_address);
        //修改调拨申请单
        ibc_jit_pickMasterService.updateSDMRM(SDSalShipMasterBillNo,buyer_address);

       return "redirect:findAllBySDSalShipMasterBillNo.do?SDSalShipMasterBillNo="+SDSalShipMasterBillNo;

    }

}
