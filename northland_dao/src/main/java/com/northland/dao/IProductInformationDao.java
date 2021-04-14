package com.northland.dao;

import com.northland.domain.ProductInformation;
import com.northland.domain.ProductInformation_ExCEL;
import com.northland.domain.SysLog;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface IProductInformationDao {

    /**
     *
     * @return
     */
    @Select("select CardName  from vwSD_Material group by CardName")
    List<ProductInformation> findBrandName();

    /**
     *
     * @return
     */
    @Select("select YearNo from vwSD_Material group by YearNo")
    List<ProductInformation> findYearNo();

    /**
     *
     * @return
     */
    @Select("select SeasonName from vwSD_Material group by SeasonName")
    List<ProductInformation> findSeasonName();

    /**
     *
     * @return
     */
    @Select("select SexName  from vwSD_Material group by SexName;")
    List<ProductInformation> findSexName();

/*    @Select({"<script>" +
            "select * from VWBC_ZN_Planned_Cost_For_Web where 1=1 " +
            "<if test='CardName != null and CardName != '''> and CardName=#{CardName} </if> " +
            "<if test='YearNo != null and YearNo != '''> and YearNo=#{YearNo} </if> " +
            "<if test='SeasonName != null and SeasonName != '''> and SeasonName=#{SeasonName} </if> " +
            "<if test='SexName != null and SexName != '''> and SexName=#{SexName} </if> " +
            "<if test='commodityLevelName != null and commodityLevelName != '''> and commodityLevelName='%#{commodityLevelName}%' </if>" +
            "<if test='SeriesName != null and SeriesName != '''> and SeriesName like '%${SeriesName}%' </if> " +
            "<if test='StyleCode != null and StyleCode != '''> and StyleCode like '%${StyleCode}%' </if> " +
            "<if test='MaterialShortName != null and MaterialShortName != '''> and MaterialShortName like '%${MaterialShortName}%' </if> " +
            "</script>"})
    List<ProductInformation> findAll(@Param("CardName") String cardName,@Param("YearNo") String yearNo, @Param("SeasonName") String seasonName,
                                      @Param("SexName") String sexName,@Param("commodityLevelName") String commodityLevelName,@Param("SeriesName") String seriesName,
                                     @Param("StyleCode") String styleCode, @Param("MaterialShortName") String materialShortName);*/


    @Select("select * from VWBC_ZN_Planned_Cost_For_Web order by saleDate")
    List<ProductInformation> findAll();

    @Select("select * from VWBC_ZN_Planned_Cost_For_Web order by saleDate")
    List<ProductInformation_ExCEL> findExcel();
}
