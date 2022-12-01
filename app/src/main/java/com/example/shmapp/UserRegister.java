package com.example.shmapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.FirebaseFirestore;

import java.util.HashMap;
import java.util.Map;

public class UserRegister extends AppCompatActivity {

    EditText userEmail, userRegno, userPassword;
    Button registerButton;
    TextView register,noAcc, regLogin;
//    boolean validS = true;
//    FirebaseAuth fAuthS;
//    FirebaseFirestore fStoreS;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_register);

//        fAuthS = FirebaseAuth.getInstance();
//        fStoreS = FirebaseFirestore.getInstance();

       userEmail=findViewById(R.id.register_username);
        userRegno=findViewById(R.id.register_rollNo);
        userPassword=findViewById(R.id.regisgter_pass);
        register=findViewById(R.id.register_textView);
        noAcc=findViewById(R.id.haveAcc_textView);
        regLogin=findViewById(R.id.register_login_textView);
        registerButton=findViewById(R.id.register_button);

        registerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                checkField(userEmail);
//                checkField(userRegno);
//                checkField(userPassword);
//
//                if (validS) {
//                    fAuthS.createUserWithEmailAndPassword(userEmail.getText().toString(), userPassword.getText().toString()).addOnSuccessListener(new OnSuccessListener<AuthResult>() {
//                        @Override
//                        public void onSuccess(AuthResult authResult) {
//                            FirebaseUser students = fAuthS.getCurrentUser();
//                            Toast.makeText(UserRegister.this, "Account created", Toast.LENGTH_SHORT).show();
//                            DocumentReference df = fStoreS.collection("students").document(students.getUid());
//                            Map<String, Object> userInfo = new HashMap<>();
//                            userInfo.put("Email", userEmail.getText().toString());
//                            userInfo.put("RegNo", userRegno.getText().toString());
//                            userInfo.put("Password", userPassword.getText().toString());
//
//                            userInfo.put("isStudent", "1");
//
//                            df.set(userInfo);
//
//
//                            startActivity(new Intent(
//                                    getApplicationContext(), AdLogin.class)
//                            );
//                            finish();
//                        }
//                    }).addOnFailureListener(new OnFailureListener() {
//                        @Override
//                        public void onFailure(@NonNull Exception e) {
//                            Toast.makeText(UserRegister.this, "Failed to create account", Toast.LENGTH_SHORT).show();
//                        }
//                    });
//                }
            }
        });

//                    regLogin.setOnClickListener(new View.OnClickListener() {
//                        @Override
//                        public void onClick(View view) {
//                            startActivity(new Intent(getApplicationContext(), UserLogin.class));
//                        }
//                    });
//
//
                }

//                public boolean checkField (EditText textField){
//                    if (textField.getText().toString().isEmpty()) {
//                        textField.setError("Error");
//                        validS = false;
//                    } else {
//                        validS = true;
//                    }
//
//                    return validS;
//                }
            }
