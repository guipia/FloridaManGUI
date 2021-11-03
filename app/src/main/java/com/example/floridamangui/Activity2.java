package com.example.floridamangui;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;

public class Activity2 extends AppCompatActivity {
    private Button a1;
    private Button a2;
    private Button a3;
    private Button a4;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        a1 = (Button) findViewById(R.id.button2);
        a2 = (Button) findViewById(R.id.button3);
        a3 = (Button) findViewById(R.id.button4);
        a4 = (Button) findViewById(R.id.button5);
    }
}