package nirun.krirk.ac.th.recordweight.utility;

import android.content.ContentValues;
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

    //    Add Value to userTable
    public long addValueToUserTable(String nickNamString,
                                    String startAppString,
                                    String weightString,
                                    String heightString,
                                    String genderString,
                                    String ageString) {

        ContentValues contentValues = new ContentValues();
        contentValues.put("NickName",nickNamString );
        contentValues.put("StartApp",startAppString );
        contentValues.put("Weight",weightString );
        contentValues.put("Height",heightString );
        contentValues.put("Gender",genderString );
        contentValues.put("Age", ageString);

        return sqLiteDatabase.insert("userTABLE",null, contentValues);

    }





}   // Main Class