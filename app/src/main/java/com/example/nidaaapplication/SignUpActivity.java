package com.example.nidaaapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class SignUpActivity extends AppCompatActivity {

    private Button signUpButton;
    private EditText fullNameEditText, emailEditText,phoneNumberEditText,passwordEditText,bloodTypeEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        initUI();

        signUpButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                performSignUp();
            }
        });
    }

    private void initUI(){
        signUpButton = findViewById(R.id.sign_up_button);
        fullNameEditText = findViewById(R.id.fullNameEditText);
        emailEditText = findViewById(R.id.emailEditText);
        phoneNumberEditText = findViewById(R.id.phoneNumberEditText);
        passwordEditText = findViewById(R.id.passwordEditText);
        bloodTypeEditText = findViewById(R.id.bloodTypeEditText);
    }

    private void performSignUp(){
        String fullName = fullNameEditText.getText().toString();
        String email = emailEditText.getText().toString();
        String phoneNumber = phoneNumberEditText.getText().toString();
        String password = passwordEditText.getText().toString();
        String bloodType = bloodTypeEditText.getText().toString();

        if (fullName.isEmpty() || email.isEmpty() || phoneNumber.isEmpty() || password.isEmpty() || bloodType.isEmpty()){
            Toast.makeText(this, "All fields are required", Toast.LENGTH_SHORT).show();
        }else{
            UserModel userModel = new UserModel(fullName,phoneNumber,email,bloodType,password);
            DataProvider dataProvider = DataProvider.getInstance();
            int signUpResponse = dataProvider.signUpUser(userModel);

            if (signUpResponse == 1){
                startActivity(new Intent(getApplicationContext(),HomeActivity.class));
                finish();
            }else{
                Toast.makeText(this, "Sign Up attempt failed", Toast.LENGTH_SHORT).show();
            }
        }
    }
}
