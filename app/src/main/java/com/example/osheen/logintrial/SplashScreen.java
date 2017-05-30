package com.example.osheen.logintrial;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;

/**
 * Created by Osheen on 5/29/2017.
 */

public class SplashScreen extends Activity{
    private static int SPLASH_TIME_OUT = 3000;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent i = new Intent(SplashScreen.this, MainActivity.class);
                startActivity(i);
            } //end run
        },SPLASH_TIME_OUT); //end new handler
    }// end onCreate
} //end class SplashScreen
