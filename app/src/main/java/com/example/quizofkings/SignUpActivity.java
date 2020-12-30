package com.example.quizofkings;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
class InvalidUsername extends Exception{
    InvalidUsername(String msg)
    {
        super(msg);
    }
}
class InvalidPassword extends Exception{
    InvalidPassword(String msg)
    {
        super(msg);
    }
}
public class SignUpActivity extends AppCompatActivity {
    Button button3;
    EditText text3;
    EditText text4;
    EditText text5;
    TextView text6;
    ImageView imageView2;
    User user;
     ArrayList<User> users=new ArrayList<>();
    ArrayList<String> UserNames=new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
        imageView2=(ImageView)findViewById(R.id.img2);
        text3=(EditText)findViewById(R.id.text3);
        text4=(EditText)findViewById(R.id.text4);
        text5=(EditText)findViewById(R.id.text5);
        text6=(TextView)findViewById(R.id.text6);
        button3=(Button)findViewById(R.id.btn3);
        String username=text3.getText().toString();
        String password=text4.getText().toString();
        String repPassword=text5.getText().toString();

        while (true)
        {
            if(username.isEmpty())
                text6.setText("please fill the blank");

            else
                try {
                    checkUser(UserNames,username);
                    break;
                }
                catch (InvalidUsername e)
                {
                    text6.setText(e.getMessage());
                    continue;
                }
        }
        while (true)
        {
            if(password.isEmpty())
                text6.setText("please fill the blank");

            else
                try {
                    checkPassword(password);
                    break;
                }
                catch (InvalidPassword e)
                {
                    text6.setText(e.getMessage());
                    continue;
                }
        }
        while (true)
        {
            if(repPassword.isEmpty())
                text6.setText("please fill the blank");

            else if(!password.equals(repPassword))
                text6.setText("password and repeated password are not the same");

            else {
                text6.setText(null);
                break;
            }


        }
        button3.setOnClickListener(new View.OnClickListener() {
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
    public static void checkUser(ArrayList<String> usernames,String username) throws InvalidUsername {
        if(usernames.contains(username))
            throw new InvalidUsername("this username is already taken");
    }
    public static void checkPassword(String password) throws InvalidPassword {
        char [] array=password.toCharArray();
        if(array.length<5)
        {
            throw new InvalidPassword("password should be  more than 5 characters");
        }
    }
}