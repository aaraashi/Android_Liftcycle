package com.example.juheekim_comp304lab1_ex2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ARActivity extends AppCompatActivity {

    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ar);

        Intent intent = getIntent();
        String result = intent.getStringExtra("activity");
        textView = findViewById(R.id.arTextView);
        textView.setText(result + " Life Cycle: \n");
        textView.append("onCreate() executed\n");
    }
    public void onStart()
    {
        super.onStart();
        textView.append("onStart() executed\n");
    }
    public  void onStop()
    {
        super.onStop();
        textView.append("onStop() executed\n");
    }
    public  void onDestroy()
    {
        super.onDestroy();
        textView.append("onDestroy() executed\n");
    }

}
