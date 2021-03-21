package com.example.studentapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.io.BufferedReader;

public class Portal extends AppCompatActivity
{
    TextView btnresult;
    ImageView btnresulti;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.portal);

        btnresult=(TextView) findViewById(R.id.result);
        btnresulti = (ImageView) findViewById(R.id.resulti);
        btnresulti.setImageResource(R.drawable.result);

        btnresult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Portal.this,Result.class);
                startActivity(intent);
            }
        });

        btnresulti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Portal.this,Result.class);
                startActivity(intent);
            }
        });
    }

}
