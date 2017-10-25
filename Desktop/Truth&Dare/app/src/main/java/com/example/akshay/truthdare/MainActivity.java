package com.example.akshay.truthdare;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.RotateAnimation;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    Animation rotate_animation;
    ImageView imageView;
    Button button;
    Random r;
    Boolean restart =false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageView=(ImageView)findViewById(R.id.referesh);
        button=(Button)findViewById(R.id.start_rotate);

        r = new Random();

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Bundle bundle = getIntent().getExtras();
                final String type = bundle.getString("type");


                if(restart)
                {
                    RotateAnimation rotateAnimation =new RotateAnimation(r.nextInt() % 360,0 ,
                            RotateAnimation.RELATIVE_TO_SELF, 0.5f,RotateAnimation.RELATIVE_TO_SELF, 0.5f);
                    rotateAnimation.setFillAfter(true);
                    rotateAnimation.setDuration(1000);

                    rotateAnimation.setInterpolator(new AccelerateDecelerateInterpolator());

                    imageView.startAnimation(rotateAnimation);
                    restart =false;
                    button.setText("play");
                }
                else {
                    new Handler().postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            // TODO Auto-generated method stub
                            // Show your dialog here
                            AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
                            //Uncomment the below code to Set the message and title from the strings.xml file
                            //builder.setMessage(R.string.dialog_message) .setTitle(R.string.dialog_title);

                            //Setting message manually and performing action on button click
                            builder.setMessage("select your Task to perform")
                                    .setCancelable(false)
                                    .setPositiveButton("Truth", new DialogInterface.OnClickListener() {
                                        public void onClick(DialogInterface dialog, int id) {
                                            dialog.cancel();


                                            AlertDialog.Builder builder1 = new AlertDialog.Builder(MainActivity.this);
                                            if(type.equals("kids"))
                                            {
                                                String[] array = getApplicationContext().getResources().getStringArray(R.array.Truth_kids);
                                                String randomStr1 = array[new Random().nextInt(array.length)];

                                                builder1.setMessage(randomStr1);
                                                AlertDialog alert = builder1.create();
                                                //Setting the title manually
                                                alert.setTitle("Be Honest");
                                                alert.show();
                                            }
                                            else if(type .equals("kids"))
                                            {
                                                String[] array = getApplicationContext().getResources().getStringArray(R.array.Truth_teen);
                                                String randomStr1 = array[new Random().nextInt(array.length)];

                                                builder1.setMessage(randomStr1);
                                                AlertDialog alert = builder1.create();
                                                //Setting the title manually
                                                alert.setTitle("Be Honest");
                                                alert.show();
                                            }
                                            else if(type.equals("adults"))
                                            {
                                                String[] array = getApplicationContext().getResources().getStringArray(R.array.Truth_Adult);
                                                String randomStr1 = array[new Random().nextInt(array.length)];

                                                builder1.setMessage(randomStr1);
                                                AlertDialog alert = builder1.create();
                                                //Setting the title manually
                                                alert.setTitle("Be Honest");
                                                alert.show();
                                            }

//                                            else
//                                            {
//                                                String[] array = getApplicationContext().getResources().getStringArray(R.array.Truth_Adult);
//                                                String randomStr1 = array[new Random().nextInt(array.length)];
//
//                                                builder1.setMessage(randomStr1);
//                                                AlertDialog alert = builder1.create();
//                                                //Setting the title manually
//                                                alert.setTitle("Be Honest");
//                                                alert.show();
//
//                                            }

                                        }
                                    })
                                    .setNegativeButton("Dare", new DialogInterface.OnClickListener() {
                                        public void onClick(DialogInterface dialog, int id) {
                                            //  Action for 'NO' Button
                                            dialog.cancel();
                                            AlertDialog.Builder builder1 = new AlertDialog.Builder(MainActivity.this);
                                            if(type.equals("kids"))
                                            {
                                                String[] array = getApplicationContext().getResources().getStringArray(R.array.Dare_kids);
                                                String randomStr1 = array[new Random().nextInt(array.length)];

                                                builder1.setMessage(randomStr1);
                                                AlertDialog alert = builder1.create();
                                                //Setting the title manually
                                                alert.setTitle("Be Honest");
                                                alert.show();
                                            }
                                            else if(type .equals("kids"))
                                            {
                                                String[] array = getApplicationContext().getResources().getStringArray(R.array.Dare_teen);
                                                String randomStr1 = array[new Random().nextInt(array.length)];

                                                builder1.setMessage(randomStr1);
                                                AlertDialog alert = builder1.create();
                                                //Setting the title manually
                                                alert.setTitle("Be Honest");
                                                alert.show();
                                            }
                                            else if(type.equals("adults"))
                                            {
                                                String[] array = getApplicationContext().getResources().getStringArray(R.array.Dare_Adult);
                                                String randomStr1 = array[new Random().nextInt(array.length)];

                                                builder1.setMessage(randomStr1);
                                                AlertDialog alert = builder1.create();
                                                //Setting the title manually
                                                alert.setTitle("Be Honest");
                                                alert.show();
                                            }
                                        }
                                    });

                            //Creating dialog box
                            AlertDialog alert = builder.create();
                            //Setting the title manually
                            alert.setTitle("Select Task");
                            alert.show();
                            button.setText("reset");
                        }
                    }, 1500);
                    RotateAnimation rotateAnimation =new RotateAnimation(0, r.nextInt(3600)+ 360,
                            RotateAnimation.RELATIVE_TO_SELF, 0.5f,RotateAnimation.RELATIVE_TO_SELF, 0.5f);
                    rotateAnimation.setFillAfter(true);
                    rotateAnimation.setDuration(1000);

                    rotateAnimation.setInterpolator(new AccelerateDecelerateInterpolator());

                    imageView.startAnimation(rotateAnimation);

                    restart =true;
//


                }

            }
        });




    }
}