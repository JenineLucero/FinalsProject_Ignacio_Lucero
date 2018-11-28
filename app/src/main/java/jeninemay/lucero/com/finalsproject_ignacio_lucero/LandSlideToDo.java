package jeninemay.lucero.com.finalsproject_ignacio_lucero;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class LandSlideToDo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_land_slide_to_do);

    }


    public void landslidetodo (View v) {
        Intent i = null, chooser = null;
        if (v.getId() == R.id.land_back1) {
            i = new Intent(this, LandSlide.class);
            startActivity(i);

        }
    }
}
