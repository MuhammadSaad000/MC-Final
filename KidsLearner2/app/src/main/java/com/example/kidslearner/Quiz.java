package com.example.kidslearner;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.Switch;

public class Quiz extends AppCompatActivity {

    Switch btnCat, btnJeep, btnHen;
    Button submit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);

        btnCat = findViewById(R.id.btnCat);
        btnHen = findViewById(R.id.btnHen);
        btnJeep = findViewById(R.id.btnJeep);
        submit = findViewById(R.id.btnSubmit);


    }
}