package jeninemay.lucero.com.finalsproject_ignacio_lucero;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class VolcanicErruption extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_volcanic_erruption);
    }

    public void volcanic (View v) {
        Intent i = null, chooser = null;
        if (v.getId() == R.id.back) {
            i = new Intent(this, DisasterList.class);
            startActivity(i);

        } else if (v.getId() == R.id.volc_what) {
            i = new Intent(this, VolcanicToDo.class);
            startActivity(i);

        }
    }
}
