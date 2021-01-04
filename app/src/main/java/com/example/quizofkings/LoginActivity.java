package com.example.quizofkings;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity {
     EditText username;
     EditText password;
     Button buttonLogin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loginactivity);
        buttonLogin=(Button)findViewById(R.id.btnLog);
        username=(EditText)findViewById(R.id.usernameText);
        password=(EditText)findViewById(R.id.passwordText);
        String UserName=username.getText().toString();
        String Password=password.getText().toString();
        buttonLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openGame();

            }
        });
    }
    public void openGame(){
        Intent intent = new Intent(this, GameActivity.class);
        startActivity(intent);
    }
}