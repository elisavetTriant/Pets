package com.example.android.pets.data;

import android.provider.BaseColumns;

/**
 * Created by Eli on 27-Jul-18.
 */

public final class PetContract {

    // To prevent someone from accidentally instantiating the contract class,
    // give it an empty constructor.
    private PetContract() {
    }

    public static abstract class PetsEntry implements BaseColumns {

        //Name of the table
        public static final String TABLE_NAME = "pets";

        //Names of the columns
        public static final String _ID = BaseColumns._ID;
        public static final String COLUMN_PET_NAME = "name";
        public static final String COLUMN_PET_BREED = "breed";
        public static final String COLUMN_PET_GENDER = "gender";
        public static final String COLUMN_PET_WEIGHT = "weight";


        //Possible genders
        public static final int GENDER_UNKNOWN = 0;
        public static final int GENDER_MALE = 1;
        public static final int GENDER_FEMALE = 2;


    }
}
