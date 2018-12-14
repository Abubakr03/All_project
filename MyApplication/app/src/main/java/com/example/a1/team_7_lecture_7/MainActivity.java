package com.example.a1.team_7_lecture_7;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Start(View view) {
        Button button=(Button) findViewById(R.id.button);
        final Animation animation=AnimationUtils.loadAnimation(this,R.anim.bounce);
        button.startAnimation(animation);
    }
}
