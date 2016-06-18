package com.jcodecraeer.xrecyclerview;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;

/***
 * * @description
 * * 由 马君 创建于 2016年02月19日 20:53
 ***/
public class RecyclerHolder extends RecyclerView.ViewHolder {

    public RecyclerHolder(View itemView) {
        super(itemView);
    }

    public RecyclerHolder(Context context, int id){
        super(LayoutInflater.from(context).inflate(id,null));
    }

    public <T extends View> T $(int id){
        return (T) itemView.findViewById(id);
    }
}
