package com.londonappbrewery.magiceightball;

import android.support.annotation.IdRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button  askBtn;
        askBtn = (Button) findViewById(R.id.askBtn);

        final ImageView ballDisplay;
        ballDisplay = (ImageView) findViewById(R.id.ballImg);

        /* ftiaksame ena array*/
        final int[] ballArray = {
                R.drawable.ball1,
                R.drawable.ball2,
                R.drawable.ball3,
                R.drawable.ball4,
                R.drawable.ball5
        };

        /*ftiaksame ena koumpi, prepei na tou valoume to listener gia na akouei otan to patame*/
        askBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                /*Etsi ftiaxnoume random numbers*/
                Random randomNumber = new Random();
                int number = randomNumber.nextInt(5);

                ballDisplay.setImageResource(ballArray[number]);

            }
        });


    }
}
