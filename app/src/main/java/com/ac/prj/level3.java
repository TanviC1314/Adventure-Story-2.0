package com.ac.prj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class level3 extends AppCompatActivity {
    TextView t1;
    Button sub,sub2,btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level3);
        Intent i=getIntent();
        String msg=i.getStringExtra("stotal");
        sub=findViewById(R.id.sub);
        sub2=findViewById(R.id.sub2);
        btn=findViewById(R.id.btn);
        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int stotal = Integer.parseInt(msg) + 35;
                String total= String.valueOf(stotal);
                Intent i = new Intent(getApplicationContext(), result.class);
                i.putExtra("stotal",total);
                startActivity(i);
            }
        });
        sub2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int stotal = Integer.parseInt(msg) + 20;
                String total= String.valueOf(stotal);
                Intent i = new Intent(getApplicationContext(), result.class);
                i.putExtra("stotal",total);
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
}