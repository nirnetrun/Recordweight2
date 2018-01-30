package nirun.krirk.ac.th.recordweight.utility;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by masterung on 30/1/2018 AD.
 */

public class MyOpenHelper extends SQLiteOpenHelper{

    //    Explicit
    private Context context;
    public static final String databaseName = "Weight.db";
    private static final int databaseVersion = 1;

    private static final String databaseDetailuserTABLE = "create table userTABLE(" +
            "id integer primary key, " +
            "NickName text, " +
            "StartApp text, " +
            "Weight text, " +
            "Height text, " +
            "Gender text, " +
            "Age text);";

    private static final String databaseDetaildailyTABLE = "create table dailyTABLE(" +
            "id integer primary key, " +
            "DateCheck text, " +
            "Weight text);";



    public MyOpenHelper(Context context) {
        super(context, databaseName, null, databaseVersion);
        this.context = context;
    }   // Constructor


    @Override
    public void onCreate(SQLiteDatabase db) {

        db.execSQL(databaseDetailuserTABLE);
        db.execSQL(databaseDetaildailyTABLE);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}   // Main Class