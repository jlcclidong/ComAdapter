package com.eason.comadapter.main;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.eason.comadapter.R;
import com.eason.comadapter.utils.ActivityUtils;

public class MainActivity extends AppCompatActivity {

    private MainFragment mainFragment;
    private MainPresenter mainPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mainFragment = (MainFragment) getSupportFragmentManager().findFragmentById(R.id.frame);
        if (mainFragment == null) {
            mainFragment = MainFragment.newInstance();
            ActivityUtils.addFragment(MainActivity.this, R.id.frame, mainFragment);
        }
        mainPresenter = new MainPresenter(this);
        mainFragment.setPresenter(mainPresenter);
        
    }
}
