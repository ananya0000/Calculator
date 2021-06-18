package com.example.calculator;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.os.VibrationEffect;
import android.os.Vibrator;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;


public class third extends Activity {
    double v;
    double l;
    TextView answer;


    @Override
        protected void onCreate(@Nullable Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.third);
            EditText input1 = findViewById(R.id.input1);
            EditText input2 = findViewById(R.id.input2);
            Button check = findViewById(R.id.bttn);
            answer = findViewById(R.id.a);
            check.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View view) {
                    String inputVal1 =  input1.getText().toString();
                    String inputVal2 =  input2.getText().toString();
                    v = Double.parseDouble(inputVal1);
                    l = Double.parseDouble(inputVal2);
                    Check(v,l);
                }
            });
        }


    @SuppressLint("ResourceAsColor")
    void Check(double v, double l)
    {
        RelativeLayout layout = (RelativeLayout) findViewById(R.id.layt);
        double c = 3*(Math.pow(10,8));
        Vibrator vi = (Vibrator)getSystemService(Context.VIBRATOR_SERVICE);
        double ans = 1/(Math.sqrt(1-((v*v)/(c*c))));
        if(ans==l)
        {
            layout.setBackgroundResource(R.color.holo_green_dark);
        }
        else
        {
            layout.setBackgroundResource(R.color.holo_red_light);
            vi.vibrate(VibrationEffect.createOneShot(500,VibrationEffect.DEFAULT_AMPLITUDE));
        }
        answer.setText(String.valueOf(ans));

    }
}


