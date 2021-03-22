package com.example.studentapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class LogIn extends AppCompatActivity {

    Button btnsignup, btnloginsubmit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);


        btnsignup=(Button) findViewById(R.id.lsignuph);
        btnloginsubmit=(Button) findViewById(R.id.llogin);

        btnsignup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(LogIn.this,SignUp.class);
                startActivity(intent);
            }
        });

        btnloginsubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(LogIn.this,Portal.class);
                startActivity(intent);
            }
        });
    }
}
