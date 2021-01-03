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
//        imageView2=(ImageView)findViewById(R.id.img2);
        text3=(EditText)findViewById(R.id.text3);
        text4=(EditText)findViewById(R.id.text4);
        text5=(EditText)findViewById(R.id.text5);
        text6=(TextView)findViewById(R.id.text6);
        button3=(Button)findViewById(R.id.btn3);

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String username=text3.getText().toString();
                if(text3.getText().toString().isEmpty())
                    text6.setText("please fill the details");
                String password=text4.getText().toString();
                if(text4.getText().toString().isEmpty())
                    text6.setText("please fill the details");
                try {
                    checkPassword(password);
                }
                catch (InvalidPassword e)
                {
                    text6.setText(e.getMessage());
                }
                String repeatedPass=text5.getText().toString();
                if(text5.getText().toString().isEmpty())
                    text6.setText("please fill the details");

                if(!password.equals(repeatedPass))
                {
                    text6.setText("password repeated is not correct");
                }
                try {
                    checkUser(UserNames,username);
                    UserNames.add(username);

                }
                catch (InvalidUsername e)
                {
                    text6.setText(e.getMessage());
                }
                user=new User(username,password);
                users.add(user);
                UserNames.add(username);
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