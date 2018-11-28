package jeninemay.lucero.com.finalsproject_ignacio_lucero;

import android.content.Intent;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Toast;
import android.view.View.OnClickListener;
import android.widget.Button;

public class ToBring extends AppCompatActivity {
    private CheckBox cb1, cb2, cb3, cb4, cb5, cb6, cb7, cb8, cb9, cb10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_to_bring);
        addListnerToCheckBox();
        loadSavedPreferences();
        cb1 = (CheckBox) findViewById(R.id.cb1);
        cb2 = (CheckBox) findViewById(R.id.cb2);
        cb3 = (CheckBox) findViewById(R.id.cb3);
        cb4 = (CheckBox) findViewById(R.id.cb4);
        cb5 = (CheckBox) findViewById(R.id.cb5);
        cb6 = (CheckBox) findViewById(R.id.cb6);
        cb7 = (CheckBox) findViewById(R.id.cb7);
        cb8 = (CheckBox) findViewById(R.id.cb8);
        cb9 = (CheckBox) findViewById(R.id.cb9);
        cb10 = (CheckBox) findViewById(R.id.cb10);

        Log.d( "LIFECYCLE", "onCreate() has executed...");
    }

    private void loadSavedPreferences() {
        SharedPreferences sharedPreferences = PreferenceManager
                .getDefaultSharedPreferences(this);
        boolean checkBoxValue = sharedPreferences.getBoolean("CheckBox_Value", false);

        /*if (checkBoxValue) {
            CheckBox.setChecked(true);
        } else {
            CheckBox.setChecked(false);
        }*/
    }

    private void savePreferences(String key, boolean value) {
        SharedPreferences sharedPreferences = PreferenceManager
                .getDefaultSharedPreferences(this);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putBoolean(key, value);
        editor.commit();
    }

    public void tobring(View v) {
        Intent i = null, chooser = null;
        if (v.getId() == R.id.back) {
            i = new Intent(this, DisasterList.class);
            startActivity(i);


        } else if (v.getId() == R.id.save) {
            i = new Intent(this, DisasterList.class);
            startActivity(i);
           // savePreferences("CheckBox_Value", CheckBox.isChecked());
       }
        finish();

    }

    public void addListnerToCheckBox() {

        cb1.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if (((CheckBox) v).isChecked()) {
                            Toast.makeText(ToBring.this,
                                    "Great! You already have 3-day supply of water", Toast.LENGTH_LONG).show();

                        }
                    }
                }
        );

        cb2.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if (((CheckBox) v).isChecked()) {
                            Toast.makeText(ToBring.this,
                                    "Awesome! You bring 3-day supply of nonperishable food.", Toast.LENGTH_LONG).show();

                        }
                    }
                }
        );

        cb3.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if (((CheckBox) v).isChecked()) {
                            Toast.makeText(ToBring.this,
                                    "That's right! Don't forget your can opener!", Toast.LENGTH_LONG).show();
                        }
                    }
                }
        );

        cb4.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if (((CheckBox) v).isChecked()) {
                            Toast.makeText(ToBring.this,
                                    "Awesome! Never forget your first aid kit! This kit may be handy later on.", Toast.LENGTH_LONG).show();
                        }
                    }
                }
        );

        cb5.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if (((CheckBox) v).isChecked()) {
                            Toast.makeText(ToBring.this,
                                    "Great! You bring the radio. Now, you can be updated with the current situation.", Toast.LENGTH_LONG).show();
                        }
                    }
                }
        );

        cb6.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if (((CheckBox) v).isChecked()) {
                            Toast.makeText(ToBring.this,
                                    "It's a good thing you bring your flashlight!", Toast.LENGTH_LONG).show();
                        }
                    }
                }
        );

        cb7.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if (((CheckBox) v).isChecked()) {
                            Toast.makeText(ToBring.this,
                                    "That's right! Never forget your batteries.", Toast.LENGTH_LONG).show();
                        }
                    }
                }
        );

        cb8.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if (((CheckBox) v).isChecked()) {
                            Toast.makeText(ToBring.this,
                                    "Great, you bring whistle! Good thing you think like a boyscout!", Toast.LENGTH_LONG).show();
                        }
                    }
                }
        );

        cb9.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if (((CheckBox) v).isChecked()) {
                            Toast.makeText(ToBring.this,
                                    "Of course, your medication! You are amazing.", Toast.LENGTH_LONG).show();
                        }
                    }
                }
        );

        cb10.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if (((CheckBox) v).isChecked()) {
                            Toast.makeText(ToBring.this,
                                    "Awesome, you bring your charger.You really are disaster ready!", Toast.LENGTH_LONG).show();

                        }
                    }
                }
        );
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