package com.example.fidyahcalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class Calculator extends AppCompatActivity {

    EditText days;
    RadioGroup radioGroup;
    TextView ans ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);

        days = findViewById(R.id.noofdays);
        radioGroup = findViewById(R.id.radioGroup);
        ans = findViewById(R.id.ans);

        radioGroup.clearCheck();

        //adding listener to the radio group

        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                RadioButton btn  = radioGroup.findViewById(i);
                int index = radioGroup.indexOfChild(btn);
                switch (index){
                    case 0:
                        String txt = days.getText().toString();
                        int n = Integer.parseInt(txt);
                        n = n * 200 * 6;
                        String finalAnswer = Integer.toString(n);
                        ans.setText(finalAnswer);
                        break;
                    case 1:
                        String txtx = days.getText().toString();
                        int nx = Integer.parseInt(txtx);
                        nx = nx * 200 ;
                        String fans = Integer.toString(nx);
                        ans.setText(fans);
                        break;
                    default:
                        ans.setText("");
                        break;
                }
            }
        });




    }
}