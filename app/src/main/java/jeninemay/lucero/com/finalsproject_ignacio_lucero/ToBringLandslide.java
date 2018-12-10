package jeninemay.lucero.com.finalsproject_ignacio_lucero;

import android.content.Context;
import android.content.Intent;
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

import android.widget.CompoundButton;
import android.widget.Toast;
import jeninemay.lucero.com.finalsproject_ignacio_lucero.CheckboxPreference;

public class ToBringLandslide extends AppCompatActivity implements CompoundButton.OnCheckedChangeListener {


    //SharedPreferences pref = getBaseContext().getSharedPreferences("storage", 7 );
   // Editor editor = pref.edit();
//    private CheckboxPreference prefCheck = new CheckboxPreference(getApplicationContext());
    CheckBox cbl1, cbl2, cbl3, cbl4, cbl5, cbl6, cbl7;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_to_bring_landslide);
        Log.d("LIFECYCLE", "onCreate() has executed...");

        cbl1 = (CheckBox) findViewById(R.id.cbl1);
        cbl1.setChecked(getFromSP("cbl1"));
        cbl1.setOnCheckedChangeListener(this);

        cbl2 = (CheckBox) findViewById(R.id.cbl2);
        cbl2.setChecked(getFromSP("cbl2"));
        cbl2.setOnCheckedChangeListener(this);

        cbl3 = (CheckBox) findViewById(R.id.cbl3);
        cbl3.setChecked(getFromSP("cbl3"));
        cbl3.setOnCheckedChangeListener(this);

        cbl4 = (CheckBox) findViewById(R.id.cbl4);
        cbl4.setChecked(getFromSP("cbl4"));
        cbl4.setOnCheckedChangeListener(this);

        cbl5 = (CheckBox) findViewById(R.id.cbl5);
        cbl5.setChecked(getFromSP("cbl5"));
        cbl5.setOnCheckedChangeListener(this);

        cbl6 = (CheckBox) findViewById(R.id.cbl6);
        cbl6.setChecked(getFromSP("cbl6"));
        cbl6.setOnCheckedChangeListener(this);

        cbl7 = (CheckBox) findViewById(R.id.cbl7);
        cbl7.setChecked(getFromSP("cbl7"));
        cbl7.setOnCheckedChangeListener(this);

        


        cbl1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String message ="";
                if (cbl1.isChecked()) {
                    cbl1.setChecked(true);
                    message += cbl1.getText() + " is checked.  ";
                    Toast.makeText(getApplicationContext(), message, Toast.LENGTH_SHORT).show();
                } else {
                    cbl1.setChecked(false);
                    message += cbl1.getText() + " is unchecked.  ";
                    Toast.makeText(getApplicationContext(), message, Toast.LENGTH_SHORT).show();
                }
            }
        });

        cbl2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String message ="";
                if (cbl2.isChecked()) {
                    cbl2.setChecked(true);
                     message += cbl2.getText() + " is checked.  ";
                    Toast.makeText(getApplicationContext(), message, Toast.LENGTH_SHORT).show();
                } else {
                    cbl2.setChecked(false);
                   message += cbl2.getText() + " is unchecked.  ";
                    Toast.makeText(getApplicationContext(), message, Toast.LENGTH_SHORT).show();
                }

            }
        });

        cbl3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String message ="";
                if (cbl3.isChecked()) {
                    cbl3.setChecked(true);
                    message += cbl3.getText() + " is checked.  ";
                    Toast.makeText(getApplicationContext(), message, Toast.LENGTH_SHORT).show();
                } else {
                    cbl3.setChecked(false);
                    message += cbl3.getText() + " is unchecked.  ";
                    Toast.makeText(getApplicationContext(), message, Toast.LENGTH_SHORT).show();
                }

            }
        });

        cbl4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String message ="";
                if (cbl4.isChecked()) {
                    cbl4.setChecked(true);
                    message += cbl4.getText() + " is checked.  ";
                    Toast.makeText(getApplicationContext(), message, Toast.LENGTH_SHORT).show();
                } else {
                    cbl4.setChecked(false);
                    message += cbl4.getText() + " is unchecked.  ";
                    Toast.makeText(getApplicationContext(), message, Toast.LENGTH_SHORT).show();
                }

            }
        });

        cbl5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String message ="";
                if (cbl5.isChecked()) {
                    cbl5.setChecked(true);
                    message += cbl5.getText() + " is checked.  ";
                    Toast.makeText(getApplicationContext(), message, Toast.LENGTH_SHORT).show();
                } else {
                    cbl5.setChecked(false);
                    message += cbl5.getText() + " is unchecked.  ";
                    Toast.makeText(getApplicationContext(), message, Toast.LENGTH_SHORT).show();
                }

            }
        });

        cbl6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String message ="";
                if (cbl6.isChecked()) {
                    cbl6.setChecked(true);
                    message += cbl6.getText() + " is checked.  ";
                    Toast.makeText(getApplicationContext(), message, Toast.LENGTH_SHORT).show();
                } else {
                    cbl6.setChecked(false);
                    message += cbl6.getText() + " is unchecked.  ";
                    Toast.makeText(getApplicationContext(), message, Toast.LENGTH_SHORT).show();
                }

            }
        });

        cbl7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String message ="";
                if (cbl7.isChecked()) {
                    cbl7.setChecked(true);
                    message += cbl7.getText() + " is checked.  ";
                    Toast.makeText(getApplicationContext(), message, Toast.LENGTH_SHORT).show();
                } else {
                    cbl7.setChecked(false);
                    message += cbl7.getText() + " is unchecked.  ";
                    Toast.makeText(getApplicationContext(), message, Toast.LENGTH_SHORT).show();
                }

            }
        });
    }


    public void landslidetobring (View v) {
        Intent i = null, chooser = null;
        if (v.getId() == R.id.back) {
            i = new Intent(this, LandSlide.class);
            startActivity(i);

        }
    }

    private boolean getFromSP(String key){
        SharedPreferences preferences = getApplicationContext().getSharedPreferences("PROJECT_NAME", android.content.Context.MODE_PRIVATE);
        return preferences.getBoolean(key, false);
    }
    private void saveInSp(String key,boolean value){
        SharedPreferences preferences = getApplicationContext().getSharedPreferences("PROJECT_NAME", android.content.Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = preferences.edit();
        editor.putBoolean(key, value);
        editor.commit();
    }

    @Override
    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
        switch(buttonView.getId()){
            case R.id.cbl1:
                saveInSp("cbl1",isChecked);
                break;
            case R.id.cbl2:
                saveInSp("cbl2",isChecked);
                break;

            case R.id.cbl3:
                saveInSp("cbl3",isChecked);
                break;

            case R.id.cbl4:
                saveInSp("cbl4",isChecked);
                break;

            case R.id.cbl5:
                saveInSp("cbl5",isChecked);
                break;
            case R.id.cbl6:
                saveInSp("cbl6",isChecked);
                break;
            case R.id.cbl7:
                saveInSp("cbl7",isChecked);
                break;

        }

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
