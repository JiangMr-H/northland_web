package com.northland.controller;

import com.github.pagehelper.PageInfo;
import com.northland.dao.IProductInformationDao;
import com.northland.domain.ProductInformation;
import com.northland.domain.ProductInformation_ExCEL;
import com.northland.service.IProductInformationService;
import com.northland.utils.ExcelUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;


import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@RequestMapping("ProductInformation")
@Controller
public class ProductInformationController {

    @Autowired
    private IProductInformationService iProductInformationService;

    @Autowired
    IProductInformationDao iProductInformationDao;

    public static List<ProductInformation> productInformationsForExcel=null;

    /**
     * @return
     */
    @RequestMapping("/findBrandName")
    List<ProductInformation> findBrandName() {
        List<ProductInformation> brandName = iProductInformationService.findBrandName();
        return brandName;
    }

    /**
     * @return
     */
    @RequestMapping("/findYearNo")
    List<ProductInformation> findYearNo() {
        List<ProductInformation> yearNo = iProductInformationService.findYearNo();
        return yearNo;
    }

    /**
     * @return
     */
    @RequestMapping("/findSeasonName")
    List<ProductInformation> findSeasonName() {
        List<ProductInformation> seasonName = iProductInformationService.findSeasonName();
        return seasonName;
    }

    /**
     * @return
     */
    @RequestMapping("/findSexName")
    List<ProductInformation> findSexName() {
        List<ProductInformation> sexName = iProductInformationService.findSexName();
        return sexName;
    }

    /**
     * 条件查询  TODO
     * 记录按条件查询后的所有数据，
     * 用于Excel导出
     * @param page
     * @param size
     * @return
     * @throws Exception
     */
    @RequestMapping("/getAll.do")
    public ModelAndView findAll(@RequestParam(name = "page", required = true, defaultValue = "1") int page, @RequestParam(name = "size", required = true, defaultValue = "10") int size) throws Exception {
        ModelAndView mv = new ModelAndView();
        List<ProductInformation> allList = iProductInformationService.findAll(page, size);
        productInformationsForExcel=allList;
        PageInfo pageInfo = new PageInfo(allList);
        mv.addObject("pageInfo", pageInfo);
        mv.setViewName("productInformation");
        return mv;
    }

    /**
     * 分页查询
     * @param page
     * @param size
     * @return
     * @throws Exception
     */
    @RequestMapping("/findPage.do")
    public ModelAndView findPage(@RequestParam(name = "page", required = true, defaultValue = "1") int page, @RequestParam(name = "size", required = true, defaultValue = "10") int size) throws Exception {
        ModelAndView mv = new ModelAndView();
        List<ProductInformation> allList = iProductInformationService.findAll(page, size);
        PageInfo pageInfo = new PageInfo(allList);
        mv.addObject("pageInfo", pageInfo);
        mv.setViewName("productInformation");
        return mv;
    }

    @RequestMapping("/ExportExcel.do")
    @ResponseBody
    public void ExportExcel() {
        Date date = new Date("YYYY-MM-dd HH:mm:ss");
        String filePath = "D:\\Desktop\\货品资料"+ date +".xlsx";
        ExcelUtil.writeWithTemplate(filePath,productInformationsForExcel);
    }


}
