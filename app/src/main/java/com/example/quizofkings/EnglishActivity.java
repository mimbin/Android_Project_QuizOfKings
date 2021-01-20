package com.example.quizofkings;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;

class English{
    String question;
    String wrongAns1;
    String wrongAns2;
    String wrongAns3;
    String trueAns;

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getWrongAns1() {
        return wrongAns1;
    }

    public void setWrongAns1(String wrongAns1) {
        this.wrongAns1 = wrongAns1;
    }

    public String getWrongAns2() {
        return wrongAns2;
    }

    public void setWrongAns2(String wrongAns2) {
        this.wrongAns2 = wrongAns2;
    }

    public String getWrongAns3() {
        return wrongAns3;
    }

    public void setWrongAns3(String wrongAns3) {
        this.wrongAns3 = wrongAns3;
    }

    public String getTrueAns() {
        return trueAns;
    }

    public void setTrueAns(String trueAns) {
        this.trueAns = trueAns;
    }
}
public class EnglishActivity extends AppCompatActivity {
    ArrayList<English> englishQ=new ArrayList<>();
    TextView question;
    Button Ans1;
    Button Ans2;
    Button Ans3;
    Button Ans4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_english);
        question=(TextView) findViewById(R.id.question);
        Ans1=(Button) findViewById(R.id.btn1);
        Ans2=(Button) findViewById(R.id.btn2);
        Ans3=(Button) findViewById(R.id.btn3);
        Ans4=(Button) findViewById(R.id.btn4);

        English english1=new English();
        english1.setQuestion("The little old man made ……… out of wood");
        english1.setWrongAns1("soup ");
        english1.setWrongAns1("toys ");
        english1.setWrongAns1("food  ");
        english1.setTrueAns("boxes");

        English english2=new English();
        english2.setQuestion("We should not be ……….. to animals.");
        english2.setWrongAns1("kind ");
        english2.setWrongAns1("real ");
        english2.setWrongAns1("good  ");
        english2.setTrueAns("cruel");

        English english3=new English();
        english3.setQuestion("Do you know that smoking in this place is against the ……….?");
        english3.setWrongAns1("low ");
        english3.setWrongAns1("light ");
        english3.setWrongAns1("loaf  ");
        english3.setTrueAns("law");

        English english4=new English();
        english4.setQuestion("Please ……………………..the money you borrowed me last week.");
        english4.setWrongAns1("find out ");
        english4.setWrongAns1("turn up ");
        english4.setWrongAns1("take off ");
        english4.setTrueAns("give back");

        English english5=new English();
        english5.setQuestion("The sun , the moon  and the earth are all in the ………………");
        english5.setWrongAns1("air");
        english5.setWrongAns1("atmosphere ");
        english5.setWrongAns1("weather  ");
        english5.setTrueAns("space");

        englishQ.add(english1);
        englishQ.add(english2);
        englishQ.add(english3);
        englishQ.add(english4);
        englishQ.add(english5);

        int random=(int)(Math.random()*englishQ.size());
        String selectedQ=englishQ.get(random).getQuestion();
        question.setText(selectedQ);

        Ans1.setText(englishQ.get(random).getWrongAns1());
        Ans2.setText(englishQ.get(random).getWrongAns2());
        Ans3.setText(englishQ.get(random).getWrongAns3());
        Ans4.setText(englishQ.get(random).getTrueAns());

        Ans1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Ans1.setBackgroundColor(getResources().getColor(R.color.colorRed));
                Intent intent=new Intent(EnglishActivity.this,GameActivity.class);
                startActivity(intent);
            }
        });

        Ans2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Ans2.setBackgroundColor(getResources().getColor(R.color.colorRed));
                Intent intent=new Intent(EnglishActivity.this,GameActivity.class);
                startActivity(intent);
            }
        });

        Ans3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Ans3.setBackgroundColor(getResources().getColor(R.color.colorRed));
                Intent intent=new Intent(EnglishActivity.this,GameActivity.class);
                startActivity(intent);
            }
        });

        Ans4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Ans4.setBackgroundColor(getResources().getColor(R.color.colorGreen));
                Intent intent=new Intent(EnglishActivity.this,GameActivity.class);
                startActivity(intent);
            }
        });




    }
}