package com.example.android.pets.data;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.example.android.pets.data.PetContract.PetsEntry;

/**
 * Created by Eli on 27-Jul-18.
 */

public class PetDbHelper extends SQLiteOpenHelper {

    private static final String DATABASE_NAME = "shelter.db";

    private static final int DATABASE_VERSION = 1;

    public PetDbHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

        // Create a String that contains the SQL statement to create the pets table
        String CREATE_PETS_TABLE_SQL = "CREATE TABLE " + PetsEntry.TABLE_NAME + "(" +
                PetsEntry._ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                PetsEntry.COLUMN_PET_NAME + " TEXT NOT NULL, " +
                PetsEntry.COLUMN_PET_BREED + " TEXT, " +
                PetsEntry.COLUMN_PET_GENDER + " INTEGER NOT NULL," +
                PetsEntry.COLUMN_PET_WEIGHT + " INTEGER NOT NULL DEFAULT 0);";

        db.execSQL(CREATE_PETS_TABLE_SQL);

    }

    /*
     * This is called when the database needs to be upgraded.
    */
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        // The database is still at version 1, so there's nothing to do be done here.
    }

}
