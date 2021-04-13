package com.northland.controller;

import com.github.pagehelper.PageInfo;
import com.northland.domain.ProductInformation;
import com.northland.service.IProductInformationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@RequestMapping("ProductInformation")
@Controller
public class ProductInformationController {

    @Autowired
    private IProductInformationService iProductInformationService;

    /**
     *
     *
     * @return
     */
    @RequestMapping("/findBrandName")
    List<ProductInformation> findBrandName() {
        List<ProductInformation> brandName = iProductInformationService.findBrandName();
        return brandName;
    }

    /**
     *
     * @return
     */
    @RequestMapping("/findYearNo")
    List<ProductInformation> findYearNo() {
        List<ProductInformation> yearNo = iProductInformationService.findYearNo();
        return yearNo;
    }

    /**
     *
     * @return
     */
    @RequestMapping("/findSeasonName")
    List<ProductInformation> findSeasonName() {
        List<ProductInformation> seasonName = iProductInformationService.findSeasonName();
        return seasonName;
    }

    /**
     *
     * @return
     */
    @RequestMapping("/findSexName")
    List<ProductInformation> findSexName() {
        List<ProductInformation> sexName = iProductInformationService.findSexName();
        return sexName;
    }

    @RequestMapping("/getAll.do")
    public ModelAndView findAll(@RequestParam(name = "page",required = true,defaultValue ="1") int page, @RequestParam(name = "size",required = true,defaultValue = "10")int size) throws Exception{
        ModelAndView mv =new ModelAndView();
        List<ProductInformation> allList = iProductInformationService.findAll(page,size);
        PageInfo pageInfo = new PageInfo(allList);
        mv.addObject("pageInfo", pageInfo);
        mv.setViewName("productInformation");
        return mv;
    }


}
