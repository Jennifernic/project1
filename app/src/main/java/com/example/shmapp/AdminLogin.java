//package com.example.shmapp;
//
//
//
//import androidx.appcompat.app.AppCompatActivity;
//
//import android.annotation.SuppressLint;
//import android.content.Intent;
//import android.os.Bundle;
//import android.view.View;
//import android.widget.Button;
//import android.widget.EditText;
//
//public class AdminLogin extends AppCompatActivity {
//    EditText email,password;
//    Button loginBtn,gotoRegister;
//    boolean valid = true;
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_login);
////
////        email = findViewById(R.id.loginEmail);
////        password = findViewById(R.id.loginPassword);
////        loginBtn = findViewById(R.id.loginBtn);
////        gotoRegister = findViewById(R.id.gotoRegister);
//
////        checkField(email);
////        checkField(password);
//
//
//
//        gotoRegister.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                startActivity(new Intent(getApplicationContext(),AdminRegister.class));
//            }
//        });
//
//
//
//
//
//    }
//
//    public boolean checkField(EditText textField){
//        if(textField.getText().toString().isEmpty()){
//            textField.setError("Error");
//            valid = false;
//        }else {
//            valid = true;
//        }
//
//        return valid;
//    }
//}