package com.northland.service;

import com.northland.domain.StoreBrand;

import java.util.List;

public interface IStoreBrandService {

    List<StoreBrand> findStoreBrandByShopCode(String shopCode);

    List<StoreBrand> findByShopID(String shopId);
}
