package com.bw.day3.model;

import com.bw.day3.utils.NetUtils;

/**
 * 时间 :2019/12/1  19:22
 * 作者 :苗恒
 * 功能 :
 */
public class ProductModel {
     public void getProductList(String url, final ModelCallBack modelCallBack){
         NetUtils.getInstance().getJson(url, new NetUtils.MyCallBack() {
             @Override
             public void onGetJson(String json) {
                 if (modelCallBack != null) {
                      modelCallBack.getjson(json); //回调出去,给调用者
                 }
             }
         });

     }
     public interface ModelCallBack{
         void getjson(String result);
     }
}
