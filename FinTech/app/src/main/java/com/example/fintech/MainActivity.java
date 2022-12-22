package com.example.fintech;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    public class SimpleDBWrapper extends SQLiteOpenHelper implements com.example.fintech.SimpleDBWrapper {

        private static final String BD_NAME = "FinTeck.db";
        private static final int DB_VERSION = 1;

        public static final String TABLE_NAME = "financeiro";
        public static final String SALDO_ID = "id";
        public static final String CREDITO = "credito";
        public static final String DEBITO = "debito";
        public static final String SALDO = "saldo";
        private static final String DB_CREATE = "CREATE TABLE IF NOT EXISTS" + TABLE_NAME
                + "(" + SALDO_ID + "INTEGER PRIMARY KEY AUTOINCREMENT, " + CREDITO + "INTEGER(255) NOT NULL, " +
                DEBITO + "INTEGER(255) NOT NULL," + SALDO + "INTEGER(255) NOT NULL );";


        public SimpleDBWrapper(Context context) {
            super(context, BD_NAME, null, DB_VERSION);
        }


        @Override
        public void onCreate(SQLiteDatabase sqLiteDatabase) {
            sqLiteDatabase.execSQL(DB_CREATE);
        }

        @Override
        public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1){
            onCreate(sqLiteDatabase);
        }
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

}