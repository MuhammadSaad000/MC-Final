package com.example.crud_app.data;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import androidx.annotation.Nullable;

import com.example.crud_app.models.Student;
import com.example.crud_app.params.Params;

public class MyDbHandler extends SQLiteOpenHelper {
    public MyDbHandler(Context context) {
        super(context, Params.DB_NAME , null , Params.DB_VERSION);
    }


    //execute when dbhelper object is created
    @Override
    public void onCreate(SQLiteDatabase db)
    {
        String createTable = "CREATE TABLE " + Params.TABLE_NAME + "(" + Params.KEY_ID + "INTEGER PRIMARY KEY"
                + Params.KEY_NAME + "TEXT , " + Params.KEY_ROLLNO + "TEXT " + Params.IS_ENROLLED +
                "TEXT" + ")";
        Log.d(" mydb ",  "this one " + createTable);
        db.execSQL(createTable);


     }


    @Override
    public void onUpgrade(SQLiteDatabase db,int oldVersion,int newVersion)
    {

    }





}
