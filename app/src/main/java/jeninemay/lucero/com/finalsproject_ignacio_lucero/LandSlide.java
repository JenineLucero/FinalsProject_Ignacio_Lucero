package jeninemay.lucero.com.finalsproject_ignacio_lucero;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class LandSlide extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_land_slide);

    }

     public void landslide (View v) {
        Intent i = null, chooser = null;
        if (v.getId() == R.id.land_back2) {
            i = new Intent(this, DisasterList.class);
            startActivity(i);

        } else if (v.getId() == R.id.land_what) {
            i = new Intent(this, LandSlideToDo.class);
            startActivity(i);

        }
        else if (v.getId() == R.id.land_bring) {
            i = new Intent(this, ToBring.class);
            startActivity(i);

        }
    }
}
