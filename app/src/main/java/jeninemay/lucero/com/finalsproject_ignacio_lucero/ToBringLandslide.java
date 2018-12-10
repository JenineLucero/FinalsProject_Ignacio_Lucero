package jeninemay.lucero.com.finalsproject_ignacio_lucero;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.app.Activity;
import android.widget.Button;
import android.widget.CheckBox;
import java.util.ArrayList;
import android.widget.Toast;
import jeninemay.lucero.com.finalsproject_ignacio_lucero.CheckboxPreference;

public class ToBringLandslide extends AppCompatActivity {

    CheckBox cbl1, cbl2, cbl3;
    //SharedPreferences pref = getBaseContext().getSharedPreferences("storage", 7 );
   // Editor editor = pref.edit();
//    private CheckboxPreference prefCheck = new CheckboxPreference(getApplicationContext());

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_to_bring_landslide);
        Log.d("LIFECYCLE", "onCreate() has executed...");
        CheckBox cbl1 = (CheckBox) findViewById(R.id.cbl1);
        CheckBox cbl2 = (CheckBox) findViewById(R.id.cbl2);
        CheckBox cbl3 = (CheckBox) findViewById(R.id.cbl3);
        CheckBox.setOnClickListener(new View.OnClickListener() {
         if (cbl1.isChecked()) {
            cbl1.setChecked(true);
                message += cbl1.getText() + " is selected. \n";
        }
    }



    private void RegisterButton2() {

        Button save = (Button) findViewById(R.id.save);
        save.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {

                CheckBox cbl1 = (CheckBox) findViewById(R.id.cbl1);
                CheckBox cbl2 = (CheckBox) findViewById(R.id.cbl2);
                CheckBox cbl3 = (CheckBox) findViewById(R.id.cbl3);
                CheckBox cbl4 = (CheckBox) findViewById(R.id.cbl4);
                CheckBox cbl5 = (CheckBox) findViewById(R.id.cbl5);
                CheckBox cbl6 = (CheckBox) findViewById(R.id.cbl6);
                CheckBox cbl7 = (CheckBox) findViewById(R.id.cbl7);
                String message = new String();

                if (cbl1.isChecked()) {
                    cbl1.setChecked(true);
                    message += cbl1.getText() + " is selected. \n";
                }

                if (cbl2.isChecked()) {
                    message += cbl2.getText() + " is selected. \n";
                }

                if (cbl3.isChecked()) {
                    message += cbl3.getText() + " is selected. \n";
                }
                if (cbl4.isChecked()) {
                    message += cbl4.getText() + " is selected. \n";
                }
                if (cbl5.isChecked()) {
                    message += cbl5.getText() + " is selected. \n";
                }
                if (cbl6.isChecked()) {
                    message += cbl6.getText() + " is selected. \n";
                }
                if (cbl7.isChecked()) {
                    message += cbl7.getText() + " is selected. \n";
                }

                Toast.makeText(getApplicationContext(), message, Toast.LENGTH_SHORT).show();
            }

        });
    }





    @Override
    protected void onStart() {
        super.onStart();
        Log.d("LIFECYCLE", "onStart() has executed");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("LIFECYCLE", "onResume() has executed");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("LIFECYCLE", "onPause() has executed");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("LIFECYCLE", "onStop() has executed");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("LIFECYCLE", "onRestart() has executed");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("LIFECYCLE", "onDestroy() has executed");
    }

}
