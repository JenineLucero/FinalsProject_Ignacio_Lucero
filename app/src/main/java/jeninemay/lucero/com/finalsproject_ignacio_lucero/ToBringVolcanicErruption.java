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

public class ToBringVolcanicErruption extends AppCompatActivity implements CompoundButton.OnCheckedChangeListener {

    CheckBox cbv1, cbv2, cbv3, cbv4, cbv5, cbv6, cbv7, cbv8;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_to_bring_volcanic_erruption);
        Log.d("LIFECYCLE", "onCreate() has executed...");

        cbv1 = (CheckBox) findViewById(R.id.cbv1);
        cbv1.setChecked(getFromSP("cbv1"));
        cbv1.setOnCheckedChangeListener(this);

        cbv2 = (CheckBox) findViewById(R.id.cbv2);
        cbv2.setChecked(getFromSP("cbv2"));
        cbv2.setOnCheckedChangeListener(this);

        cbv3 = (CheckBox) findViewById(R.id.cbv3);
        cbv3.setChecked(getFromSP("cbv3"));
        cbv3.setOnCheckedChangeListener(this);

        cbv4 = (CheckBox) findViewById(R.id.cbv4);
        cbv4.setChecked(getFromSP("cbv4"));
        cbv4.setOnCheckedChangeListener(this);

        cbv5 = (CheckBox) findViewById(R.id.cbv5);
        cbv5.setChecked(getFromSP("cbv5"));
        cbv5.setOnCheckedChangeListener(this);

        cbv6 = (CheckBox) findViewById(R.id.cbv6);
        cbv6.setChecked(getFromSP("cbv6"));
        cbv6.setOnCheckedChangeListener(this);

        cbv7 = (CheckBox) findViewById(R.id.cbv7);
        cbv7.setChecked(getFromSP("cbv7"));
        cbv7.setOnCheckedChangeListener(this);

        cbv8 = (CheckBox) findViewById(R.id.cbv8);
        cbv8.setChecked(getFromSP("cbv8"));
        cbv8.setOnCheckedChangeListener(this);

       


        cbv1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String message ="";
                if (cbv1.isChecked()) {
                    cbv1.setChecked(true);
                    message += cbv1.getText() + " is checked.  ";
                    Toast.makeText(getApplicationContext(), message, Toast.LENGTH_SHORT).show();
                } else {
                    cbv1.setChecked(false);
                    message += cbv1.getText() + " is unchecked.  ";
                    Toast.makeText(getApplicationContext(), message, Toast.LENGTH_SHORT).show();
                }
            }
        });

        cbv2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String message ="";
                if (cbv2.isChecked()) {
                    cbv2.setChecked(true);
                    message += cbv2.getText() + " is checked.  ";
                    Toast.makeText(getApplicationContext(), message, Toast.LENGTH_SHORT).show();
                } else {
                    cbv2.setChecked(false);
                    message += cbv2.getText() + " is unchecked.  ";
                    Toast.makeText(getApplicationContext(), message, Toast.LENGTH_SHORT).show();
                }

            }
        });

        cbv3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String message ="";
                if (cbv3.isChecked()) {
                    cbv3.setChecked(true);
                    message += cbv3.getText() + " is checked.  ";
                    Toast.makeText(getApplicationContext(), message, Toast.LENGTH_SHORT).show();
                } else {
                    cbv3.setChecked(false);
                    message += cbv3.getText() + " is unchecked.  ";
                    Toast.makeText(getApplicationContext(), message, Toast.LENGTH_SHORT).show();
                }

            }
        });

        cbv4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String message ="";
                if (cbv4.isChecked()) {
                    cbv4.setChecked(true);
                    message += cbv4.getText() + " is checked.  ";
                    Toast.makeText(getApplicationContext(), message, Toast.LENGTH_SHORT).show();
                } else {
                    cbv4.setChecked(false);
                    message += cbv4.getText() + " is unchecked.  ";
                    Toast.makeText(getApplicationContext(), message, Toast.LENGTH_SHORT).show();
                }

            }
        });

        cbv5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String message ="";
                if (cbv5.isChecked()) {
                    cbv5.setChecked(true);
                    message += cbv5.getText() + " is checked.  ";
                    Toast.makeText(getApplicationContext(), message, Toast.LENGTH_SHORT).show();
                } else {
                    cbv5.setChecked(false);
                    message += cbv5.getText() + " is unchecked.  ";
                    Toast.makeText(getApplicationContext(), message, Toast.LENGTH_SHORT).show();
                }

            }
        });

        cbv6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String message ="";
                if (cbv6.isChecked()) {
                    cbv6.setChecked(true);
                    message += cbv6.getText() + " is checked.  ";
                    Toast.makeText(getApplicationContext(), message, Toast.LENGTH_SHORT).show();
                } else {
                    cbv6.setChecked(false);
                    message += cbv6.getText() + " is unchecked.  ";
                    Toast.makeText(getApplicationContext(), message, Toast.LENGTH_SHORT).show();
                }

            }
        });

        cbv7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String message ="";
                if (cbv7.isChecked()) {
                    cbv7.setChecked(true);
                    message += cbv7.getText() + " is checked.  ";
                    Toast.makeText(getApplicationContext(), message, Toast.LENGTH_SHORT).show();
                } else {
                    cbv7.setChecked(false);
                    message += cbv7.getText() + " is unchecked.  ";
                    Toast.makeText(getApplicationContext(), message, Toast.LENGTH_SHORT).show();
                }

            }
        });

        cbv8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String message ="";
                if (cbv8.isChecked()) {
                    cbv8.setChecked(true);
                    message += cbv8.getText() + " is checked.  ";
                    Toast.makeText(getApplicationContext(), message, Toast.LENGTH_SHORT).show();
                } else {
                    cbv8.setChecked(false);
                    message += cbv8.getText() + " is unchecked.  ";
                    Toast.makeText(getApplicationContext(), message, Toast.LENGTH_SHORT).show();
                }

            }
        });

        
    }

    public void volcanictobring (View v) {
        Intent i = null, chooser = null;
        if (v.getId() == R.id.back) {
            i = new Intent(this, VolcanicErruption.class);
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
            case R.id.cbv1:
                saveInSp("cbv1", isChecked);
                break;
            case R.id.cbv2:
                saveInSp("cbv2", isChecked);
                break;

            case R.id.cbv3:
                saveInSp("cbv3", isChecked);
                break;

            case R.id.cbv4:
                saveInSp("cbv4", isChecked);
                break;

            case R.id.cbv5:
                saveInSp("cbv5", isChecked);
                break;
            case R.id.cbv6:
                saveInSp("cbv6", isChecked);
                break;
            case R.id.cbv7:
                saveInSp("cbv7", isChecked);
                break;
            case R.id.cbv8:
                saveInSp("cbv8", isChecked);
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
