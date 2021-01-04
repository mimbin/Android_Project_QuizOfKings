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
class notEqualExeption extends Exception{
    notEqualExeption(String msg)
    {
        super(msg);
    }
}
public class SignUpActivity extends AppCompatActivity {
    Button buttonSignUp;
    EditText username;
    EditText password;
    EditText repeatedPass;
    TextView result;
    User user;
    ArrayList<User> users=new ArrayList<>();
    ArrayList<String> UserNames=new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
        username=(EditText)findViewById(R.id.signUpUsername);
        password=(EditText)findViewById(R.id.signUpPass);
        repeatedPass=(EditText)findViewById(R.id.repeatSignUpPass);
        result=(TextView)findViewById(R.id.signUpText);
        buttonSignUp=(Button)findViewById(R.id.signUpButton);

        final String UserName=username.getText().toString();
        final String Password=password.getText().toString();
        final String RepeatedPass=repeatedPass.getText().toString();


        password.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(UserName.isEmpty())
                    result.setText("please fill the details");
            }
        });

       repeatedPass.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               if(Password.isEmpty())
                   result.setText("please fill the details");
               try {
                   checkPassword(Password);
               }
               catch (InvalidPassword e)
               {
                   result.setText(e.getMessage());
               }

           }
       });

       buttonSignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    checkEqual(Password,RepeatedPass);
                    checkUser(UserNames,UserName);
                    UserNames.add(UserName);
                    user=new User(UserName,Password);
                    users.add(user);
                    openGame();

                }
                catch (notEqualExeption e)
                {
                    result.setText(e.getMessage());
                }
                catch (InvalidUsername e)
                {
                    result.setText(e.getMessage());
                }

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
    public static void checkEqual(String pass1,String pass2) throws notEqualExeption {
        if(!pass1.equals(pass2))
            throw new notEqualExeption("password is not repeated correctly");
    }
}