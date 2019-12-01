package com.bw.day3.presenter;

import com.bw.day3.model.ProductModel;
import com.bw.day3.ui.activity.ProductActivity;
import com.bw.day3.view.IProductView;

/**
 * 时间 :2019/12/1  19:35
 * 作者 :苗恒
 * 功能 :  p层    逻辑处理层,,控制器
 */
public class ProductPresenter  {

    private  ProductModel productModel;
      private IProductView iProductView;
    public ProductPresenter(IProductView iProductView){
        productModel = new ProductModel();
        this.iProductView=iProductView;
    }

    public void getProductList(String url){
        if (productModel != null) {
             productModel.getProductList(url, new ProductModel.ModelCallBack() {
                 @Override
                 public void getjson(String result) {
                     iProductView.success(result);
                 }
             });
        }
    }


}
