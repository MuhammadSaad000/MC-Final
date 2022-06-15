package com.example.kidslearner;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements  View.OnClickListener{

    Button btnLearn,btnQuiz, btnLink;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnLearn = findViewById(R.id.btnLearn);
        btnQuiz = findViewById(R.id.btnQuiz);
        btnLink = findViewById(R.id.btnLink);

        btnLearn.setOnClickListener(this);
        btnQuiz.setOnClickListener(this);
        btnLink.setOnClickListener(this);

    }

    Intent i ;
    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btnLearn:
                i = new Intent(MainActivity.this,learn.class);
                startActivity(i);
                break;
            case R.id.btnQuiz:
                i = new Intent(MainActivity.this, Quiz.class);
                startActivity(i);
                break;
            case R.id.btnLink:
                Uri uri = Uri.parse("https://github.com/MuhammadSaad000/");
                i = new Intent(Intent.ACTION_VIEW , uri);
                startActivity(i);
                break;
        }

    }
}