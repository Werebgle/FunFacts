package com.itstime2gohunting.funfacts;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.Random;

public class FunFactsActivity extends AppCompatActivity {

    private FactBook mFactBook = new FactBook();
    private ColorWheel mColorWheel = new ColorWheel();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fun_facts);
        final RelativeLayout backgroundColor = (RelativeLayout)findViewById(R.id.layoutColor);
        final TextView factLabel = (TextView) findViewById(R.id.factTextView);
        final Button showFactButton = (Button) findViewById(R.id.showFactButton);
        final View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String fact = mFactBook.getFact();
                int myColor = mColorWheel.getColor();



                //Update label with dynamic fact
                factLabel.setText(fact);
                backgroundColor.setBackgroundColor(myColor);
            }


        };
            showFactButton.setOnClickListener(listener);

    }

}
