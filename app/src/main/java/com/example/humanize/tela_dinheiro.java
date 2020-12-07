package com.example.humanize;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class tela_dinheiro extends AppCompatActivity {


    Button bol,  car, tran;
    EditText val;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_dinheiro);

        val = (EditText) findViewById(R.id.val);
        bol = (Button) findViewById(R.id.bol);
        car = (Button) findViewById(R.id.car);
        tran = (Button) findViewById(R.id.tran);






    }
}