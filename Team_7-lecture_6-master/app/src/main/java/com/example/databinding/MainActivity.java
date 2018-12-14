package com.example.databinding;

import android.app.Activity;
import android.databinding.DataBindingUtil;
import android.os.Bundle;

import com.example.databinding.databinding.ActivityMainBinding;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMainBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
       Port port = new Port();
        port.setName("Пример");
        binding.setUser(port);
    }
}
