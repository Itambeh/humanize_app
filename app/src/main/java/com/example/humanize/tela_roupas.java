package com.example.humanize;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.service.autofill.TextValueSanitizer;
import android.widget.Button;
import android.widget.TextView;

public class tela_roupas extends AppCompatActivity {

    Button l1,  l2, l3;
    TextView tv1, tv2, tv3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_roupas);



        l1 = (Button) findViewById(R.id.l1);
        l2 = (Button) findViewById(R.id.l2);
        l3 = (Button) findViewById(R.id.l3);


        l1. setOnClickListener((View) ->{

        });
        l2. setOnClickListener((View) ->{

        });
        l3. setOnClickListener((View) ->{
    });

    }
}