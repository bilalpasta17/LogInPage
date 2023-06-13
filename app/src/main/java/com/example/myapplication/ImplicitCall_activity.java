package com.example.myapplication;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class ImplicitCall_activity extends AppCompatActivity {

    EditText editText_1;
    Button button;

    String number;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_implicit_call);


        editText_1 = findViewById(R.id.edit_text1);
        button = findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                number = editText_1.getText().toString().trim();

                Intent intent = new Intent(Intent.ACTION_CALL, Uri.parse("tel:" + Uri.encode(number)));

                if (ActivityCompat.checkSelfPermission(getApplicationContext(),
                        android.Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                    final String[] PERMISSIONS_STORAGE = {android.Manifest.permission.CALL_PHONE};
                    ActivityCompat.requestPermissions(ImplicitCall_activity.this, PERMISSIONS_STORAGE, 9);
                    Toast.makeText(getApplicationContext(), "Permission Not Granted ", Toast.LENGTH_SHORT).show();
                } else {
                    startActivity(intent);
                }
            }
        });
    }
}











//    //views
//    EditText edit_text1;
//    Button button;
//
//    //to store string variable to store text from edit text
//
//    String number;
//
//
//
//
//
//        //initialize views
//        edit_text1=findViewById(R.id.edit_text1);
//        button=findViewById(R.id.button);
//
//        //button click to dial
//        button.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//
//                //get text from edit text
//                number=edit_text1.getText().toString().trim();
//
//                //dialer intent
//                //uri.encode(string) allows number with * # ssymbols to dial
//
//                Intent intent=new Intent(Intent.ACTION_CALL, Uri.parse("tel:"+Uri.encode(number)));
//
//
//                    if (ActivityCompat.checkSelfPermission(getApplicationContext(),
//                            android.Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
//
//                        final String[] PERMISSIONS_STORAGE = {android.Manifest.permission.CALL_PHONE};
//                        ActivityCompat.requestPermissions(ImplicitCall_activity.this,PERMISSIONS_STORAGE, 9);
//                        Toast.makeText(getApplicationContext(), "Permission Not Granted ", Toast.LENGTH_SHORT).show();
//                    } else {
//                        startActivity(intent);
//                    }
//
//            }
//        });
//    }



