package jeninemay.lucero.com.finalsproject_ignacio_lucero;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class FloodToDo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_flood_to_do);

    }


    public void processs(View v) {
        Intent i = null, chooser = null;
        if (v.getId() == R.id.btn_back) {
            i = new Intent(this, Flood.class);
            startActivity(i);

        }
    }
}