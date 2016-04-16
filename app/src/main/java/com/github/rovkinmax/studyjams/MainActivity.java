package com.github.rovkinmax.studyjams;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {


    private TextView tablo;

    private int counter = 0;

    //http://bit.ly/jamtele
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.espresso_plus).setOnClickListener(this);
        findViewById(R.id.espresso_minus).setOnClickListener(this);
        tablo = (TextView) findViewById(R.id.espresso_tablo);
        tablo.setText(String.valueOf(counter));
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.espresso_plus){
            counter = counter + 1;
        } else if (v.getId() == R.id.espresso_minus){
            counter = counter - 1;
        }

        tablo.setText(String.valueOf(counter));
    }
}
