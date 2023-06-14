package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Next_Screen extends AppCompatActivity {

    private TextView name,surname;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_next_screen);
//
//        name=findViewById(R.id.name);
//        surname=findViewById(R.id.surname);
        surname=findViewById(R.id.textView);

        String username=getIntent().getStringExtra("bilal");
        String userSurname=getIntent().getStringExtra("pasta");

        surname.setText(username+"\n"+userSurname);

    }
}