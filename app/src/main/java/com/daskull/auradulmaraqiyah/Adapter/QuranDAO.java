package com.daskull.auradulmaraqiyah.Adapter;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import java.util.ArrayList;
import java.util.List;

public class QuranDAO extends DBHelper {

    public QuranDAO(Context context) {
        super(context);
    }

    public List<Item> getListDataWhereCriteria(String table, Integer value) {
        List<Item> recordsList = new ArrayList<>();
        String sql = "SELECT * FROM " + TABLE_NAME + " where " + table + " = '" + value + "'";
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor cursor = db.rawQuery(sql, null);
        if (cursor.moveToFirst()) {
            do {
                Integer suratId = cursor.getInt(cursor.getColumnIndex("suraId"));
                Integer verseId = cursor.getInt(cursor.getColumnIndex("verseID"));
                String ayatText = cursor.getString(cursor.getColumnIndex("ayahText"));
                String indoText = cursor.getString(cursor.getColumnIndex("indoText"));


                Item dataObj = new Item();
                dataObj.setSuraId(suratId);
                dataObj.setVerseID(verseId);
                dataObj.setAyahText(ayatText);
                dataObj.setIndoText(indoText);

                recordsList.add(dataObj);

            } while (cursor.moveToNext());
        }
        cursor.close();
        db.close();
        return recordsList;
    }
}
