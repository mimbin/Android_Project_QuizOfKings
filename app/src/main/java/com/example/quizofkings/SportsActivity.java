package com.example.quizofkings;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;

class Sport{
    private String question;
    private String wrongAns1;
    private String wrongAns2;
    private String wrongAns3;
    private String trueAns;

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
public class SportsActivity extends AppCompatActivity {

    ArrayList<Sport> sportQ=new ArrayList<>();
    TextView question;
    Button Ans1;
    Button Ans2;
    Button Ans3;
    Button Ans4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sports);
        question=(TextView) findViewById(R.id.questionSport);
        Ans1=(Button) findViewById(R.id.btnS1);
        Ans2=(Button) findViewById(R.id.btnS2);
        Ans3=(Button) findViewById(R.id.btnS3);
        Ans4=(Button) findViewById(R.id.btnS4);

        Sport sport1=new Sport();
        sport1.setQuestion("کدام استان به مهد کشتی آزاد مشهور است؟");
        sport1.setWrongAns1("گیلان");
        sport1.setWrongAns2("گلستان");
        sport1.setWrongAns3("ایلام");
        sport1.setTrueAns("مازندران");

        Sport sport2=new Sport();
        sport2.setQuestion(" میزبان جام جهانی 2014؟");
        sport2.setWrongAns1("ریو");
        sport2.setWrongAns2("فرانسه");
        sport2.setWrongAns3("المان");
        sport2.setTrueAns("برزیل");

        Sport sport3=new Sport();
        sport3.setQuestion("غلامرضا تختی چند مدال طلای المپیک دارد؟");
        sport3.setWrongAns1("2");
        sport3.setWrongAns2("3");
        sport3.setWrongAns3("4");
        sport3.setTrueAns("1");

        Sport sport4=new Sport();
        sport4.setQuestion("تعداد داوران بسکتبال؟");
        sport4.setWrongAns1("4");
        sport4.setWrongAns2("3");
        sport4.setWrongAns3("5");
        sport4.setTrueAns("6");

        sportQ.add(sport1);
        sportQ.add(sport2);
        sportQ.add(sport3);
        sportQ.add(sport4);

        int random=(int)(Math.random()*sportQ.size());
        String selectedQ=sportQ.get(random).getQuestion();
        question.setText(selectedQ);

        Ans1.setText(sportQ.get(random).getWrongAns1());
        Ans2.setText(sportQ.get(random).getWrongAns2());
        Ans3.setText(sportQ.get(random).getWrongAns3());
        Ans4.setText(sportQ.get(random).getTrueAns());

        Ans1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Ans1.setBackgroundColor(getResources().getColor(R.color.colorRed));
                Intent intent=new Intent(SportsActivity.this,GameActivity.class);
                startActivity(intent);
            }
        });

        Ans2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Ans2.setBackgroundColor(getResources().getColor(R.color.colorRed));
                Intent intent=new Intent(SportsActivity.this,GameActivity.class);
                startActivity(intent);
            }
        });

        Ans3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Ans3.setBackgroundColor(getResources().getColor(R.color.colorRed));
                Intent intent=new Intent(SportsActivity.this,GameActivity.class);
                startActivity(intent);
            }
        });

        Ans4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Ans4.setBackgroundColor(getResources().getColor(R.color.colorGreen));
                Intent intent=new Intent(SportsActivity.this,GameActivity.class);
                startActivity(intent);
            }
        });


    }
}