package com.example.quizofkings;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class AddEmailActivity extends AppCompatActivity {
    TextView textView;
    Button add;
    EditText emailAdd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_email);
        textView.findViewById(R.id.emailAdding);
        add.findViewById(R.id.emailText);
        emailAdd.findViewById(R.id.email);
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //add email to user information
                Intent intent=new Intent(AddEmailActivity.this,GameActivity.class);
                startActivity(intent);
            }
        });
    }
}