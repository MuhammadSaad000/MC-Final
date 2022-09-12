package com.example.crud_app;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

import java.util.ArrayList;
import java.util.List;

public class MyDbHelper extends SQLiteOpenHelper {


    public static final String STUDENT_TABLE = "STUDENT_TABLE";
    public static final String STUDENT_NAME = "STUDENT_NAME";
    public static final String ROLLNO = "ROLLNO";
    public static final String ENROLLED = "ENROLLED";
    public static final String ID = "ID";

    public MyDbHelper(@Nullable Context context) {
        super(context, "students.db", null , 1);

    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String createTable = "CREATE TABLE " + STUDENT_TABLE + " (" + ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " + STUDENT_NAME + " TEXT, " + ROLLNO + " TEXT, " + ENROLLED + " BOOL )";

        db.execSQL(createTable);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }

    public List<Student> GetStudents()
    {
        List<Student> students = new ArrayList<>();
        String query = "SELECT * FROM " + STUDENT_TABLE;
        SQLiteDatabase db = this.getReadableDatabase();

        Cursor cursor = db.rawQuery(query , null);
        if(cursor.moveToFirst()){
            do {
                //  i = columnindex
                int id = cursor.getInt(0);
                String name = cursor.getString(1);
                String rollno = cursor.getString(2);
                boolean enrolled = cursor.getInt(3) == 1 ? true : false;
                Student temp = new Student(id, name, rollno , enrolled );
                students.add(temp);
            }
            while (cursor.moveToNext());
        }
        else {

        }
        cursor.close();
        db.close();
        return students;


    }



    public boolean AddStudent(Student s)
    {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues cv =new ContentValues();
        cv.put(STUDENT_NAME , s.getName());
        cv.put(ROLLNO , s.getRollno());
        cv.put(ENROLLED , s.getEnrolled());

        long ins = db.insert(STUDENT_TABLE , null , cv);
        if(ins==-1){
            return false;
        }
        else
            return true;
    }





}
