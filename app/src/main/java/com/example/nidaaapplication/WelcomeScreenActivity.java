package com.example.nidaaapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class WelcomeScreenActivity extends AppCompatActivity {

    private Button signUpButton, loginButton, emergencyCallButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_screen);

        initUi();

        signUpButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),SignUpActivity.class));
            }
        });

        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),LoginActivity.class));
            }
        });

        emergencyCallButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),EmergencyCallActivity.class));
            }
        });
    }

    private void initUi(){
        signUpButton = findViewById(R.id.sign_up_button);
        loginButton = findViewById(R.id.login_button);
        emergencyCallButton = findViewById(R.id.emergency_call_button);
    }
}
