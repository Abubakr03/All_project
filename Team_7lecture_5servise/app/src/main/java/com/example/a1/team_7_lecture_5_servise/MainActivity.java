package com.example.a1.team_7_lecture_5_servise;

import android.content.Intent;
import android.media.MediaPlayer;
import android.provider.Settings;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
private Button start,stop;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        start=(Button) findViewById(R.id.buttonStart);
        stop=(Button) findViewById(R.id.buttonStop);
        start.setOnClickListener(this);
        stop.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
 if(v==start)
 {
startService(new Intent(this,HelloServise.class));
 }
 else
     if(v==stop)
     {
stopService(new Intent(this,HelloServise.class));
     }
    }
}
