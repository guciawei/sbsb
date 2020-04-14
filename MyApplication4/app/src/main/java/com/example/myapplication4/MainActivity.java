package com.example.myapplication4;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final Button button1=(Button)findViewById(R.id.button1);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent wz1=new Intent(
                        MainActivity.this,
                        Main2Activity.class);
                startActivity(wz1);
            }
        });
        final Button button2=(Button)findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent wz2=new Intent(
                        MainActivity.this,
                        Main3Activity.class);
                startActivity(wz2);
            }
        });
        final Button button3=(Button)findViewById(R.id.button3);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent wz3=new Intent(
                        MainActivity.this,
                        Main4Activity.class);
                startActivity(wz3);
            }
        });
        final Button button4=(Button)findViewById(R.id.button4);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent xx=new Intent(
                        MainActivity.this,
                        Main5Activity.class);
                startActivity(xx);
            }
        });
    }
}
