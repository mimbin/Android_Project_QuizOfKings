package com.example.quizofkings;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;

public class AddEmailActivity extends AppCompatActivity {
    TextView textView;
    TextView warning;
    Button add;
    EditText emailAdd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_email);
        textView=(TextView) findViewById(R.id.emailAdding);
        add=(Button)findViewById(R.id.emailText);
        emailAdd=(EditText) findViewById(R.id.email);
        warning=(TextView) findViewById(R.id.warning);
        final ArrayList<String> emails=new ArrayList<>();
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                while (true)
                {
                    if(emails.contains(emailAdd.getText().toString()))
                    {
                        warning.setText("ایمیل قبلا ثبت شده است");
                    }
                    else
                    {
                        emails.add(emailAdd.getText().toString());
                        Intent intent=new Intent(AddEmailActivity.this,GameActivity.class);
                        startActivity(intent);
                        break;
                    }

                }
            }
        });
    }
}