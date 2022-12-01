package com.example.shmapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class UserLogin extends AppCompatActivity {

    EditText loginUser, loginPass;
    Button loginButton;
    TextView login,noAcc, logRegister;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_login);

        login=findViewById(R.id.login_textview);
        loginUser=findViewById(R.id.login_username);
        loginPass=findViewById(R.id.login_password);
        loginButton=findViewById(R.id.login_loginButton);
        noAcc=findViewById(R.id.noAcc_textView);
        logRegister=findViewById(R.id.login_registerText);

        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i= new Intent(UserLogin.this,UserHome.class);
                startActivity(i);
            }
        });
        logRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i= new Intent(UserLogin.this, UserRegister.class);
                startActivity(i);
            }
        });


    }
}