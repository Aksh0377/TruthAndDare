package com.example.akshay.truthdare;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class select_category extends AppCompatActivity implements View.OnClickListener {

    Button  kids, teens, adult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_category);

        kids=(Button)findViewById(R.id.kids);
        teens=(Button)findViewById(R.id.teens);
        adult=(Button)findViewById(R.id.adult);

        kids.setOnClickListener(this);
        teens.setOnClickListener(this);
        adult.setOnClickListener(this);


    }


    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.kids:

                Intent intent = new Intent(select_category.this,MainActivity.class);
                intent.putExtra("type","kids");
                startActivity(intent);
                break;
            case R.id.teens:
                intent = new Intent(select_category.this, MainActivity.class);
                intent.putExtra("type","teens");
                startActivity(intent);
                break;
            case R.id.adult:
                intent = new Intent(select_category.this, MainActivity.class);
                intent.putExtra("type","adults");
                startActivity(intent);
                break;
            default:

        }
    }}