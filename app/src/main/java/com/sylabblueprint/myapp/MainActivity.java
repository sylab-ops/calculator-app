package com.sylabblueprint.myapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import java.net.Inet4Address;

public class MainActivity extends AppCompatActivity {
    EditText txt1;
    EditText txt2;
    Button btn, btn2, btn3, btn4, btn5, btn6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txt1 = (EditText)findViewById(R.id.val1);
        txt2 = (EditText)findViewById(R.id.val2);
        btn = (Button)findViewById(R.id.add);
        btn2 = (Button)findViewById(R.id.sub);
        btn3 = (Button)findViewById(R.id.mul);
        btn4 = (Button)findViewById(R.id.div);
        btn5 = (Button)findViewById(R.id.mod);
        btn6 = (Button)findViewById(R.id.rem);

        //Addition
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String value1 = txt1.getText().toString();
                String value2 = txt2.getText().toString();
                int v1 = Integer.parseInt(value1);
                int v2 = Integer.parseInt(value2);
                int result = v1 + v2;
                Toast.makeText(getApplicationContext(), String.valueOf(result), Toast.LENGTH_SHORT).show();


            }

        });
        //Subtraction
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String value1 = txt1.getText().toString();
                String value2 = txt2.getText().toString();
                int v1 = Integer.parseInt(value1);
                int v2 = Integer.parseInt(value2);
                int result = (v1 - v2);
                Toast.makeText(getApplicationContext(), String.valueOf(result), Toast.LENGTH_SHORT).show();

            }
        });

        //Multiplication
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String value1 = txt1.getText().toString();
                String value2 = txt2.getText().toString();
                double v1 = Double.parseDouble(value1);
                double v2 = Double.parseDouble(value2);
                double result = v1 * v2;
                Toast.makeText(getApplicationContext(), String.valueOf(result), Toast.LENGTH_SHORT).show();

            }
        });

        //Division
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String value1 = txt1.getText().toString();
                String value2 = txt2.getText().toString();
                float v1 = Float.parseFloat(value1);
                float v2 = Float.parseFloat(value2);
                float result = v1 / v2;
                Toast.makeText(getApplicationContext(), String.valueOf(result), Toast.LENGTH_SHORT).show();

            }
        });

        //modulo
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String value1 = txt1.getText().toString();
                String value2 = txt2.getText().toString();
                double v1 = Double.parseDouble(value1);
                double v2 = Double.parseDouble(value2);
                double result = v1 % v2;
                Toast.makeText(getApplicationContext(), String.valueOf(result), Toast.LENGTH_SHORT).show();

            }
        });

        //remainder
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String value1 = txt1.getText().toString().trim();
                String value2 = txt2.getText().toString();
                double v1 = Double.parseDouble(value1);
                double v2 = Double.parseDouble(value2);
                double result = v1 / v2;
                Toast.makeText(getApplicationContext(), String.valueOf(result), Toast.LENGTH_SHORT).show();

            }
        });

    }

}
