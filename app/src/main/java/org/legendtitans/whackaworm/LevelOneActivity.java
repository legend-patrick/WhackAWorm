package org.legendtitans.whackaworm;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class LevelOneActivity extends AppCompatActivity {
    TextView textView;
    ImageView imageViewWorm1;
    ImageView imageViewWorm2;
    ImageView imageViewWorm3;
    ImageView imageViewWorm4;
    ImageView imageViewWorm5;
    ImageView imageViewWorm6;
    ImageView imageViewWorm7;
    ImageView imageViewWorm8;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level_one);

        textView = findViewById(R.id.timerTextView);
        imageViewWorm1 = findViewById(R.id.imageViewWorm1);
        imageViewWorm2 = findViewById(R.id.imageViewWorm2);
        imageViewWorm3 = findViewById(R.id.imageViewWorm3);
        imageViewWorm4 = findViewById(R.id.imageViewWorm4);
        imageViewWorm5 = findViewById(R.id.imageViewWorm5);
        imageViewWorm6 = findViewById(R.id.imageViewWorm6);
        imageViewWorm7 = findViewById(R.id.imageViewWorm7);
        imageViewWorm8 = findViewById(R.id.imageViewWorm8);

        imageViewWorm1.setVisibility(View.INVISIBLE);
        imageViewWorm2.setVisibility(View.INVISIBLE);
        imageViewWorm3.setVisibility(View.INVISIBLE);
        imageViewWorm4.setVisibility(View.INVISIBLE);
        imageViewWorm5.setVisibility(View.INVISIBLE);
        imageViewWorm6.setVisibility(View.INVISIBLE);
        imageViewWorm7.setVisibility(View.INVISIBLE);
        imageViewWorm8.setVisibility(View.INVISIBLE);

        new CountDownTimer(50000, 1000) {
            public void onTick(long millisUntilFinished) {
                long sec = millisUntilFinished / 1000;
                textView.setText(sec+"");
            }
            // When the task is over it will print 00:00:00 there
            public void onFinish() {
                textView.setText("0");
            }
        }.start();

        //Make a worm appear and than disappear after 3 seconds
        new CountDownTimer(3000, 3000) {
            public void onTick(long millisUntilFinished) {
               //Call this every 3 seconds and make a worm appear or disappear
                imageViewWorm1.setVisibility(View.VISIBLE);
            }

            public void onFinish() {
                //What should you do when this goes off?
                imageViewWorm1.setVisibility(View.INVISIBLE);
            }
        }.start();

    }
}