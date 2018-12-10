package jeninemay.lucero.com.finalsproject_ignacio_lucero;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.Toast;

public class ToBringTyphoon extends AppCompatActivity implements CompoundButton.OnCheckedChangeListener {

    CheckBox cbt1, cbt2, cbt3, cbt4, cbt5, cbt6, cbt7, cbt8, cbt9 ,cbt10;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_to_bring_typhoon);
        Log.d("LIFECYCLE", "onCreate() has executed...");

        cbt1 = (CheckBox) findViewById(R.id.cbt1);
        cbt1.setChecked(getFromSP("cbt1"));
        cbt1.setOnCheckedChangeListener(this);

        cbt2 = (CheckBox) findViewById(R.id.cbt2);
        cbt2.setChecked(getFromSP("cbt2"));
        cbt2.setOnCheckedChangeListener(this);

        cbt3 = (CheckBox) findViewById(R.id.cbt3);
        cbt3.setChecked(getFromSP("cbt3"));
        cbt3.setOnCheckedChangeListener(this);

        cbt4 = (CheckBox) findViewById(R.id.cbt4);
        cbt4.setChecked(getFromSP("cbt4"));
        cbt4.setOnCheckedChangeListener(this);

        cbt5 = (CheckBox) findViewById(R.id.cbt5);
        cbt5.setChecked(getFromSP("cbt5"));
        cbt5.setOnCheckedChangeListener(this);

        cbt6 = (CheckBox) findViewById(R.id.cbt6);
        cbt6.setChecked(getFromSP("cbt6"));
        cbt6.setOnCheckedChangeListener(this);

        cbt7 = (CheckBox) findViewById(R.id.cbt7);
        cbt7.setChecked(getFromSP("cbt7"));
        cbt7.setOnCheckedChangeListener(this);

        cbt8 = (CheckBox) findViewById(R.id.cbt8);
        cbt8.setChecked(getFromSP("cbt8"));
        cbt8.setOnCheckedChangeListener(this);

        cbt9 = (CheckBox) findViewById(R.id.cbt9);
        cbt9.setChecked(getFromSP("cbt9"));
        cbt9.setOnCheckedChangeListener(this);

        cbt10 = (CheckBox) findViewById(R.id.cbt10);
        cbt10.setChecked(getFromSP("cbt10"));
        cbt10.setOnCheckedChangeListener(this);



        cbt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String message ="";
                if (cbt1.isChecked()) {
                    cbt1.setChecked(true);
                    message += cbt1.getText() + " is checked.  ";
                    Toast.makeText(getApplicationContext(), message, Toast.LENGTH_SHORT).show();
                } else {
                    cbt1.setChecked(false);
                    message += cbt1.getText() + " is unchecked.  ";
                    Toast.makeText(getApplicationContext(), message, Toast.LENGTH_SHORT).show();
                }
            }
        });

        cbt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String message ="";
                if (cbt2.isChecked()) {
                    cbt2.setChecked(true);
                    message += cbt2.getText() + " is checked.  ";
                    Toast.makeText(getApplicationContext(), message, Toast.LENGTH_SHORT).show();
                } else {
                    cbt2.setChecked(false);
                    message += cbt2.getText() + " is unchecked.  ";
                    Toast.makeText(getApplicationContext(), message, Toast.LENGTH_SHORT).show();
                }

            }
        });

        cbt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String message ="";
                if (cbt3.isChecked()) {
                    cbt3.setChecked(true);
                    message += cbt3.getText() + " is checked.  ";
                    Toast.makeText(getApplicationContext(), message, Toast.LENGTH_SHORT).show();
                } else {
                    cbt3.setChecked(false);
                    message += cbt3.getText() + " is unchecked.  ";
                    Toast.makeText(getApplicationContext(), message, Toast.LENGTH_SHORT).show();
                }

            }
        });

        cbt4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String message ="";
                if (cbt4.isChecked()) {
                    cbt4.setChecked(true);
                    message += cbt4.getText() + " is checked.  ";
                    Toast.makeText(getApplicationContext(), message, Toast.LENGTH_SHORT).show();
                } else {
                    cbt4.setChecked(false);
                    message += cbt4.getText() + " is unchecked.  ";
                    Toast.makeText(getApplicationContext(), message, Toast.LENGTH_SHORT).show();
                }

            }
        });

        cbt5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String message ="";
                if (cbt5.isChecked()) {
                    cbt5.setChecked(true);
                    message += cbt5.getText() + " is checked.  ";
                    Toast.makeText(getApplicationContext(), message, Toast.LENGTH_SHORT).show();
                } else {
                    cbt5.setChecked(false);
                    message += cbt5.getText() + " is unchecked.  ";
                    Toast.makeText(getApplicationContext(), message, Toast.LENGTH_SHORT).show();
                }

            }
        });

        cbt6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String message ="";
                if (cbt6.isChecked()) {
                    cbt6.setChecked(true);
                    message += cbt6.getText() + " is checked.  ";
                    Toast.makeText(getApplicationContext(), message, Toast.LENGTH_SHORT).show();
                } else {
                    cbt6.setChecked(false);
                    message += cbt6.getText() + " is unchecked.  ";
                    Toast.makeText(getApplicationContext(), message, Toast.LENGTH_SHORT).show();
                }

            }
        });

        cbt7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String message ="";
                if (cbt7.isChecked()) {
                    cbt7.setChecked(true);
                    message += cbt7.getText() + " is checked.  ";
                    Toast.makeText(getApplicationContext(), message, Toast.LENGTH_SHORT).show();
                } else {
                    cbt7.setChecked(false);
                    message += cbt7.getText() + " is unchecked.  ";
                    Toast.makeText(getApplicationContext(), message, Toast.LENGTH_SHORT).show();
                }

            }
        });

        cbt8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String message ="";
                if (cbt8.isChecked()) {
                    cbt8.setChecked(true);
                    message += cbt8.getText() + " is checked.  ";
                    Toast.makeText(getApplicationContext(), message, Toast.LENGTH_SHORT).show();
                } else {
                    cbt8.setChecked(false);
                    message += cbt8.getText() + " is unchecked.  ";
                    Toast.makeText(getApplicationContext(), message, Toast.LENGTH_SHORT).show();
                }

            }
        });

        cbt9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String message ="";
                if (cbt9.isChecked()) {
                    cbt9.setChecked(true);
                    message += cbt9.getText() + " is checked.  ";
                    Toast.makeText(getApplicationContext(), message, Toast.LENGTH_SHORT).show();
                } else {
                    cbt9.setChecked(false);
                    message += cbt9.getText() + " is unchecked.  ";
                    Toast.makeText(getApplicationContext(), message, Toast.LENGTH_SHORT).show();
                }

            }
        });

        cbt10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String message ="";
                if (cbt10.isChecked()) {
                    cbt10.setChecked(true);
                    message += cbt10.getText() + " is checked.  ";
                    Toast.makeText(getApplicationContext(), message, Toast.LENGTH_SHORT).show();
                } else {
                    cbt10.setChecked(false);
                    message += cbt10.getText() + " is unchecked.  ";
                    Toast.makeText(getApplicationContext(), message, Toast.LENGTH_SHORT).show();
                }

            }
        });
    }

    public void typhoontobring (View v) {
        Intent i = null, chooser = null;
        if (v.getId() == R.id.back) {
            i = new Intent(this, Typhoon.class);
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
        switch (buttonView.getId()) {
            case R.id.cbt1:
                saveInSp("cbt1", isChecked);
                break;
            case R.id.cbt2:
                saveInSp("cbt2", isChecked);
                break;

            case R.id.cbt3:
                saveInSp("cbt3", isChecked);
                break;

            case R.id.cbt4:
                saveInSp("cbt4", isChecked);
                break;

            case R.id.cbt5:
                saveInSp("cbt5", isChecked);
                break;
            case R.id.cbt6:
                saveInSp("cbt6", isChecked);
                break;
            case R.id.cbt7:
                saveInSp("cbt7", isChecked);
                break;
            case R.id.cbt8:
                saveInSp("cbt8", isChecked);
                break;
            case R.id.cbt9:
                saveInSp("cbt9", isChecked);
                break;
            case R.id.cbt10:
                saveInSp("cb10", isChecked);
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
