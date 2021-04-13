package com.northland.domain;

import lombok.Data;

import java.util.List;

@Data
public class ProductInformation {

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

    private String materialCode;
    private String materialName;
    private String styleCode;
    private String materialShortName;
    private String cardName;
    private String kindName;
    private String seriesName;
    private String subSeries;
    private String itemName;
    private String mainProject;
    private String subItem;
    private String modelName;
    private String yearNo;
    private String seasonName;
    private String wholePrice;
    private String retailPrice;
    private String costPrice;
    private String nowPrice;
    private String sexName;
    private String colorName;
    private String unitName;
    private String saleDate;
    private String colorName2;
    private String sizeTypeName;
    private String sizeSection;
    private String commodityLevelName;
    private String correspondingSize;
    private String quotePrice;










}
