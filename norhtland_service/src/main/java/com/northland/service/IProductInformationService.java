package com.northland.service;


import com.northland.domain.ProductInformation;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface IProductInformationService {

    List<ProductInformation> findBrandName();
    List<ProductInformation> findYearNo();
    List<ProductInformation> findSeasonName();
    List<ProductInformation> findSexName();
/*    List<ProductInformation> findAll(String cardName, String yearNo, String seasonName,
                                     String sexName, String commodityLevelName, String seriesName,
                                     String styleCode, String materialShortName);*/

    List<ProductInformation> findAll(int page,int size) throws Exception;
}
