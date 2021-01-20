package com.example.quizofkings;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.icu.lang.UScript;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
public class LoginActivity extends AppCompatActivity {
     EditText username;
     EditText password;
     Button buttonLogin;
     TextView loginUser;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loginactivity);
        buttonLogin = (Button) findViewById(R.id.btnLog);
        username = (EditText) findViewById(R.id.usernameText);
        password = (EditText) findViewById(R.id.passwordText);
        loginUser = (TextView) findViewById(R.id.loginUser);
        final ArrayList<User> users=SignUpActivity.myUsers;
        buttonLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                for (int i=0;i<users.size();i++)
                {
                    if(users.get(i).getUsername().equals(username.getText().toString()))
                    {
                        if(users.get(i).getPassword().equals(password.getText().toString()))
                        {
                            openGame();
                        }
                        else
                        {
                            Toast.makeText(getApplicationContext(),"invalid Password",Toast.LENGTH_LONG).show();
                        }
                    }
                    else
                    {
                        Toast.makeText(getApplicationContext(),"invalid Username",Toast.LENGTH_LONG).show();
                    }
                }

            }
        });
    }
    public void openGame(){
        Intent intent = new Intent(this, GameActivity.class);
        startActivity(intent);
    }
}