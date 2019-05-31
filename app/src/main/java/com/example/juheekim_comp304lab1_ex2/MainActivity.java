package com.example.juheekim_comp304lab1_ex2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    DisplayFragment fragment;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //TextView tvDisplay = (TextView) findViewById(R.id.showText);
        fragment = (DisplayFragment) getSupportFragmentManager().findFragmentById(R.id.displayFragment);
        //fragment = (DisplayFragment)fragmentManager.findFragmentById(R.id.displayFragment);

        String status = "Main Activity: \n onCreate() executed";
        fragment.displayLifeCycle(status);


    }

    @Override
    protected void onStart() {
        super.onStart();
        String status = "Main Activity: \n onStart() executed";
        fragment.displayLifeCycle(status);

    }

    @Override
    protected void onStop() {
        super.onStop();
        String status = "onStart() executed";
        fragment.displayLifeCycle(status);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        String status = "onStart() executed";
        fragment.displayLifeCycle(status);
    }
}
