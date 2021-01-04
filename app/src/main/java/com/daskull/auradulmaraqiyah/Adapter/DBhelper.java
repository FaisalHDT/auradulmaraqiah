package com.daskull.auradulmaraqiyah.Adapter;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DBHelper extends SQLiteOpenHelper {

    protected static final String DATABASE_NAME = "myalqurans";
    protected static final String TABLE_NAME = "quran_id";
    private static final int DATABASE_VERSION = 1;

    public DBHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
        //context.deleteDatabase(DATABASE_NAME); //untuk delete database
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String sql = " CREATE TABLE IF NOT EXISTS 'quran' (" +
                " 'id' INTEGER PRIMARY KEY," +
                " 'suraId' INTEGER ," +
                " 'verseID' INTEGER ," +
                " 'ayahText' TEXT," +
                " 'indoText' TEXT," +
                " 'readText' TEXT" +
                "); ";
        db.execSQL(sql);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        String sql = "DROP TABLE IF EXISTS " + TABLE_NAME + "";
        db.execSQL(sql);
        onCreate(db);
    }
}