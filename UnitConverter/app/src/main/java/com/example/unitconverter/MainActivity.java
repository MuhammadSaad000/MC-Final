package com.example.unitconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {

    Spinner spinner1,spinner2;
    EditText inTemp,outTemp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spinner1 = findViewById(R.id.Spinner1);
        spinner2 = findViewById(R.id.Spinner2);
        inTemp = findViewById(R.id.inTemp);
        outTemp = findViewById(R.id.outTemp);

        outTemp.setEnabled(false);

        String[] temps = {"C" , "F", "K"};
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item,temps);
        spinner1.setAdapter(arrayAdapter);
        spinner2.setAdapter(arrayAdapter);





    }
}