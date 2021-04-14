package com.northland.domain;

import com.alibaba.excel.annotation.ExcelProperty;
import com.alibaba.excel.metadata.BaseRowModel;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

@Data
@EqualsAndHashCode(callSuper = true)
public class ProductInformation extends BaseRowModel {

    /*M.MaterialCode,  M.MaterialName 货品全称, M.MaterialCode 货号, M.StyleCode 款号,
    M.MaterialShortName 货品简称, M.CardName 品牌, M.KindName 类别, M.SeriesName 系列,
    M.SubSeries 子系列, M.ItemName 项目,  '' 主项目, M.SubItem 子项目, M.ModelName 款型, M.YearNo 年份,
    M.SeasonName 季节, M.WholePrice 批发价, M.RetailPrice 零售价, P.CostPrice 计划成本,
    p.NowPrice 货品现值,  M.SexName 性别, M.ColorName 颜色, BU.UnitName 单位,  M.SaleDate 上市日期,
    M.ColorName2 颜色别名, ST.SizeTypeName 尺码类别,Q.SizeSection 计提时间,
    MT.commoditylevelname 是否滚动款,*/
   /* STUFF((SELECT   ',' + SE.SizeName
            FROM  dbo.SD_Mat_Size SE INNER JOIN
            SD_Mat_MaterialSize MMS ON MMS.SizeID = SE.SizeID
            WHERE   MMS.MaterialID = M.MaterialID FOR XML PATH('')), 1, 1, '') 对应尺码,p.QuotePrice 吊牌价*/

    /**
     * value: 表头名称
     * index: 列的号, 0表示第一列
     */
    @ExcelProperty(value = "MaterialCode", index = 0)
    private String materialCode1;
    @ExcelProperty(value = "货品全称", index = 1)
    private String materialName;
    @ExcelProperty(value = "货号", index = 2)
    private String materialCode2;
    @ExcelProperty(value = "款号", index = 3)
    private String styleCode;
    @ExcelProperty(value = "货品简称", index = 4)
    private String materialShortName;
    @ExcelProperty(value = "品牌", index = 5)
    private String cardName;
    @ExcelProperty(value = "类别", index = 6)
    private String kindName;
    @ExcelProperty(value = "系列", index = 7)
    private String seriesName;
    @ExcelProperty(value = "子系列", index = 8)
    private String subSeries;
    @ExcelProperty(value = "项目", index = 9)
    private String itemName;
    @ExcelProperty(value = "主项目", index = 10)
    private String mainProject;
    @ExcelProperty(value = "子项目", index = 11)
    private String subItem;
    @ExcelProperty(value = "款型", index = 12)
    private String modelName;
    @ExcelProperty(value = "年份", index = 13)
    private String yearNo;
    @ExcelProperty(value = "季节", index = 14)
    private String seasonName;
    @ExcelProperty(value = "批发价", index = 15)
    private String wholePrice;
    @ExcelProperty(value = "零售价", index = 16)
    private String retailPrice;
    @ExcelProperty(value = "计划成本", index = 17)
    private String costPrice;
    @ExcelProperty(value = "货品现值", index = 18)
    private String nowPrice;
    @ExcelProperty(value = "性别", index = 19)
    private String sexName;
    @ExcelProperty(value = "颜色", index = 20)
    private String colorName;
    @ExcelProperty(value = "单位", index = 21)
    private String unitName;
    @ExcelProperty(value = "上市日期", index = 22)
    private String saleDate;
    @ExcelProperty(value = "颜色别名", index = 23)
    private String colorName2;
    @ExcelProperty(value = "尺码类别", index = 24)
    private String sizeTypeName;
    @ExcelProperty(value = "计提时间", index = 25)
    private String sizeSection;
    @ExcelProperty(value = "是否滚动款", index = 26)
    private String commodityLevelName;
    @ExcelProperty(value = "对应尺码", index = 27)
    private String correspondingSize;
    @ExcelProperty(value = "吊牌价", index = 28)
    private String quotePrice;









}
