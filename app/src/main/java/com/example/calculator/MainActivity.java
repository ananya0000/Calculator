package com.example.calculator;
  

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {
    double v;
    TextView result;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText input = findViewById(R.id.input);
        Button Calculate = findViewById(R.id.btn);
        result = findViewById(R.id.result);
        Calculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String inputVal =  input.getText().toString();
                if(input.getText().toString()==null||input.getText().toString().trim().equals(" "))
                    Toast.makeText(getBaseContext(),"Invalid Input",Toast.LENGTH_LONG).show();
                v = Double.parseDouble(inputVal);
                calculate(v);
            }
        });
    }


    void calculate(double v)
    {
        double c = 3*(Math.pow(10,8));
        double l = 1/(Math.sqrt(1-((v*v)/(c*c))));
        result.setText(String.valueOf(l));
    }
}
