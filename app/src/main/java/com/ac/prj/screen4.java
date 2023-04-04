package com.ac.prj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Handler;
import android.widget.TextView;
import android.widget.Toast;

public class screen4 extends AppCompatActivity {
    private MediaPlayer mp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen4);
        mp = MediaPlayer.create(this,R.raw.game);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                mp.pause();
                startActivity(new Intent(screen4.this, screen3.class));
                finish();
            }
        }, 7000);
    }
}