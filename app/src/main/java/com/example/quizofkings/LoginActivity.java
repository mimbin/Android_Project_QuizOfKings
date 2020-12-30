package com.example.quizofkings;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity {
    ImageView imageView3;
     EditText text7;
     EditText text8;
     Button button4;
     TextView text9;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loginactivity);
        imageView3=(ImageView)findViewById(R.id.img3);
        button4=(Button)findViewById(R.id.btn4);
        text7=(EditText)findViewById(R.id.text7);
        text8=(EditText)findViewById(R.id.text8);
        text9=(TextView)findViewById(R.id.text9);
        String username=text7.getText().toString();
        String password=text8.getText().toString();


    }
}