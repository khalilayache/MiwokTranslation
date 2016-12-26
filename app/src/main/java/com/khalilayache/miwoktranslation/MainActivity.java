package com.khalilayache.miwoktranslation;

import android.app.Activity;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    Activity currentActivity = this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ViewPager viewPager = (ViewPager) findViewById(R.id.viewpager);

        MiwokFragmentAdapter fragmentAdapter = new MiwokFragmentAdapter(getSupportFragmentManager());

        viewPager.setAdapter(fragmentAdapter);

    }


}
