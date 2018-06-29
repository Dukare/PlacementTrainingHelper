package com.example.shubham.placementtraininghelper;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Menu extends AppCompatActivity {
 TextView Interview,Resume,GD,Apt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        Interview=(TextView)findViewById(R.id.interview);
        Resume=(TextView)findViewById(R.id.resume);
        GD=(TextView)findViewById(R.id.GD);
        Apt=(TextView)findViewById(R.id.aptitude);

        Apt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
              Intent i =new Intent(getApplicationContext(),aptitext.class);
              startActivity(i);
            }
        });
        Resume.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                  Intent i=new Intent(getApplicationContext(),ResumeText.class);
                  startActivity(i);
            }
        });
        GD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(getApplicationContext(),GroupDiscussiontext.class);
                startActivity(i);
            }
        });
        Interview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(getApplicationContext(),Interviewtext.class);
                startActivity(i);
            }
        });
    }
}
