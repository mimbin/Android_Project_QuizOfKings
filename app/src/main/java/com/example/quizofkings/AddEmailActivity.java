package com.example.quizofkings;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.UriMatcher;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;

class emailExeption extends Exception
{
    emailExeption(String msg)
    {
        super(msg);
    }
}
public class AddEmailActivity extends AppCompatActivity {
    TextView textView;
    TextView warning;
    Button add;
    EditText emailAdd;
    EditText Username;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_email);
        textView=(TextView) findViewById(R.id.emailAdding);
        add=(Button)findViewById(R.id.emailText);
        emailAdd=(EditText) findViewById(R.id.email);
        Username=(EditText) findViewById(R.id.Username);
        warning=(TextView) findViewById(R.id.warning);
        final ArrayList<User> myList=SignUpActivity.myUsers;
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                try {
                    checkEmail(myList,emailAdd.getText().toString());
                    for (int i=0;i<myList.size();i++)
                    {
                        if(myList.get(i).getUsername().equals(Username.getText().toString()))
                        {
                            myList.get(i).setEmail(emailAdd.getText().toString());
                            myList.get(i).setCoins(20);
                            break;
                        }
                    }
                    Intent intent=new Intent(AddEmailActivity.this,GameActivity.class);

                } catch (emailExeption e) {
                    warning.setText(e.getMessage());
                }
            }
        });
    }

    public static void checkEmail(ArrayList<User> users,String email) throws emailExeption {
        for (int i=0;i<users.size();i++)
        {
            if(users.get(i).getEmail().equals(email))
            {
                throw new emailExeption("ایمیل قبلا ثبت شده است");
            }
        }
    }
}