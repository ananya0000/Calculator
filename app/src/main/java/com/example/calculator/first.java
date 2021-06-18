package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class first extends AppCompatActivity implements View.OnClickListener{
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.first);
        textView = (TextView) findViewById(R.id.text);
        Button b1 = findViewById(R.id.button1);
        Button b2 = findViewById(R.id.button2);
        Button b3 = findViewById(R.id.button3);

        b1.setOnClickListener(this);
        b2.setOnClickListener(this);
        b3.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.button1:
                Intent mass = new Intent(this,MainActivity.class);
                startActivity(mass);
                break;
            case R.id.button2:
                Intent mass1 = new Intent(this,third.class);
                startActivity(mass1);
                break;
            case R.id.button3:
                Intent mass2 = new Intent(this,fourth.class);
                startActivity(mass2);
                break;
        }


    }

}




