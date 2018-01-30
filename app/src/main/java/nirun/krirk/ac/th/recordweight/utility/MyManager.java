package nirun.krirk.ac.th.recordweight.utility;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

/**
 * Created by masterung on 30/1/2018 AD.
 */

public class MyManager {

    private Context context;
    private MyOpenHelper myOpenHelperSQLite;
    private SQLiteDatabase sqLiteDatabase;

    public MyManager(Context context) {
        this.context = context;

        myOpenHelperSQLite = new MyOpenHelper(context);
        sqLiteDatabase = myOpenHelperSQLite.getWritableDatabase();


    }   // Constructor

}   // Main Class