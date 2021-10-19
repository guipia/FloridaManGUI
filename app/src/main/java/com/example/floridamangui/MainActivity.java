package com.example.floridamangui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button loginbutton;
    private EditText name;
    private EditText pw;

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
        name = (EditText) findViewById(R.id.textUsername);
        pw = (EditText) findViewById(R.id.textPassword);

        loginbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity2();
            }
        });
    }

    public void openActivity2(){
        Intent intent = new Intent(this, Activity2.class);

        if(check(name.getText().toString(), pw.getText().toString()) == true){
            startActivity(intent);
            Toast.makeText(MainActivity.this, "That really is you!", Toast.LENGTH_SHORT).show();
        }
        else{
            Toast.makeText(MainActivity.this, "Not today homie", Toast.LENGTH_SHORT).show();
        }

    }

    public boolean check(String name, String pw){
        boolean check = false;

        String temp1 = name;
        String temp2 = pw;


        Player player1 = new Player();
        player1.primaryID = 1;
        player1.username = "Guipia";
        player1.password = "MyPassword";
        player1.fullName = "Guilherme Piacsek";
        player1.bestScore = 0;

        Player player2 = new Player();
        player2.primaryID = 2;
        player2.username = "Mr. U";
        player2.password = "HisPassword";
        player2.fullName = "Joseph Uriarte";
        player2.bestScore = 0;

        Player player3 = new Player();
        player3.primaryID = 3;
        player3.username = "Gabriel";
        player3.password = "AnotherPassword";
        player3.fullName = "Gabriel Rocha";
        player3.bestScore = 0;


        if(temp1.equals(player1.username) && temp2.equals(player1.password)){
            check = true;
        }
        else if(name.equals(player2.username) && pw.equals(player2.password)){
            check = true;
        }
        else if(name.equals(player3.username) && pw.equals(player3.password)){
            check = true;
        }
        return check;
    }

    }
//}