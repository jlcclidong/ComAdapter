package com.eason.comadapter.utils;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by cclej on 2017/5/31.
 */

public class ActivityUtils {
    public static void addFragment(AppCompatActivity activity, int id, Fragment view){
        FragmentTransaction fragmentTransaction = activity.getSupportFragmentManager().beginTransaction();
        fragmentTransaction.add(id, view).commit();
    }
}
