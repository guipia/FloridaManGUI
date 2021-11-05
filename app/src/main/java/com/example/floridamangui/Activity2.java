package com.example.floridamangui;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;

public class Activity2 extends AppCompatActivity {
    private Button a1;
    private Button a2;
    private Button a3;
    private Button a4;
    private TextView t1;
    private TextView s1;
    private TextView s2;
    int i = 1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
        int currentScore = 0;
        int maxScore = 0;

        a1 = (Button) findViewById(R.id.button2);
        a2 = (Button) findViewById(R.id.button3);
        a3 = (Button) findViewById(R.id.button4);
        a4 = (Button) findViewById(R.id.button5);
        t1 = (TextView) findViewById(R.id.Head);
        t1.setText("Question: " + i);
        s1 = (TextView) findViewById(R.id.textView4);
        s1.setText(currentScore);
        s2 = (TextView) findViewById(R.id.textView5);
        s2.setText(maxScore);


    }

    public void setRound(){
        ArrayList<String> setQuestions = new ArrayList<String>();

       // setQuestions.add(HeadlineBank.myHeadlines.get(1));
    }
    public boolean checkRound(){
        boolean result = false;

        return result;
    }
}