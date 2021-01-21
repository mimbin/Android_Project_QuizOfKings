package com.example.quizofkings;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    Button buttonSignUp;
    Button buttonLogin;
    ImageView imageView1;
    public static ArrayList<User> users=new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        User user=new User("zahra","12345");
        users.add(user);
        buttonSignUp=(Button)findViewById(R.id.newUserButton);
        buttonLogin=(Button)findViewById(R.id.LoginWelcomeButton);
        buttonSignUp.setOnClickListener(new View.OnClickListener() {
           @Override
            public void onClick(View v) {
                openSignUp();

           }
     });
        buttonLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openLogin();
           }
       });
    }
//give it a try
    public void openLogin(){
        Intent intent = new Intent(this, LoginActivity.class);
        startActivity(intent);
    }

    public void openSignUp(){
        Intent intent = new Intent(this, SignUpActivity.class);
        startActivity(intent);
    }
}