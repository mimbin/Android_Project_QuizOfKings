package com.example.quizofkings;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;

class InvalidPass extends Exception{
    InvalidPass(String msg)
    {
        super(msg);
    }
}
public class ChangePassActivity extends AppCompatActivity {
    TextView textView;
    TextView warning3;
    Button add;
    EditText newPass;
    EditText prePass;
    public static ArrayList<User> userList=SignUpActivity.myUsers;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_change_pass);
        textView=(TextView) findViewById(R.id.changePassword);
        warning3=(TextView) findViewById(R.id.warning3);
        add=(Button)findViewById(R.id.addNewPass);
        newPass=(EditText) findViewById(R.id.newPass);
        prePass=(EditText) findViewById(R.id.prePass);
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    checkPass(newPass.getText().toString());
                    for (int i=0;i<userList.size();i++)
                    {
                        if(userList.get(i).getPassword().equals(prePass.getText().toString()))
                        {
                            userList.get(i).setPassword(newPass.getText().toString());
                        }
                        break;
                    }
                    Intent intent=new Intent(getApplicationContext(),GameActivity.class);
                    startActivity(intent);
                } catch (InvalidPass e) {
                    warning3.setText(e.getMessage());
                }
            }
        });

    }

    public static void checkPass(String password) throws InvalidPass {
        if(password.length()<5)
        {
            throw new InvalidPass("رمز عبور باید بیشتر از 5 کاراکتر باشد");
        }
    }
}