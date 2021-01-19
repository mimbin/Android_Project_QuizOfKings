package com.example.quizofkings;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;

public class newGameActivity extends AppCompatActivity {
    Button q1;
    Button q2;
    Button q3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_game);
        q1=(Button)findViewById(R.id.q1);
        q2=(Button)findViewById(R.id.q2);
        q3=(Button)findViewById(R.id.q3);
        String[] subjects=new String[8];
        subjects[0]="علم و دانش";
        subjects[1]="غذا و نوشیدنی";
        subjects[2]="اطلاعات عمومی";
        subjects[3]="جعرافیا";
        subjects[4]="ورزشی";
        subjects[5]="زبان انگلیسی";
        subjects[6]="مذهبی";
        subjects[7]="ادبیات";


        int random1 = 0;
        int random2 = 0;
        int random3 = 0;
        while (random1==random2 & random1==random3 & random2==random3)
        {
            random1=(int)(Math.random()*8);
            random2=(int)(Math.random()*8);
            random3=(int)(Math.random()*8);
        }

        String sub1=subjects[random1];
        String sub2=subjects[random2];
        String sub3=subjects[random3];
        q1.setText(sub1);
        q2.setText(sub2);
        q3.setText(sub3);

        final int finalRandom1 = random1;
        final int finalRandom2 = random2;
        final int finalRandom3 = random3;
        q1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (finalRandom1)
                {
                    case 0:
                        Intent intent0=new Intent(newGameActivity.this,ScienceActivity.class);
                        startActivity(intent0);
                        break;
                    case 1:
                        Intent intent1=new Intent(newGameActivity.this,FoodActivity.class);
                        startActivity(intent1);
                        break;
                    case 2:
                        Intent intent2=new Intent(newGameActivity.this,InformationActivity.class);
                        startActivity(intent2);
                        break;
                    case 3:
                        Intent intent3=new Intent(newGameActivity.this,GeographyActivity.class);
                        startActivity(intent3);
                        break;
                    case 4:
                        Intent intent4=new Intent(newGameActivity.this,SportsActivity.class);
                        startActivity(intent4);
                        break;
                    case 5:
                        Intent intent=new Intent(newGameActivity.this,EnglishActivity.class);
                        startActivity(intent);
                        break;
                    case 6:
                        Intent intent6=new Intent(newGameActivity.this,ReligiousActivity.class);
                        startActivity(intent6);
                        break;
                    case 7:
                        Intent intent7=new Intent(newGameActivity.this,LiteratureActivity.class);
                        startActivity(intent7);
                        break;
                }

            }
        });

        q2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (finalRandom2)
                {
                    case 0:
                        Intent intent0=new Intent(newGameActivity.this,ScienceActivity.class);
                        startActivity(intent0);
                        break;
                    case 1:
                        Intent intent1=new Intent(newGameActivity.this,FoodActivity.class);
                        startActivity(intent1);
                        break;
                    case 2:
                        Intent intent2=new Intent(newGameActivity.this,InformationActivity.class);
                        startActivity(intent2);
                        break;
                    case 3:
                        Intent intent3=new Intent(newGameActivity.this,GeographyActivity.class);
                        startActivity(intent3);
                        break;
                    case 4:
                        Intent intent4=new Intent(newGameActivity.this,SportsActivity.class);
                        startActivity(intent4);
                        break;
                    case 5:
                        Intent intent=new Intent(newGameActivity.this,EnglishActivity.class);
                        startActivity(intent);
                        break;
                    case 6:
                        Intent intent6=new Intent(newGameActivity.this,ReligiousActivity.class);
                        startActivity(intent6);
                        break;
                    case 7:
                        Intent intent7=new Intent(newGameActivity.this,LiteratureActivity.class);
                        startActivity(intent7);
                        break;
                }

            }
        });

        q3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (finalRandom3)
                {
                    case 0:
                        Intent intent0=new Intent(newGameActivity.this,ScienceActivity.class);
                        startActivity(intent0);
                        break;
                    case 1:
                        Intent intent1=new Intent(newGameActivity.this,FoodActivity.class);
                        startActivity(intent1);
                        break;
                    case 2:
                        Intent intent2=new Intent(newGameActivity.this,InformationActivity.class);
                        startActivity(intent2);
                        break;
                    case 3:
                        Intent intent3=new Intent(newGameActivity.this,GeographyActivity.class);
                        startActivity(intent3);
                        break;
                    case 4:
                        Intent intent4=new Intent(newGameActivity.this,SportsActivity.class);
                        startActivity(intent4);
                        break;
                    case 5:
                        Intent intent=new Intent(newGameActivity.this,EnglishActivity.class);
                        startActivity(intent);
                        break;
                    case 6:
                        Intent intent6=new Intent(newGameActivity.this,ReligiousActivity.class);
                        startActivity(intent6);
                        break;
                    case 7:
                        Intent intent7=new Intent(newGameActivity.this,LiteratureActivity.class);
                        startActivity(intent7);
                        break;
                }
            }
        });

    }
}