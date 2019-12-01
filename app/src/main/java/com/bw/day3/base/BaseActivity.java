package com.bw.day3.base;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

/**
 * 时间 :2019/12/1  19:03
 * 作者 :苗恒
 * 功能 :
 */
public abstract class BaseActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
         setContentView(bindLayoutId());
         initView();
         initData();
    }

    protected abstract void initData();

    protected abstract void initView();

    protected abstract int bindLayoutId();
    public void showToast(String msg){
        Toast.makeText(this, ""+msg, Toast.LENGTH_SHORT).show();
    }
}
