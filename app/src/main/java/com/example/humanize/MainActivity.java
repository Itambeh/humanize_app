package com.example.humanize;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {


    Button doa,  grup;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       grup = (Button) findViewById(R.id.grup);
        doa = (Button) findViewById(R.id.doa);

        doa. setOnClickListener((View) ->{
            startActivity(new Intent(MainActivity.this, donations.class));
        });

        grup. setOnClickListener((View) ->{

        });

    }

}