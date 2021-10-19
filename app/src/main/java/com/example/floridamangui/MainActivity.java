package com.example.floridamangui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button loginbutton;
    private class Player{
        private int primaryID;
        private String username;
        private String password;
        private String fullName;
        private int bestScore;
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        loginbutton = (Button) findViewById(R.id.button1);
        loginbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity2();
            }
        });
    }

    public void openActivity2(){
        Intent intent = new Intent(this, Activity2.class);
        startActivity(intent);
    }

    public boolean check(String n, String pw){
        boolean check = false;
        String name = n;
        String passCode = pw;


        Player player1 = new Player();
        player1.primaryID = 1;
        player1.username = "Guipia";
        player1.password = "MyPassword";
        player1.fullName = "Guilherme Piacsek";
        player1.bestScore = 0;

        Player player2 = new Player();
        player1.primaryID = 2;
        player1.username = "Mr. U";
        player1.password = "HisPassword";
        player1.fullName = "Joseph Uriarte";
        player1.bestScore = 0;

        Player player3 = new Player();
        player1.primaryID = 3;
        player1.username = "Gabriel";
        player1.password = "AnotherPassword";
        player1.fullName = "Gabriel Rocha";
        player1.bestScore = 0;

        if(name.equals(player1.username) && passCode.equals(player1.password)){

        }
    }

   // public void sendMessage(View view) {
       // Intent intent = new Intent()
    }
//}