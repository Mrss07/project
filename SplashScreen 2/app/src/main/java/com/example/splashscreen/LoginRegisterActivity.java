package com.example.splashscreen;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;

public class LoginRegisterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_register);
    }

    // Called when the user taps the Register button
    public void onRegisterClick(View view) {
        Intent intent = new Intent(this, RegistrationActivity.class);
        startActivity(intent);
    }

    // Placeholder for the login button click event
    public void onLoginClick(View view) {
        // Future implementation for login
        // Intent intent = new Intent(this, LoginActivity.class);
        // startActivity(intent);
    }
}

