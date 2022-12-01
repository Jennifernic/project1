package com.example.shmapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.firebase.firestore.auth.User;

public class UserHome extends AppCompatActivity {

    Button userEvent, userAttend;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_home);
        userAttend=findViewById(R.id.user_attendance);
        userEvent=findViewById(R.id.user_event);

        userEvent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(UserHome.this, UserEvent.class);
                startActivity(i);
            }
        });


    }
}