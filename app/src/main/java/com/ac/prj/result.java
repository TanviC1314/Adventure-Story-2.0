package com.ac.prj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class result extends AppCompatActivity {
    private MediaPlayer mp;
    TextView t1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        t1=findViewById(R.id.t1);
        Intent i=getIntent();

        String no = i.getStringExtra("stotal");
        int stotal = Integer.parseInt(no);
        String total= no +"%";
        t1.setText(total);
        ImageView party = (ImageView) findViewById(R.id.img3);
        ImageView ok = (ImageView) findViewById(R.id.img5);
        ImageView s2 = (ImageView) findViewById(R.id.img4);
        ImageView s3 = (ImageView) findViewById(R.id.img6);
        if(stotal >= 61){
            party.setVisibility(View.VISIBLE);
            s3.setVisibility(View.VISIBLE);
        }
        else if(stotal <61){
            ok.setVisibility(View.VISIBLE);
            s2.setVisibility(View.VISIBLE);
        }
    }
    public void home(View view) {

        Intent i=new Intent(result.this, level1.class);
        startActivity(i);
    }
}