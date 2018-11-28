package jeninemay.lucero.com.finalsproject_ignacio_lucero;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class Flood extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_flood);

    }




    public void process3(View v) {
        Intent i = null, chooser = null;
        if (v.getId() == R.id.btn_back) {
            i = new Intent(this, DisasterList.class);
            startActivity(i);

        } else if (v.getId() == R.id.flood_what) {
            i = new Intent(this, FloodToDo.class);
            startActivity(i);

        }
        else if (v.getId() == R.id.flood_bring) {
            i = new Intent(this, ToBring.class);
            startActivity(i);

        }
    }
}