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
    public static ArrayList<User> myUsers=MainActivity.users;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
        username = (EditText) findViewById(R.id.signUpUsername);
        password = (EditText) findViewById(R.id.signUpPass);
        repeatedPass = (EditText) findViewById(R.id.repeatSignUpPass);
        result = (TextView) findViewById(R.id.signUpText);
        buttonSignUp = (Button) findViewById(R.id.signUpButton);
        user=new User();

        password.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (username.getText().toString().length()==0)
                    result.setText("لطفا کادر خالی نام کاربری  را پر کنید");
                else
                {
                    try {
                        checkUser(myUsers,username.getText().toString());
                        user.setUsername(username.getText().toString());
                        myUsers.add(user);
                    }
                    catch (InvalidUsername e)
                    {
                        result.setText(e.getMessage());
                    }

                }
            }
        });

        repeatedPass.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               if(password.getText().toString().length()==0)
                   result.setText("لطفا کادر خالی  رمز عبور را پر کنید");
               else
               {
                   try {
                       checkPassword(password.getText().toString());
                   }
                   catch (InvalidPassword e)
                   {
                       result.setText(e.getMessage());
                   }
               }
           }
       });

       buttonSignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(repeatedPass.getText().toString().length()==0)
                {
                    result.setText("کادر خالی تکرار رمز عبور را پر کنید ");
                }
                else
                {
                    try {
                        checkUser(myUsers,username.getText().toString());
                        checkEqual(password.getText().toString(),repeatedPass.getText().toString());
                        user.setPassword(password.getText().toString());
                        openGame();
                    }
                    catch (notEqualExeption | InvalidUsername e)
                    {
                        result.setText(e.getMessage());
                    }

                }
            }
        });
    }
    public void openGame(){
        Intent intent = new Intent(this, GameActivity.class);
        startActivity(intent);
    }
    public static void checkUser(ArrayList<User> Users,String username) throws InvalidUsername {
        for(int i=0;i<Users.size();i++)
        {
            if(Users.get(i).getUsername().equals(username))
            {
                throw new InvalidUsername("این نام کاربری توسط شخص دیگری استفاده شده");
            }
        }
    }
    public static void checkPassword(String password) throws InvalidPassword {
        if(password.length()<5)
        {
            throw new InvalidPassword("رمز عبور باید بیشتر از 5 کاراکتر باشد");
        }
    }
    public static void checkEqual(String pass1,String pass2) throws notEqualExeption {
        if(pass1.equals(pass2)!=true)
            throw new notEqualExeption("رمز عبور به درستی تکرار نشده");
    }


}