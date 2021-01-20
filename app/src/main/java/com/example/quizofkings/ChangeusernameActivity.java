package com.example.quizofkings;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;


class UsernameExeption extends Exception{
    UsernameExeption(String msg)
    {
        super(msg);
    }
}
public class ChangeusernameActivity extends AppCompatActivity {
    TextView textView;
    TextView warning2;
    Button add;
    EditText newUsername;
    EditText preUsername;
    public static ArrayList<User> userArrayList=SignUpActivity.myUsers;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_changeusername);
        textView=(TextView) findViewById(R.id.changeUsername);
        warning2=(TextView) findViewById(R.id.warning2);
        add=(Button)findViewById(R.id.addNewUsername);
        newUsername=(EditText) findViewById(R.id.newUsername);
        preUsername=(EditText) findViewById(R.id.preUsername);
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    checkUsername(userArrayList,newUsername.getText().toString());
                    for (int i=0;i<userArrayList.size();i++)
                    {
                        if(userArrayList.get(i).equals(preUsername.getText().toString()))
                        {
                            userArrayList.get(i).setUsername(newUsername.getText().toString());
                        }
                        break;
                    }
                    Intent intent=new Intent(getApplicationContext(),GameActivity.class);
                    startActivity(intent);

                } catch (UsernameExeption e) {
                    warning2.setText(e.getMessage());
                }
            }
        });

    }

    public static void checkUsername(ArrayList<User> Users,String username) throws UsernameExeption {
        for(int i=0;i<Users.size();i++)
        {
            if(Users.get(i).getUsername().equals(username))
            {
                throw new UsernameExeption("این نام کاربری توسط شخص دیگری استفاده شده");
            }
        }
    }
}