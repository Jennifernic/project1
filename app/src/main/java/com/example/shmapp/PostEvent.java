package com.example.shmapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.firestore.FirebaseFirestore;

public class PostEvent extends AppCompatActivity {

    EditText event_name, event_location,event_date, event_time, event_form;
    Button event_post_button;
//    boolean valid = true;
//    FirebaseAuth fAuth;
//    FirebaseFirestore fStore;

    DatabaseReference studentDbRef;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_post_event);

        event_name = findViewById(R.id.event_name);
        event_location = findViewById(R.id.event_location);
        event_date = findViewById(R.id.event_date);
        event_time = findViewById(R.id.event_time);
        event_form = findViewById(R.id.event_form);
        event_post_button = findViewById(R.id.event_post_button);

        studentDbRef = FirebaseDatabase.getInstance().getReference().child("postEvents");

        event_post_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                insertStudentData();
            }
        });


    }

    private void insertStudentData() {
        String name= event_name.getText().toString();
        String location=event_location.getText().toString();
        String date=event_date.getText().toString();
        String time=event_time.getText().toString();
        String form=event_form.getText().toString();

        PostData postData = new PostData(name,location,date,time,form);

        studentDbRef.push().setValue(postData);
        Toast.makeText(this, "Data Inserted", Toast.LENGTH_SHORT).show();

    }
}