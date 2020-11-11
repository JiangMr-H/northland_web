package com.northland.dao;

import com.northland.domain.Role;
import com.northland.domain.SD_Mat_Card;
import com.northland.domain.StoreBrand;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface IStoreBrandDao {

    /**
     * 页面查询
     * @param shopCode
     * @return
     */
    @Select("SELECT b.ShopID,b.ShopCode,b.ShopName,b.ShopFullName,s.StockName FROM [dbo].[Bas_Shop] b \n" +
            " join Bas_Stock s on s.StockID=b.StockID\n" +
            " where b.ShopCode=#{shopCode}")
    List<StoreBrand> findStoreBrandByShopCode(String shopCode);


    /**
     * 详情
     * @param shopCode
     * @return
     */
    @Select(" select b.ShopID,b.ShopCode,b.ShopName,b.ShopFullName,d.FullName,d.CardCode,d.AllowUsed " +
            "from SD_Bas_ShopCard a " +
            "join Bas_Shop b on a.ShopID=b.ShopID join SD_Mat_Card d on a.CardID=d.CardID " +
            "where b.ShopCode=#{shopCode}")
    List<StoreBrand> findByShopID(String shopCode);


    /**
     * 查询店铺没有的品牌
     * @param shopId
     * @return
     */
    @Select("select CardID,CardCode,CardName,FullName,AllowUsed from SD_Mat_Card where CardID Not in (select CardID from SD_Bas_ShopCard  where ShopID=#{shopId})")
    List<SD_Mat_Card> findOtherCardCodes(String shopId);


    /**
     * 品牌信息关联
     */
    @Insert(" insert into SD_Bas_ShopCard(CompanyID,ShopID,MasterSequence,CardID,\n" +
            "\t                            shopInfoID,InvInfoID,AimSpre,AimChoose,AimPepole,\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tAllowUsed,ModifyDTM,NetCardCode,CardCompanyLicensedID,\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tCardCompanyLicensed,BrandShare,IsMainCard)values('BC',#{ShopID},'00001',\n" +
            "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t#{CardID},'','','.000000','.000000','.000000','1',GETDATE(),'','','','.000000','0')")
    void save();

}
