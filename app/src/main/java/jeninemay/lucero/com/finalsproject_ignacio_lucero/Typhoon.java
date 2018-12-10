package jeninemay.lucero.com.finalsproject_ignacio_lucero;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class Typhoon extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_typhoon);

    }


    public void typhoon (View v) {
        Intent i = null, chooser = null;
        if (v.getId() == R.id.back) {
            i = new Intent(this, DisasterList.class);
            startActivity(i);

        } else if (v.getId() == R.id.typhoon_what) {
            i = new Intent(this, TyphoonToDo.class);
            startActivity(i);

        }
        else if (v.getId() == R.id.typhoon_bring) {
            i = new Intent(this, ToBringTyphoon.class);
            startActivity(i);

        }
    }
}
