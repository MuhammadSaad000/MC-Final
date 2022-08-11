package com.example.todoapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    EditText taskDet;
    Button btnAddTask;
    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        btnAddTask = findViewById(R.id.btnAddTask);
        taskDet = findViewById(R.id.taskDetail);
        listView = findViewById(R.id.mylist);

        ArrayList<String> tasks = new ArrayList<>();
        tasks.add("First Task Done ");
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,tasks);
        listView.setAdapter(arrayAdapter);


        btnAddTask.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(taskDet!=null){
                    tasks.add(taskDet.getText().toString());
                    arrayAdapter.notifyDataSetChanged();
                }
            }
        });


    }
}