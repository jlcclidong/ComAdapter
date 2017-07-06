package com.eason.rvadapter;

import android.content.Context;
import android.support.annotation.LayoutRes;
import android.support.v7.widget.RecyclerView;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by cclej on 2017/7/6.
 */

public class ViewHolder extends RecyclerView.ViewHolder{
    private Context mContext;
    private View mContentView;
    private SparseArray<View> mViews;

    private ViewHolder(Context context,View itemView ) {
        super(itemView);
        mContext = context;
        mContentView = itemView;
        mViews = new SparseArray<>();
    }

    public ViewHolder createViewHolder(Context context, @LayoutRes int layoutId, ViewGroup parent){
        View itemView = LayoutInflater.from(context).inflate(layoutId, parent, false);
        ViewHolder viewHolder = new ViewHolder(context,itemView);
        return viewHolder;
    }

    public <T extends View> T getView(int id){
        View view = mViews.get(id);
        if (view==null){
            view = mContentView.findViewById(id);
            mViews.put(id,view);
        }
        return (T)view;
    }

    public View getmContentView(){
        return mContentView;
    }

}
