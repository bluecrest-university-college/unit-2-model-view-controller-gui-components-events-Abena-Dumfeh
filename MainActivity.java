package com.maame.trafficlight;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private View colorView;
    private Button tapHere;
    private int[] colors;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        colors = new int[]{Color.RED, Color.YELLOW, Color.GREEN};

        colorView = findViewById(R.id.colorView);


        tapHere = (Button) findViewById(R.id.tapHere);
        tapHere.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int colorArray = colors.length;

                Random random = new Random();
                int randomNum = random.nextInt(colorArray);

                colorView.setBackgroundColor(colors[randomNum]);
            }
        });
    }
}
