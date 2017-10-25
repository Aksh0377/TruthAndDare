package com.example.akshay.truthdare;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Main2Activity extends AppCompatActivity {

    public int SPLASH_TIME_OUT =1500;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent=new Intent(Main2Activity.this,select_category.class);
                startActivity(intent);
                finish();
            }
        },SPLASH_TIME_OUT);

    }
}
