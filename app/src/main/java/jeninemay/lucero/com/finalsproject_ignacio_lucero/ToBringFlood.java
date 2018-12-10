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

public class ToBringFlood extends AppCompatActivity implements CompoundButton.OnCheckedChangeListener {

    CheckBox cbf1, cbf2, cbf3, cbf4, cbf5, cbf6, cbf7, cbf8, cbf9 ,cbf10;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_to_bring_flood);
        Log.d("LIFECYCLE", "onCreate() has executed...");

        cbf1 = (CheckBox) findViewById(R.id.cbf1);
        cbf1.setChecked(getFromSP("cbf1"));
        cbf1.setOnCheckedChangeListener(this);

        cbf2 = (CheckBox) findViewById(R.id.cbf2);
        cbf2.setChecked(getFromSP("cbf2"));
        cbf2.setOnCheckedChangeListener(this);

        cbf3 = (CheckBox) findViewById(R.id.cbf3);
        cbf3.setChecked(getFromSP("cbf3"));
        cbf3.setOnCheckedChangeListener(this);

        cbf4 = (CheckBox) findViewById(R.id.cbf4);
        cbf4.setChecked(getFromSP("cbf4"));
        cbf4.setOnCheckedChangeListener(this);

        cbf5 = (CheckBox) findViewById(R.id.cbf5);
        cbf5.setChecked(getFromSP("cbf5"));
        cbf5.setOnCheckedChangeListener(this);

        cbf6 = (CheckBox) findViewById(R.id.cbf6);
        cbf6.setChecked(getFromSP("cbf6"));
        cbf6.setOnCheckedChangeListener(this);

        cbf7 = (CheckBox) findViewById(R.id.cbf7);
        cbf7.setChecked(getFromSP("cbf7"));
        cbf7.setOnCheckedChangeListener(this);

        cbf8 = (CheckBox) findViewById(R.id.cbf8);
        cbf8.setChecked(getFromSP("cbf8"));
        cbf8.setOnCheckedChangeListener(this);

        cbf9 = (CheckBox) findViewById(R.id.cbf9);
        cbf9.setChecked(getFromSP("cbf9"));
        cbf9.setOnCheckedChangeListener(this);

        cbf10 = (CheckBox) findViewById(R.id.cbf10);
        cbf10.setChecked(getFromSP("cbf10"));
        cbf10.setOnCheckedChangeListener(this);



        cbf1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String message ="";
                if (cbf1.isChecked()) {
                    cbf1.setChecked(true);
                    message += cbf1.getText() + " is checked.  ";
                    Toast.makeText(getApplicationContext(), message, Toast.LENGTH_SHORT).show();
                } else {
                    cbf1.setChecked(false);
                    message += cbf1.getText() + " is unchecked.  ";
                    Toast.makeText(getApplicationContext(), message, Toast.LENGTH_SHORT).show();
                }
            }
        });

        cbf2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String message ="";
                if (cbf2.isChecked()) {
                    cbf2.setChecked(true);
                    message += cbf2.getText() + " is checked.  ";
                    Toast.makeText(getApplicationContext(), message, Toast.LENGTH_SHORT).show();
                } else {
                    cbf2.setChecked(false);
                    message += cbf2.getText() + " is unchecked.  ";
                    Toast.makeText(getApplicationContext(), message, Toast.LENGTH_SHORT).show();
                }

            }
        });

        cbf3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String message ="";
                if (cbf3.isChecked()) {
                    cbf3.setChecked(true);
                    message += cbf3.getText() + " is checked.  ";
                    Toast.makeText(getApplicationContext(), message, Toast.LENGTH_SHORT).show();
                } else {
                    cbf3.setChecked(false);
                    message += cbf3.getText() + " is unchecked.  ";
                    Toast.makeText(getApplicationContext(), message, Toast.LENGTH_SHORT).show();
                }

            }
        });

        cbf4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String message ="";
                if (cbf4.isChecked()) {
                    cbf4.setChecked(true);
                    message += cbf4.getText() + " is checked.  ";
                    Toast.makeText(getApplicationContext(), message, Toast.LENGTH_SHORT).show();
                } else {
                    cbf4.setChecked(false);
                    message += cbf4.getText() + " is unchecked.  ";
                    Toast.makeText(getApplicationContext(), message, Toast.LENGTH_SHORT).show();
                }

            }
        });

        cbf5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String message ="";
                if (cbf5.isChecked()) {
                    cbf5.setChecked(true);
                    message += cbf5.getText() + " is checked.  ";
                    Toast.makeText(getApplicationContext(), message, Toast.LENGTH_SHORT).show();
                } else {
                    cbf5.setChecked(false);
                    message += cbf5.getText() + " is unchecked.  ";
                    Toast.makeText(getApplicationContext(), message, Toast.LENGTH_SHORT).show();
                }

            }
        });

        cbf6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String message ="";
                if (cbf6.isChecked()) {
                    cbf6.setChecked(true);
                    message += cbf6.getText() + " is checked.  ";
                    Toast.makeText(getApplicationContext(), message, Toast.LENGTH_SHORT).show();
                } else {
                    cbf6.setChecked(false);
                    message += cbf6.getText() + " is unchecked.  ";
                    Toast.makeText(getApplicationContext(), message, Toast.LENGTH_SHORT).show();
                }

            }
        });

        cbf7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String message ="";
                if (cbf7.isChecked()) {
                    cbf7.setChecked(true);
                    message += cbf7.getText() + " is checked.  ";
                    Toast.makeText(getApplicationContext(), message, Toast.LENGTH_SHORT).show();
                } else {
                    cbf7.setChecked(false);
                    message += cbf7.getText() + " is unchecked.  ";
                    Toast.makeText(getApplicationContext(), message, Toast.LENGTH_SHORT).show();
                }

            }
        });

        cbf8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String message ="";
                if (cbf8.isChecked()) {
                    cbf8.setChecked(true);
                    message += cbf8.getText() + " is checked.  ";
                    Toast.makeText(getApplicationContext(), message, Toast.LENGTH_SHORT).show();
                } else {
                    cbf8.setChecked(false);
                    message += cbf8.getText() + " is unchecked.  ";
                    Toast.makeText(getApplicationContext(), message, Toast.LENGTH_SHORT).show();
                }

            }
        });

        cbf9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String message ="";
                if (cbf9.isChecked()) {
                    cbf9.setChecked(true);
                    message += cbf9.getText() + " is checked.  ";
                    Toast.makeText(getApplicationContext(), message, Toast.LENGTH_SHORT).show();
                } else {
                    cbf9.setChecked(false);
                    message += cbf9.getText() + " is unchecked.  ";
                    Toast.makeText(getApplicationContext(), message, Toast.LENGTH_SHORT).show();
                }

            }
        });

        cbf10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String message ="";
                if (cbf10.isChecked()) {
                     
                    message += cbf10.getText() + " is checked.  ";
                    Toast.makeText(getApplicationContext(), message, Toast.LENGTH_SHORT).show();
                } else {
                     
                    message += cbf10.getText() + " is unchecked.  ";
                    Toast.makeText(getApplicationContext(), message, Toast.LENGTH_SHORT).show();
                }

            }
        });
    }

    public void floodtobring (View v) {
        Intent i = null, chooser = null;
        if (v.getId() == R.id.back) {
            i = new Intent(this, Flood.class);
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
            case R.id.cbf1:
                saveInSp("cbf1",isChecked);
                break;
            case R.id.cbf2:
                saveInSp("cbf2",isChecked);
                break;

            case R.id.cbf3:
                saveInSp("cbf3",isChecked);
                break;

            case R.id.cbf4:
                saveInSp("cbf4",isChecked);
                break;

            case R.id.cbf5:
                saveInSp("cbf5",isChecked);
                break;
            case R.id.cbf6:
                saveInSp("cbf6",isChecked);
                break;
            case R.id.cbf7:
                saveInSp("cbf7",isChecked);
                break;
            case R.id.cbf8:
                saveInSp("cbf8",isChecked);
                break;
            case R.id.cbf9:
                saveInSp("cbf9",isChecked);
                break;
            case R.id.cbf10:
                saveInSp("cb10",isChecked);
                break;
        }

    }

   /* public void saveData(View v){
        SharedPreferences sp = getSharedPreferences("floodcb", MODE_PRIVATE);
        SharedPreferences.Editor editor = sp.edit();
        boolean value = sp.getBoolean("KEY", false);


        editor.putBoolean("KEY", value);
        editor.commit();


        Toast.makeText(this,"Data saved...",Toast.LENGTH_LONG).show();
    }*/




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
