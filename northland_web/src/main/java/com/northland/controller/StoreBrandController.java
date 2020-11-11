package com.northland.controller;

import com.northland.domain.StoreBrand;
import com.northland.service.IStoreBrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;


/**
 * 店铺与品牌批量关联
 */
@Controller
@RequestMapping("/StoreBrand")
public class StoreBrandController {

    @Autowired
    private IStoreBrandService StoreBrandService;

    /**
     * 通过ShopCode查询店铺信息
     *
     * @param shopCode
     * @return
     * @throws Exception
     */
    @RequestMapping("/findStoreBrandByShopCode.do")
    public ModelAndView findStoreBrandByShopCode(@RequestParam(name = "ShopCode", required = true) String shopCode) throws Exception {
        ModelAndView mv = new ModelAndView();
        List<StoreBrand> storeBrands = StoreBrandService.findStoreBrandByShopCode(shopCode);
        mv.addObject("storeBrands", storeBrands);
        mv.setViewName("StoreBrandChanges");
        return mv;
    }

    /**
     * 详情界面
     *
     * @param shopCode
     * @return
     * @throws Exception
     */
    @RequestMapping("/findByShopCode.do")
    public ModelAndView findByShopID(@RequestParam(name = "shopCode", required = false) String shopCode) throws Exception {
       try{
           if(shopCode != null){
               shopCode = new String(shopCode.getBytes("iso8859-1"),"utf-8");
           }
       }catch (Exception e){
           e.printStackTrace();
       }

        ModelAndView mv = new ModelAndView();
        List<StoreBrand> storeBrandList = StoreBrandService.findByShopID(shopCode);
        mv.addObject("storeBrandList", storeBrandList);
        mv.setViewName("StoreBrandInfo");
        return mv;
    }


//    @RequestMapping("/findByShopCode.do")
//    public ModelAndView findByShopCode() {
//       ModelAndView mv = new ModelAndView();
//       //1、根据店铺代码查
//        StoreBrandService.findByShopCode();
//
//
//       return mv;
//    }

}
