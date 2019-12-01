package com.bw.day3.ui.activity;

import android.view.View;

import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.bw.day3.R;
import com.bw.day3.adapter.ProductAdapter;
import com.bw.day3.api.Api;
import com.bw.day3.base.BaseActivity;
import com.bw.day3.entiy.ProductEntity;
import com.bw.day3.presenter.ProductPresenter;
import com.bw.day3.view.IProductView;
import com.google.gson.Gson;

/**
 * 时间 :2019/12/1  18:58
 * 作者 :苗恒
 * 功能 :
 */
public class ProductActivity extends BaseActivity implements IProductView {

    private RecyclerView recyclerView;
    private ProductPresenter productPresenter;

    @Override
    protected void initData() {
        productPresenter = new ProductPresenter(this);

        String url = Api.PROTUCTOR_URL+"?keyword=1&count=5&page=1";
        //调用获取商品列表的方法
        productPresenter.getProductList(url);
    }

    @Override
    protected void initView() {
         //查询控件id
        recyclerView = findViewById(R.id.rv_product);
        recyclerView.setLayoutManager(new GridLayoutManager(this,1));//网格布局管理
    }

    @Override
    protected int bindLayoutId() {
        return R.layout.activity_product;
    }
    public void success(String result){
        ProductEntity productEntity = new Gson().fromJson(result, ProductEntity.class);
        ProductAdapter productAdapter = new ProductAdapter(this, productEntity.result);
        recyclerView.setAdapter(productAdapter);
        showToast(result);
    }
}
