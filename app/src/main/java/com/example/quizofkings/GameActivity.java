package com.example.quizofkings;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

public class GameActivity extends AppCompatActivity {

    ImageView imageView5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);
        imageView5=(ImageView)findViewById(R.id.img4);
    }
}