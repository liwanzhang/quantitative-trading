package com.zwl.stock.domain;

/**
 * @author zhangwanli
 * @description
 * @date 2018-05-04 下午2:47
 */
public class Stock {

    private String name;//股票名称
    private String code;//股票名称
    private float todayOpenPrice;//今日开盘价
    private float yesterdayClosePrice;//昨日收盘价
    private float currentPrice;//当前价格
    private float dayHighPrice;//今日最高价
    private float dayLowPrice;//今日最低价
    private float bidPrice;//竞买价
    private float auctionPrice;//竞卖价
    private int volume;//成交股数
    private int amount;//成交金额

    private int buyOneNum;//买1手
    private float buyOnePrice;//买1报价
    private int buyTwoNum;//买1手
    private float buyTwoPrice;//买1报价
    private int buyThreeNum;//买1手
    private float buyThreePrice;//买1报价
    private int buyFourNum;//买1手
    private float buyFourPrice;//买1报价
    private int buyFiveNum;//买1手
    private float buyFivePrice;//买1报价

    private int sellOneNum;//卖手
    private float sellOnePrice;//卖报价
    private int sellTwoNum;//卖手
    private float sellTwoPrice;//卖报价
    private int sellThreeNum;//卖手
    private float sellThreePrice;//卖报价
    private int sellFourNum;//卖手
    private float sellFourPrice;//卖报价
    private int sellFiveNum;//卖手
    private float sellFivePrice;//卖报价

    private String date;//日期
    private String time;//时间

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public float getTodayOpenPrice() {
        return todayOpenPrice;
    }

    public void setTodayOpenPrice(float todayOpenPrice) {
        this.todayOpenPrice = todayOpenPrice;
    }

    public float getYesterdayClosePrice() {
        return yesterdayClosePrice;
    }

    public void setYesterdayClosePrice(float yesterdayClosePrice) {
        this.yesterdayClosePrice = yesterdayClosePrice;
    }

    public float getCurrentPrice() {
        return currentPrice;
    }

    public void setCurrentPrice(float currentPrice) {
        this.currentPrice = currentPrice;
    }

    public float getDayHighPrice() {
        return dayHighPrice;
    }

    public void setDayHighPrice(float dayHighPrice) {
        this.dayHighPrice = dayHighPrice;
    }

    public float getDayLowPrice() {
        return dayLowPrice;
    }

    public void setDayLowPrice(float dayLowPrice) {
        this.dayLowPrice = dayLowPrice;
    }

    public float getBidPrice() {
        return bidPrice;
    }

    public void setBidPrice(float bidPrice) {
        this.bidPrice = bidPrice;
    }

    public float getAuctionPrice() {
        return auctionPrice;
    }

    public void setAuctionPrice(float auctionPrice) {
        this.auctionPrice = auctionPrice;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public int getBuyOneNum() {
        return buyOneNum;
    }

    public void setBuyOneNum(int buyOneNum) {
        this.buyOneNum = buyOneNum;
    }

    public float getBuyOnePrice() {
        return buyOnePrice;
    }

    public void setBuyOnePrice(float buyOnePrice) {
        this.buyOnePrice = buyOnePrice;
    }

    public int getBuyTwoNum() {
        return buyTwoNum;
    }

    public void setBuyTwoNum(int buyTwoNum) {
        this.buyTwoNum = buyTwoNum;
    }

    public float getBuyTwoPrice() {
        return buyTwoPrice;
    }

    public void setBuyTwoPrice(float buyTwoPrice) {
        this.buyTwoPrice = buyTwoPrice;
    }

    public int getBuyThreeNum() {
        return buyThreeNum;
    }

    public void setBuyThreeNum(int buyThreeNum) {
        this.buyThreeNum = buyThreeNum;
    }

    public float getBuyThreePrice() {
        return buyThreePrice;
    }

    public void setBuyThreePrice(float buyThreePrice) {
        this.buyThreePrice = buyThreePrice;
    }

    public int getBuyFourNum() {
        return buyFourNum;
    }

    public void setBuyFourNum(int buyFourNum) {
        this.buyFourNum = buyFourNum;
    }

    public float getBuyFourPrice() {
        return buyFourPrice;
    }

    public void setBuyFourPrice(float buyFourPrice) {
        this.buyFourPrice = buyFourPrice;
    }

    public int getBuyFiveNum() {
        return buyFiveNum;
    }

    public void setBuyFiveNum(int buyFiveNum) {
        this.buyFiveNum = buyFiveNum;
    }

    public float getBuyFivePrice() {
        return buyFivePrice;
    }

    public void setBuyFivePrice(float buyFivePrice) {
        this.buyFivePrice = buyFivePrice;
    }

    public int getSellOneNum() {
        return sellOneNum;
    }

    public void setSellOneNum(int sellOneNum) {
        this.sellOneNum = sellOneNum;
    }

    public float getSellOnePrice() {
        return sellOnePrice;
    }

    public void setSellOnePrice(float sellOnePrice) {
        this.sellOnePrice = sellOnePrice;
    }

    public int getSellTwoNum() {
        return sellTwoNum;
    }

    public void setSellTwoNum(int sellTwoNum) {
        this.sellTwoNum = sellTwoNum;
    }

    public float getSellTwoPrice() {
        return sellTwoPrice;
    }

    public void setSellTwoPrice(float sellTwoPrice) {
        this.sellTwoPrice = sellTwoPrice;
    }

    public int getSellThreeNum() {
        return sellThreeNum;
    }

    public void setSellThreeNum(int sellThreeNum) {
        this.sellThreeNum = sellThreeNum;
    }

    public float getSellThreePrice() {
        return sellThreePrice;
    }

    public void setSellThreePrice(float sellThreePrice) {
        this.sellThreePrice = sellThreePrice;
    }

    public int getSellFourNum() {
        return sellFourNum;
    }

    public void setSellFourNum(int sellFourNum) {
        this.sellFourNum = sellFourNum;
    }

    public float getSellFourPrice() {
        return sellFourPrice;
    }

    public void setSellFourPrice(float sellFourPrice) {
        this.sellFourPrice = sellFourPrice;
    }

    public int getSellFiveNum() {
        return sellFiveNum;
    }

    public void setSellFiveNum(int sellFiveNum) {
        this.sellFiveNum = sellFiveNum;
    }

    public float getSellFivePrice() {
        return sellFivePrice;
    }

    public void setSellFivePrice(float sellFivePrice) {
        this.sellFivePrice = sellFivePrice;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
}


