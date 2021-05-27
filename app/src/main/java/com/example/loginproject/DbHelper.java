package com.example.loginproject;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.renderscript.Sampler;

import androidx.annotation.Nullable;



public class DbHelper extends SQLiteOpenHelper {

    public static final String LIST_TABLE = "LIST_TABLE";
    public static final String ID = "USER_ID";
    public static final String NAME = "USER_NAME";
    public static final String EMAIL = "USER_EMAIL";

    public DbHelper(@Nullable Context context) {
        super(context, "items.db", null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String s = " CREATE TABLE " + LIST_TABLE + "(" + ID + "INTERGER PRIMARY KEY AUTOINCREMENT," + NAME + "STRING," + EMAIL + "STRING)";
        db.execSQL(s);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
//        db.execSQL("drop table if exists items.db");
    }

    public void addlist(String name,String email){
        SQLiteDatabase DB = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(NAME, );

    }
}
