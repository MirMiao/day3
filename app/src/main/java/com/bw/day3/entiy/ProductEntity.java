package com.bw.day3.entiy;

import java.util.List;

/**
 * 时间 :2019/12/1  19:20
 * 作者 :苗恒
 * 功能 :
 */
public class ProductEntity {

    public String message;
    public String status;


    public List<Product> result;
    public static class Product{
        public String commodityId;
        public String commodityName;
        public String masterPic;
        public String price;
        public String saleNum;
    }
}
