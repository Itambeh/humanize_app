package com.example.humanize;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class donations extends AppCompatActivity {

    Button roup,  limp, ali, mony;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_donations);

        roup = (Button) findViewById(R.id.roup);
        limp = (Button) findViewById(R.id.limp);
        ali = (Button) findViewById(R.id.ali);
        mony = (Button) findViewById(R.id.mony);


        roup. setOnClickListener((View) ->{
            startActivity(new Intent(donations.this, tela_roupas.class));
        });
        limp. setOnClickListener((View) ->{

        });
        ali. setOnClickListener((View) ->{

        });
        mony. setOnClickListener((View) ->{
            startActivity(new Intent(donations.this, tela_dinheiro.class));
        });
    }
}