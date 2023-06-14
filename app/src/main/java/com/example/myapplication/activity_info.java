package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class activity_info extends AppCompatActivity {

    private EditText name,surname;
    private Button add;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);
        name=findViewById(R.id.name);
        surname=findViewById(R.id.surname);
        add=findViewById(R.id.button);

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String username=name.getText().toString();
                String usersurname=surname.getText().toString();

                Intent intent=new Intent(activity_info.this,Next_Screen.class);
                intent.putExtra("bilal",username);
                intent.putExtra("pasta",usersurname);
                startActivity(intent);

            }
        });


    }
}