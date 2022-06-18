package com.example.kidslearner;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.Toast;

public class Quiz extends AppCompatActivity {

    Switch btnCat, btnJeep, btnHen;
    Button submit;
    int score  = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);

        btnCat = findViewById(R.id.btnCat);
        btnCat.setTextOn("Yes");
        btnCat.setTextOff("No");

        btnHen = findViewById(R.id.btnHen);
        btnHen.setTextOff("No");
        btnHen.setTextOn("Yes");

        btnJeep = findViewById(R.id.btnJeep);
        btnJeep.setTextOff("No");
        btnJeep.setTextOn("Yes");


        submit = findViewById(R.id.btnSubmit);
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(btnHen.isChecked() && btnCat.isChecked())
                {
                    Toast.makeText(Quiz.this,"PASSED", Toast.LENGTH_LONG).show();
                }
                else
                {
                    Toast.makeText(Quiz.this,"Failed", Toast.LENGTH_LONG).show();
                }
            }
        });



    }
}