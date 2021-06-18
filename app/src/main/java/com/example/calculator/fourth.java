package com.example.calculator;


import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class fourth extends Activity {
    int th,tm,ts;
    TextView result1;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fourth);
        EditText input1 = findViewById(R.id.iinput1);
        EditText input2 = findViewById(R.id.iinput2);
        EditText input3 = findViewById(R.id.input3);
        Button Calculate = findViewById(R.id.btton);
        result1 = findViewById(R.id.result1);
        Calculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String inputVal1 =  input1.getText().toString();
                String inputVal2 =  input2.getText().toString();
                String inputVal3 =  input3.getText().toString();
                th = Integer.parseInt(inputVal1);
                tm = Integer.parseInt(inputVal2);
                ts = Integer.parseInt(inputVal3);
                calculate(th,tm,ts);
            }
        });
    }


    void calculate(int th,int tm,int ts)
    { int fact=1;
        for(int i=th;i>=1;i=i-1)
        {
            fact = fact*i;
        }
        double s = fact/((tm*tm*tm)+ts);
        result1.setText(String.valueOf(s));
    }

}
