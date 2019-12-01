package com.bw.day3.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bw.day3.R;
import com.bw.day3.entiy.ProductEntity;
import com.bw.day3.ui.activity.ProductActivity;

import java.util.List;

/**
 * 时间 :2019/12/1  19:51
 * 作者 :苗恒
 * 功能 :
 */
public class ProductAdapter extends RecyclerView.Adapter<ProductAdapter.ViewHolder> {
    Context context;
    List<ProductEntity.Product> result;
    public ProductAdapter(Context context, List<ProductEntity.Product> result) {
        this.context=context;
        this.result=result;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.product_item_layout, parent, false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
      //标题展示
        holder.textView.setText(result.get(position).commodityName);
        //图片展示
        Glide.with(context).load(result.get(position).masterPic).into(holder.imageView);
    }

    @Override
    public int getItemCount() {
        return result.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder{

        private final ImageView imageView;
        private final TextView textView;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.iv_product);
            textView = itemView.findViewById(R.id.tv_title);
        }
    }
}
