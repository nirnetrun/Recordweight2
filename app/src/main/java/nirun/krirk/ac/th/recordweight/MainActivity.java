package nirun.krirk.ac.th.recordweight;

import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import nirun.krirk.ac.th.recordweight.utility.MyManager;
import nirun.krirk.ac.th.recordweight.utility.MyOpenHelper;

public class MainActivity extends AppCompatActivity {


    private MyManager myManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myManager = new MyManager(MainActivity.this);


//        Test and user
//        testAndUser();


//        Double all userTABLE;
//        deleteAlluserTABLE();


    }   //main method

    private void delete() {
        SQLiteDatabase sqLiteDatabase = openOrCreateDatabase(MyOpenHelper.databaseName,
                MODE_PRIVATE, null);

        sqLiteDatabase.delete("userTABLE", null, null);
    }

    private void testAndUser() {
        myManager.addValueToUserTable("nickName",
                "SrartApp",
                "Weight",
                "Height",
                "Gender",
                "Age");
    }


}//mian class
