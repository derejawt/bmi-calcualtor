package com.example.bmicalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputLayout;

public class MainActivity extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        double mynum=0.0;
        TextView text1 = findViewById(R.id.textView);
        TextInputLayout hi = findViewById(R.id.H);
        TextInputLayout we = findViewById(R.id.W);
        TextView t1 = findViewById(R.id.editTextNumberDecimal);
        Button btn1=findViewById(R.id.button);
        Button btn2=findViewById(R.id.button2);
        EditText h =  findViewById(R.id.hi);
        TextView w = findViewById(R.id.we);
        EditText t2 =findViewById(R.id.editTextNumberDecimal);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double weight=Double.parseDouble(w.getText().toString());
                double heigt=Double.parseDouble(h.getText().toString());
                double bmi = (weight/((heigt/100)*(heigt/100)));
                t1.setText(Double.toString(bmi));


            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               h.setText(Double.toString(mynum));
                w.setText(Double.toString(mynum));
                t2.setText(Double.toString(mynum));


            }
        });

    }
}