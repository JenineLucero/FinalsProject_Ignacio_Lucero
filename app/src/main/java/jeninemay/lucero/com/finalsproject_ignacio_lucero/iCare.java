package jeninemay.lucero.com.finalsproject_ignacio_lucero;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class iCare extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_i_care);
    }

    public void process1(View v) {
        Intent i = null, chooser = null;
        if (v.getId() == R.id.btn_lets) {
            i = new Intent(this, DisasterList.class);
            startActivity(i);

        }
    }
}
