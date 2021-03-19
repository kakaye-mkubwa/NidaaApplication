package com.example.nidaaapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class EmergencyCallActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_emergency_call);

        assert getSupportActionBar() != null;
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}
