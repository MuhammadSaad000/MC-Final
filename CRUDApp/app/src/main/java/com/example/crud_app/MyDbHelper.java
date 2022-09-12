package com.example.crud_app;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

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
