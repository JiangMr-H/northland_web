package com.northland.service.Impl;

import com.northland.dao.IStoreBrandDao;
import com.northland.domain.StoreBrand;
import com.northland.service.IStoreBrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class StoreBrandServiceImpl implements IStoreBrandService {

    @Autowired
    private IStoreBrandDao storeBrandDao;

    @Override
    public List<StoreBrand> findStoreBrandByShopCode(String shopCode) {
        return storeBrandDao.findStoreBrandByShopCode(shopCode);
    }

    @Override
    public List<StoreBrand> findByShopID(String shopId) {
       return storeBrandDao.findByShopID(shopId);
    }
}
