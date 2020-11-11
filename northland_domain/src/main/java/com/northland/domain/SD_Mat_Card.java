package com.northland.domain;


/**
 * 品牌信息
 */
public class SD_Mat_Card {

    private String cardID; // 品牌ID,
    private String cardCode; //品牌代码,
    private String cardName; //品牌简称,
    private String fullName; //品牌全称,
    private String allowUsed; // 允许使用

    public String getCardID() {
        return cardID;
    }

    public void setCardID(String cardID) {
        this.cardID = cardID;
    }

    public String getCardCode() {
        return cardCode;
    }

    public void setCardCode(String cardCode) {
        this.cardCode = cardCode;
    }

    public String getCardName() {
        return cardName;
    }

    public void setCardName(String cardName) {
        this.cardName = cardName;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getAllowUsed() {
        return allowUsed;
    }

    public void setAllowUsed(String allowUsed) {
        this.allowUsed = allowUsed;
    }
}
