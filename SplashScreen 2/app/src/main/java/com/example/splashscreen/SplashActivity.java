package com.example.splashscreen;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import androidx.appcompat.app.AppCompatActivity;

public class SplashActivity extends AppCompatActivity {

    private final Handler handler = new Handler();
    private final Runnable runnable = new Runnable() {
        @Override
        public void run() {
            Intent intent = new Intent(SplashActivity.this, LoginRegisterActivity.class);
            startActivity(intent);
            finish();
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        handler.postDelayed(runnable, 5000); // Now 5 seconds delay
    }

    @Override
    protected void onDestroy() {
        handler.removeCallbacks(runnable); // Avoid memory leaks
        super.onDestroy();
    }
}
