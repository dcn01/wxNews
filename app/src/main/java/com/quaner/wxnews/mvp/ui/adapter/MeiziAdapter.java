package com.quaner.wxnews.mvp.ui.adapter;

import android.support.annotation.Nullable;
import android.support.v7.widget.CardView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.quaner.wxnews.R;
import com.quaner.wxnews.mvp.ui.entity.GankEntity;
import com.wxandroid.common.widget.ScaleImageView;

import java.util.List;

/**
 * Created by wenxin
 */
public class MeiziAdapter extends BaseQuickAdapter<GankEntity, BaseViewHolder> {


    public MeiziAdapter(@Nullable List<GankEntity> data) {
        super(R.layout.item_meizi, data);
    }

    @Override
    protected void convert(BaseViewHolder helper, final GankEntity item) {
        final CardView cardView = helper.getView(R.id.cardView);
        final ScaleImageView imageView = helper.getView(R.id.iv_photo);
        imageView.setOriginalSize(item.getItemWidth(),item.getItemHeight());
        Glide.with(mContext).load(item.getUrl())
                .placeholder(R.color.white)
                .diskCacheStrategy(DiskCacheStrategy.ALL)
                .into(imageView);
    }
}
