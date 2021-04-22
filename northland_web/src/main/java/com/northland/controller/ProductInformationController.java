package com.northland.controller;

import com.alibaba.excel.ExcelWriter;
import com.alibaba.excel.metadata.Sheet;
import com.alibaba.excel.support.ExcelTypeEnum;
import com.github.pagehelper.PageInfo;
import com.northland.dao.IProductInformationDao;
import com.northland.domain.ProductInformation;
import com.northland.domain.ProductInformation_ExCEL;
import com.northland.service.IProductInformationService;
import com.northland.utils.ExcelUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;


import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Objects;

@RequestMapping("ProductInformation")
@Controller
public class ProductInformationController {

    @Autowired
    private IProductInformationService iProductInformationService;

    @Autowired
    IProductInformationDao iProductInformationDao;

    public static List<ProductInformation> listForExcel = new ArrayList<>();

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
    @RequestMapping("/getAll1.do")
    public ModelAndView findAll(@RequestParam(name = "page", required = true, defaultValue = "1") int page, @RequestParam(name = "size", required = true, defaultValue = "10") int size) throws Exception {
        ModelAndView mv = new ModelAndView();
        List<ProductInformation> allList = iProductInformationService.findAll(page, size);
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

    /**
     * 条件查询  TODO
     * 记录按条件查询后的所有数据，
     * 用于Excel导出
     * @return
     * @throws Exception
     */
    @RequestMapping("/getAll.do")
    public ModelAndView findBy(@RequestParam(name = "SeriesName", required = false)String SeriesName,@RequestParam(name = "StyleCode", required = false) String StyleCode,
                                 @RequestParam(name = "MaterialShortName", required = false) String MaterialShortName,@RequestParam(name = "brand", required = false)List brand,
                                  @RequestParam(name = "yearNo", required = false) List yearNo,@RequestParam(name = "seasonName", required = false) List seasonName,
                                   @RequestParam(name = "sexName", required = false) List sexName,@RequestParam(name = "commoditylevelname", required = false) List commoditylevelname) throws Exception {
        ModelAndView mv = new ModelAndView();

        try {
            if (SeriesName != null) {
                SeriesName = SeriesName.replace(",", "").trim();
            }

            if (MaterialShortName != null) {
                MaterialShortName = MaterialShortName.replace(",", "").trim();
            }
            if (StyleCode != null) {
                StyleCode = StyleCode.replace(",", "").trim();
            }
            if (brand != null) {
                brand.remove("");
            }
            if (yearNo != null) {
                yearNo.remove("");
            }
            if (sexName != null) {
                sexName.remove("");
            }
            if (seasonName != null) {
                seasonName.remove("");
            }
            if (commoditylevelname != null) {
                commoditylevelname.remove("");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        List<ProductInformation> allList = iProductInformationService.findByCondition(SeriesName,MaterialShortName,StyleCode,brand,
                yearNo,sexName,seasonName,commoditylevelname);
            listForExcel=allList;
        PageInfo pageInfo = new PageInfo(allList);
        mv.addObject("pageInfo", pageInfo);
        mv.setViewName("productInformation");
        return mv;
    }

    @RequestMapping("/ExportExcel.do")
    public void export(HttpServletResponse response,
                       @RequestParam(name = "SeriesName", required = false)String SeriesName,@RequestParam(name = "StyleCode", required = false) String StyleCode,
                       @RequestParam(name = "MaterialShortName", required = false) String MaterialShortName,@RequestParam(name = "brand", required = false)List brand,
                       @RequestParam(name = "yearNo", required = false) List yearNo,@RequestParam(name = "seasonName", required = false) List seasonName,
                       @RequestParam(name = "sexName", required = false) List sexName,@RequestParam(name = "commoditylevelname", required = false) List commoditylevelname
                           ) throws Exception {
        ServletOutputStream out = response.getOutputStream();
        ExcelWriter writer = new ExcelWriter(out, ExcelTypeEnum.XLSX, true);
        String fileName = "货品资料";
        Sheet sheet = new Sheet(1, 0,ProductInformation.class);
        //设置自适应宽度
        sheet.setAutoWidth(Boolean.TRUE);
        // 第一个 sheet 名称
        sheet.setSheetName("货品资料");
          if(listForExcel.toArray().length==0){
            writer.write(null, sheet);
        }else {
            writer.write(listForExcel, sheet);
            listForExcel.clear();
        }
        //通知浏览器以附件的形式下载处理，设置返回头要注意文件名有中文
        response.setHeader("Content-disposition", "attachment;filename=" + new String( fileName.getBytes("gb2312"), "ISO8859-1" ) + ".xlsx");
        writer.finish();
        response.setContentType("multipart/form-data");
        response.setCharacterEncoding("utf-8");
        out.flush();
    }

    @RequestMapping("/ExportAllExcel.do")
    public void export(HttpServletResponse response) throws Exception {
        ServletOutputStream out = response.getOutputStream();
        ExcelWriter writer = new ExcelWriter(out, ExcelTypeEnum.XLSX, true);
        String fileName = "货品资料";
        Sheet sheet = new Sheet(1, 0,ProductInformation.class);
        //设置自适应宽度
        sheet.setAutoWidth(Boolean.TRUE);
        // 第一个 sheet 名称
        sheet.setSheetName("货品资料");
        writer.write(iProductInformationService.findExcel(), sheet);
        //通知浏览器以附件的形式下载处理，设置返回头要注意文件名有中文
        response.setHeader("Content-disposition", "attachment;filename=" + new String( fileName.getBytes("gb2312"), "ISO8859-1" ) + ".xlsx");
        writer.finish();
        response.setContentType("multipart/form-data");
        response.setCharacterEncoding("utf-8");
        out.flush();
    }
}
