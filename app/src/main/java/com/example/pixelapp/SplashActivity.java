package com.example.pixelapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class SplashActivity extends AppCompatActivity {

    private Handler handler = new Handler();


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);


    }

    private Runnable runnable = new Runnable() {
        @Override
        public void run() {
            if (!isFinishing()){
                startActivity(new Intent(getApplicationContext(), MainActivity.class));
                finish();
            }

        }
    };

    @Override
    protected void onResume() {
        super.onResume();
        handler.postDelayed(runnable,  400); //loadtime + 4 second
    }

    @Override
    protected void onPause() {
        super.onPause();
        handler.removeCallbacks(runnable);
    }
}