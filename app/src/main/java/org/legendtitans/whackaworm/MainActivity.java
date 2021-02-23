package org.legendtitans.whackaworm;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.text.AutoText;
import android.util.Log;
import android.view.DragEvent;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @SuppressLint("ClickableViewAccessibility")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView imageViewPlay = (ImageView) findViewById(R.id.playImageView);
        imageViewPlay.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                //Update this code so you go to the next activity (worm gameboard)

                Intent intent = new Intent(getApplicationContext(), LevelOneActivity.class);
                startActivity(intent);

                return true;
            }
        });
    }
}