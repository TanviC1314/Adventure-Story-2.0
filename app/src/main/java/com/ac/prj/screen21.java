package com.ac.prj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class screen21 extends AppCompatActivity {
    EditText name,email,psw;
    Button sub;
    int msg =0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activityscreen21);
        name= findViewById(R.id.name);
        email= findViewById(R.id.email);
        psw= findViewById(R.id.psw);
        sub= findViewById(R.id.sub);

    }

    public void validf(View view) {


            if (TextUtils.isEmpty(name.getText().toString())) {
                name.setText("Invalid Name");
                msg = 1;
            }
            else{
                msg=0;
            }
            if (TextUtils.isEmpty(email.getText().toString())) {
                email.setText("Invalid Email");
                msg = 1;
            }
            else{
                msg=0;
            }
            if (TextUtils.isEmpty(psw.getText().toString())) {
                Toast.makeText(this, "Invalid Password", Toast.LENGTH_LONG).show();
                msg = 1;
            } else if (psw.length() < 6) {
                Toast.makeText(this, "Password should be of min 6 char", Toast.LENGTH_LONG).show();
                msg = 1;
            }
            else{
                msg=0;
            }


        if(msg == 0){
            startActivity(new Intent(screen21.this, screen3.class));
        }
//        else{
//            sub.setEnabled(false);
//        }
    }
}