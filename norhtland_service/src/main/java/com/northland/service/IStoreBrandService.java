package com.northland.service;

import com.northland.domain.SD_Mat_Card;
import com.northland.domain.StoreBrand;

import java.util.List;

public interface IStoreBrandService {

    List<StoreBrand> findStoreBrandByShopCode(String shopCode);

    List<StoreBrand> findByShopID(String shopId);

    List<SD_Mat_Card> findOtherCardCodes(String shopId);

    List<SD_Mat_Card> findCardByCardName(String cardName);
}
