package jeninemay.lucero.com.finalsproject_ignacio_lucero;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class DisasterList extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_disaster_list);
        Log.d( "LIFECYCLE", "onCreate() has executed...");
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



    public void process2(View v) {
        Intent i = null, chooser = null;
        if (v.getId() == R.id.btn_back) {
            i = new Intent(this, iCare.class);
            startActivity(i);

        } else if (v.getId() == R.id.txtflood) {
            i = new Intent(this, Flood.class);
            startActivity(i);

        }
        else if (v.getId() == R.id.txtland) {
            i = new Intent(this, LandSlide.class);
            startActivity(i);

        }

        else if (v.getId() == R.id.txttyphoon) {
            i = new Intent(this, Typhoon.class);
            startActivity(i);

        }

        else if (v.getId() == R.id.txtvolcanic) {
            i = new Intent(this, VolcanicErruption.class);
            startActivity(i);

        }
    }
}
