package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btnPlus, btnMinus,btnDivide,btnMul,btnPow,btnClear ,btnMod;
    EditText n1,n2;
    TextView res;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        n1 = findViewById(R.id.num1);
        n2 = findViewById(R.id.num2);
        res = findViewById(R.id.result);

        //finding buttons
        btnPlus = findViewById(R.id.sum);
        btnMinus = findViewById(R.id.sub);
        btnDivide = findViewById(R.id.div);
        btnMul = findViewById(R.id.mul);
        btnPow = findViewById(R.id.pow);
        btnClear = findViewById(R.id.clr);
        btnMod = findViewById(R.id.mod);



        String s1 = n1.getText().toString();
        String s2 = n2.getText().toString();

        Integer op1 = Integer.parseInt(s1);
        Integer op2 = Integer.parseInt(s2);

        btnPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double f = op1+op2;
                res.setText(Double.toString(f));
            }
        });

        btnPow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double f = Math.pow(op1,op2);
                res.setText(Double.toString(f));
            }
        });

        btnMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double f = op1-op2;
                res.setText(Double.toString(f));
            }
        });

        btnMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double f = op1*op2;
                res.setText(Double.toString(f));
            }
        });

        btnDivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double f = op1/op2;
                res.setText(Double.toString(f));
            }
        });

        btnClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                n1.setText("");
                n2.setText("");
                res.setText("");
            }
        });

        btnMod.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int f = op1%op2;
                res.setText(Integer.toString(f));
            }
        });

    }
}