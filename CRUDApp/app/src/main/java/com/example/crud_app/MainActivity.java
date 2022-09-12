package com.example.crud_app;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.Manifest;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Switch;
import android.widget.Toast;

import java.util.List;

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

        students.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Student clicked = (Student) adapterView.getItemAtPosition(i);
                ShowDialog(clicked);
            }
        });

        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Student st;
                try {
                    st = new Student(-1, name.getText().toString() ,rollno.getText().toString() ,isEnrolled.isChecked());
                    Toast.makeText(MainActivity.this, st.toString() ,Toast.LENGTH_SHORT).show();
                }
                catch (Exception ex)
                {
                    Toast.makeText(MainActivity.this , "Error creating student",Toast.LENGTH_SHORT).show();
                    st = new Student(-1,null,null,false);
                }

                MyDbHelper dbHelper = new MyDbHelper(MainActivity.this);
                boolean success = dbHelper.AddStudent(st);
                Toast.makeText(MainActivity.this , "Success " + success ,Toast.LENGTH_SHORT).show();



            }
        });

        btnViewAll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MyDbHelper dbHelper = new MyDbHelper(MainActivity.this);
                List<Student> studentsList =  dbHelper.GetStudents();

                ArrayAdapter arrayAdapter = new ArrayAdapter<Student>(MainActivity.this , android.R.layout.simple_list_item_1, studentsList);
                students.setAdapter(arrayAdapter);
            }
        });


    }

    public void ShowDialog(Student s)
    {
        AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
        builder.setMessage("Do you want to delete this record? ");
        builder.setCancelable(true);
        builder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                MyDbHelper dbHelper = new MyDbHelper(MainActivity.this);
                dbHelper.DeleteStudent(s);
            }
        });
        


        AlertDialog a1 = builder.create();
        a1.show();
    }


}