package jeninemay.lucero.com.finalsproject_ignacio_lucero;

import android.content.SharedPreferences;
import java.util.ArrayList;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;

public class CheckboxPreference {
    SharedPreferences pref;

    ArrayList<CheckBox> cb = new ArrayList<CheckBox>();

    Editor editor;

    Context _context;

    public CheckboxPreference(Context context){
        this._context = context;
        pref = _context.getSharedPreferences("storage", 0);
        editor = pref.edit();
    }

//    public void setCb(){
//        for(int i = 1; i <= 7; i++){
//            String id_of_checkbox = "cbl" + i;
//            cb.add(i, (CheckBox)findViewById(getResources().getIdentifier(id_of_checkbox, "id", getPackageName())));
//            if(pref.getBoolean("isChecked", false)){
//                cb.get(i).setChecked(true);
//            }
//        }
//    }
//
//    public void is_Checked(){
//        for(int j = 1; j <= 7; j++){
//            if(cb.get(j).isChecked()) {
//                editor.putBoolean("isChecked" + j, true);
//            }
//        }
//        editor.commit();
//    }
}
