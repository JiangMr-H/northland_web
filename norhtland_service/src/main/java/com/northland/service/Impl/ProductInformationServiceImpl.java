package com.northland.service.Impl;

import com.github.pagehelper.PageHelper;
import com.northland.dao.IProductInformationDao;
import com.northland.domain.ProductInformation;
import com.northland.domain.ProductInformation_ExCEL;
import com.northland.service.IProductInformationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductInformationServiceImpl implements IProductInformationService {

    @Autowired
    private IProductInformationDao iProductInformationDao;

    @Override
    public List<ProductInformation> findBrandName() {
        return iProductInformationDao.findBrandName();
    }

    @Override
    public List<ProductInformation> findYearNo() {
        return iProductInformationDao.findYearNo();
    }

    @Override
    public List<ProductInformation> findSeasonName() {
        return iProductInformationDao.findSeasonName();
    }

    @Override
    public List<ProductInformation> findSexName() {
        return iProductInformationDao.findSexName();
    }

    @Override
    public List<ProductInformation> findAll(int page,int size) {
          PageHelper.startPage(page,size);
         return iProductInformationDao.findAll();
    }

    @Override
    public List<ProductInformation> findExcel() throws Exception {
        return iProductInformationDao.findAll();
    }


    @Override
    public List<ProductInformation> findByCondition( String SeriesName, String MaterialShortName, String StyleCode, List brand, List yearNo, List sexName, List seasonName, List commoditylevelname) {
        return iProductInformationDao.findByCondition( SeriesName,  MaterialShortName,  StyleCode,  brand,  yearNo,  sexName,  seasonName,  commoditylevelname);
    }

}
