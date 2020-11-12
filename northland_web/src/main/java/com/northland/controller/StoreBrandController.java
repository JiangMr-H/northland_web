package com.northland.controller;

import com.northland.domain.SD_Mat_Card;
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
     * 通过CardID查询品牌信息
     *
     * @param cardId
     * @return
     * @throws Exception
     */
    @RequestMapping("/findCardByCardId.do")
    public ModelAndView findCardByCardId(@RequestParam(name = "CardID", required = false) String cardId) throws Exception {
        try {
            if (cardId != null) {
                cardId = new String(cardId.getBytes("iso8859-1"), "utf-8");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        ModelAndView mv = new ModelAndView();
        List<SD_Mat_Card> sdMatCard = StoreBrandService.findCardByCardId(cardId);
        mv.addObject("sdMatCard", sdMatCard);
        mv.setViewName("StoreBrandChanges");
        return mv;
    }


    /**
     * 通过ShopCode查询店铺信息
     *
     * @param shopCode
     * @return
     * @throws Exception
     */
    @RequestMapping("/findStoreBrandByShopCode.do")
    public ModelAndView findStoreBrandByShopCode(@RequestParam(name = "ShopCode", required = false) String shopCode) throws Exception {
        try {
            if (shopCode != null) {
                shopCode = new String(shopCode.getBytes("iso8859-1"), "utf-8");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

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
        try {
            if (shopCode != null) {
                shopCode = new String(shopCode.getBytes("iso8859-1"), "utf-8");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        ModelAndView mv = new ModelAndView();
        List<StoreBrand> storeBrandList = StoreBrandService.findByShopID(shopCode);
        mv.addObject("storeBrandList", storeBrandList);
        mv.setViewName("StoreBrandInfo");
        return mv;
    }

    /**
     * 查询店铺以及店铺可以添加的角色
     *
     * @param shopId
     * @return
     * @throws Exception
     */
    @RequestMapping("/findShopByIdAndAllCard.do")
    public ModelAndView findShopByIdAndAllCard(@RequestParam(name = "ShopID", required = false) String shopId,
                                               @RequestParam(name = "shopCode", required = false) String shopCode) throws Exception {
        try {
            if (shopCode != null) {
                shopCode = new String(shopCode.getBytes("iso8859-1"), "utf-8");
            }
            if (shopId != null) {
                shopId = new String(shopId.getBytes("iso8859-1"), "utf-8");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        ModelAndView mv = new ModelAndView();
        //根据店铺ID查询可以添加的品牌
        List<SD_Mat_Card> cards = StoreBrandService.findOtherCardCodes(shopId);
        mv.addObject("shopCode", shopCode);
        mv.addObject("cards", cards);
        mv.setViewName("StoreBrand-add");
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
