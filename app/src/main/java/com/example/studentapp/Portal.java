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
    TextView btnresult, btnattendance, btnnotice;
    ImageView btnresulti, btnattendancei, btnnoticei;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.portal);

        //result
        btnresult=(TextView) findViewById(R.id.result);
        btnresulti = (ImageView) findViewById(R.id.resulti);
        btnresulti.setImageResource(R.drawable.result);


        //attendance
        btnattendance=(TextView) findViewById(R.id.attendance);
        btnattendancei = (ImageView) findViewById(R.id.attendacei);
        btnattendancei.setImageResource(R.drawable.attendance);


        //notice
        btnnotice=(TextView) findViewById(R.id.notice);
        btnnoticei = (ImageView) findViewById(R.id.noticei);
        btnnoticei.setImageResource(R.drawable.notice);



        //result
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



        //attendance
        btnattendance.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Portal.this,Attendance.class);
                startActivity(intent);
            }
        });

        btnattendancei.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Portal.this,Attendance.class);
                startActivity(intent);
            }
        });


        //notice
        btnnotice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Portal.this,Notice.class);
                startActivity(intent);
            }
        });

        btnnoticei.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Portal.this,Notice.class);
                startActivity(intent);
            }
        });
    }

}
