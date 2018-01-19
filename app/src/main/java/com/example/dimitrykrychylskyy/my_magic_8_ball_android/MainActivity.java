package com.example.dimitrykrychylskyy.my_magic_8_ball_android;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button askButton;
        askButton = findViewById(R.id.button_ask);

        final ImageView mainImage = findViewById(R.id.image_start);

        final int[] reponcesImages = {
                R.drawable.ball2,
                R.drawable.ball3,
                R.drawable.ball4,
                R.drawable.ball5,
        };

        askButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random randomNumberGenetator = new Random();
                int number = randomNumberGenetator.nextInt(4);

                mainImage.setImageResource(reponcesImages[number]);
            }
        });

    }
}
