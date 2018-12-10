package jeninemay.lucero.com.finalsproject_ignacio_lucero;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import java.util.ArrayList;
import jeninemay.lucero.com.finalsproject_ignacio_lucero.CheckboxPreference;

public class ToBringLandslide extends AppCompatActivity {

//    ArrayList<CheckBox> cb = new ArrayList<CheckBox>();
//    SharedPreferences pref = getApplicationContext().getSharedPreferences("storage", 0);
//    Editor editor = pref.edit();
    private CheckboxPreference prefCheck = new CheckboxPreference(getApplicationContext());

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_to_bring_landslide);
        Log.d( "LIFECYCLE", "onCreate() has executed...");

        for(int i = 1; i <= 7; i++){
            String id_of_checkbox = "cbl" + i;
            prefCheck.cb.add(i, (CheckBox)findViewById(getResources().getIdentifier(id_of_checkbox, "id", getPackageName())));
            if(prefCheck.pref.getBoolean("isChecked", false)){
                prefCheck.cb.get(i).setChecked(true);
            }
        }
    }
//    public void save(){
//        cb.is_Checked();
//    }
    public void is_Checked(View view){
        for(int j = 1; j <= 7; j++){
            if(prefCheck.cb.get(j).isChecked()) {
                prefCheck.editor.putBoolean("isChecked" + j, true);
            }
        }
        prefCheck.editor.commit();
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
