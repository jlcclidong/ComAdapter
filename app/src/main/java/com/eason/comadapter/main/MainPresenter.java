package com.eason.comadapter.main;

import android.app.Activity;

/**
 * Created by cclej on 2017/7/6.
 */

public class MainPresenter implements MainContract.Presenter {
    private Activity context;

    public MainPresenter(Activity context) {
        this.context = context;
    }

    @Override
    public void start() {

    }

    @Override
    public void normal() {
//        Intent intent = new Intent(context,NormalActivity.class);
    }
}
