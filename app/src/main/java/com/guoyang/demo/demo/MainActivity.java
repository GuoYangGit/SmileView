package com.guoyang.demo.demo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.guoyang.smileview.SmileView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ((SmileView) findViewById(R.id.smileView)).setNum(60, 40);
    }
}
