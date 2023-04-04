package com.ac.prj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class level1 extends AppCompatActivity {
Button sub,sub2,btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level1);
        sub=findViewById(R.id.sub);
        sub2=findViewById(R.id.sub2);
        btn=findViewById(R.id.btn);
        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String msg="30";
                Intent i = new Intent(getApplicationContext(), level2.class);
                i.putExtra("msg1",msg);
                startActivity(i);
            }
        });
        sub2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String msg="20";
                Intent i = new Intent(getApplicationContext(), level2.class);
                i.putExtra("msg1",msg);
                startActivity(i);
            }
        });
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ImageView img = (ImageView) findViewById(R.id.img);
                ImageView img2 = (ImageView) findViewById(R.id.img2);
                ImageView text = (ImageView) findViewById(R.id.text);
                ImageView text2 = (ImageView) findViewById(R.id.text2);
                img2.setVisibility(View.VISIBLE);
                img.setVisibility(View.INVISIBLE);
                text2.setVisibility(View.VISIBLE);
                text.setVisibility(View.INVISIBLE);
                sub.setVisibility(View.INVISIBLE);
                sub2.setVisibility(View.VISIBLE);

            }
        });
    }

    public void home(View view) {
        Intent i=new Intent(level1.this, screen3.class);
        startActivity(i);
    }

    public void right(View view) {
        Intent i=new Intent(level1.this, level2.class);
        startActivity(i);
    }

//    public void chn(View view) {
//
//
//    }
}