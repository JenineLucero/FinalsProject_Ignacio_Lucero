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
        else if (v.getId() == R.id.imagevolcanic) {
            i = new Intent(this, VolcanicErruption.class);
            startActivity(i);

        }
        else if (v.getId() == R.id.imageflood) {
            i = new Intent(this, Flood.class);
            startActivity(i);

        }
        else if (v.getId() == R.id.imageland) {
            i = new Intent(this, LandSlide.class);
            startActivity(i);

        }
        else if (v.getId() == R.id.imagetyphoon) {
            i = new Intent(this, Typhoon.class);
            startActivity(i);

        }
    }
}
