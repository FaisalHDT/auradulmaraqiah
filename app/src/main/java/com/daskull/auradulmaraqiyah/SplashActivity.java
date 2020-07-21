package com.daskull.auradulmaraqiyah;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class SplashActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                //Merubah activity ke activity lain
                Intent gogetstarted = new Intent(SplashActivity.this, MainActivity.class);
                startActivity(gogetstarted);
                finish();
            }
        }, 1000); // 2000 ms = 2 s
    }
}
