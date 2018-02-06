package nirun.krirk.ac.th.recordweight;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import nirun.krirk.ac.th.recordweight.utility.MyManager;

public class MainActivity extends AppCompatActivity {


    private MyManager myManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myManager = new MyManager(MainActivity.this);


//        Test and user
        myManager.addValueToUserTable("nickName",
                "SrartApp",
                "Weight",
                "Height",
                "Gender",
                "Age");
    }




}
