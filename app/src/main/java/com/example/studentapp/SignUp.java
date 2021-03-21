package com.example.studentapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class SignUp extends AppCompatActivity {

    Button btnlogin, btnsignupsubmit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.signup);

        btnlogin=(Button) findViewById(R.id.ssigninh);
        btnsignupsubmit=(Button) findViewById(R.id.ssignup);

        btnlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(SignUp.this,LogIn.class);
                startActivity(intent);
            }
        });

        btnsignupsubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(SignUp.this,LogIn.class);
                startActivity(intent);
            }
        });
    }
}
