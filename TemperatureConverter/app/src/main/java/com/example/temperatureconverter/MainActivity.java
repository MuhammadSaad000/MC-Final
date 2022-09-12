package com.example.temperatureconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    Button submit;
    EditText inTemp;
    ToggleButton toggle;
    Double a;
    

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        inTemp=(EditText) findViewById(R.id.editText);
        submit=(Button) findViewById(R.id.button);
        toggle=(ToggleButton) findViewById(R.id.toggleButton);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(inTemp.getText().toString().isEmpty())
                {
                    Toast.makeText(MainActivity.this,"Please enter the temperature",Toast.LENGTH_SHORT).show();
                }

                else if(toggle.isChecked())
                {
                    a=Double.parseDouble(String.valueOf(inTemp.getText()));
                    Double b=a*9/5+32;
                    String r=String.valueOf(b);
                    Toast.makeText(MainActivity.this,r+"°F",Toast.LENGTH_SHORT).show();
                }

                else
                {
                    a=Double.parseDouble(String.valueOf(inTemp.getText()));
                    Double b=a-32;
                    Double c=b*5/9;
                    String r=String.valueOf(c);
                    Toast.makeText(MainActivity.this,r+"°C",Toast.LENGTH_SHORT).show();
                }
            }
        });


    }

}