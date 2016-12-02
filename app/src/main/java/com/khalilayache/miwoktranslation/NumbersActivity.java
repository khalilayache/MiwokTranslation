package com.khalilayache.miwoktranslation;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.LinearLayout;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;

/**
 @author by USUARIO
 @since 01/12/2016
 @version 1
 **/
public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);

        ArrayList<String> words = new ArrayList<>();

        words.add(getString(R.string.one));
        words.add(getString(R.string.two));
        words.add(getString(R.string.three));
        words.add(getString(R.string.four));
        words.add(getString(R.string.five));
        words.add(getString(R.string.six));
        words.add(getString(R.string.seven));
        words.add(getString(R.string.eight));
        words.add(getString(R.string.nine));
        words.add(getString(R.string.ten));


        LinearLayout rootView = (LinearLayout) findViewById(R.id.rootView);

        for(int i = 0; i < words.size(); i++){
            TextView textView = new TextView(this);
            textView.setText(words.get(i));
            rootView.addView(textView);
        }

    }
}
