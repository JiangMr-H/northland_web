package com.northland.service;


import com.northland.domain.ProductInformation;
import com.northland.domain.ProductInformation_ExCEL;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface IProductInformationService {

    List<ProductInformation> findBrandName();
    List<ProductInformation> findYearNo();
    List<ProductInformation> findSeasonName();
    List<ProductInformation> findSexName();

    List<ProductInformation> findAll(int page,int size) throws Exception;

    List<ProductInformation> findExcel() throws Exception;

    List<ProductInformation> findByCondition(String SeriesName,String MaterialShortName,String StyleCode,List brand,
                                             List yearNo,List sexName,List seasonName,List commoditylevelname);
}
