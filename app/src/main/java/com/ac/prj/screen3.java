package com.ac.prj;

import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;
import android.media.MediaPlayer;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class screen3 extends AppCompatActivity {
    private MediaPlayer mp;
    String msg;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen3);
        mp = MediaPlayer.create(this,R.raw.game);
        mp.setLooping(true);

    }


    public void changei(View view) {
       ImageView volume = (ImageView) findViewById(R.id.volume);
       ImageView mute = (ImageView) findViewById(R.id.mute);
        mute.setVisibility(View.VISIBLE);
        volume.setVisibility(View.INVISIBLE);
        mp.pause();
        msg = "0";
     }

    public void changea(View view) {
        ImageView volume = (ImageView) findViewById(R.id.volume);
        ImageView mute = (ImageView) findViewById(R.id.mute);
        volume.setVisibility(View.VISIBLE);
        mute.setVisibility(View.INVISIBLE);
        mp.start();
        msg = "1";
    }

    public void run(View view) {
        mp.start();
        Intent i=new Intent(screen3.this, level1.class);
        startActivity(i);

    }

}