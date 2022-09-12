package com.example.crud_app;

import androidx.appcompat.app.AppCompatActivity;

import android.Manifest;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Switch;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btnAdd,btnViewAll;
    EditText name,rollno;
    Switch isEnrolled;
    ListView students;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnAdd = findViewById(R.id.btnAdd);
        btnViewAll = findViewById(R.id.btnView);
        name = findViewById(R.id.name);
        rollno = findViewById(R.id.rollno);
        isEnrolled = findViewById(R.id.enSwitch);
        students = findViewById(R.id.myList);

        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                try {
                    Student st = new Student(-1, name.getText().toString() ,rollno.getText().toString() ,isEnrolled.isChecked());
                    Toast.makeText(MainActivity.this, st.toString() ,Toast.LENGTH_SHORT).show();
                }
                catch (Exception ex)
                {
                    Toast.makeText(MainActivity.this , "Error creating student",Toast.LENGTH_SHORT).show();
                }


            }
        });

        btnViewAll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });


    }
}