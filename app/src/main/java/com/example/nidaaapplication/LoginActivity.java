package com.example.nidaaapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    private EditText usernameEditText, passwordEditText;
    private Button loginButton;
    private DataProvider dataProvider;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        initUI();

        dataProvider = DataProvider.getInstance();

        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String email = usernameEditText.getText().toString();
                String password = passwordEditText.getText().toString();
                performLogin(email,password);
            }
        });
    }

    private void initUI(){
        usernameEditText = findViewById(R.id.usernameEditText);
        passwordEditText = findViewById(R.id.passwordEditText);
        loginButton = findViewById(R.id.login_button);
    }

    private void performLogin(String email, String password){
        if (dataProvider.fetchLoginData(email,password) == 1){
            startActivity(new Intent(getApplicationContext(),HomeActivity.class));
            finish();
        }else {
            Toast.makeText(this, "Invalid login credentials", Toast.LENGTH_SHORT).show();
        }
    }
}
