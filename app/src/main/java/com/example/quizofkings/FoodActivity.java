package com.example.quizofkings;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;

class Food{
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
public class FoodActivity extends AppCompatActivity {
    ArrayList<Food> foodQ=new ArrayList<>();
    TextView question;
    Button Ans1;
    Button Ans2;
    Button Ans3;
    Button Ans4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food);
        question=(TextView) findViewById(R.id.questionFood);
        Ans1=(Button) findViewById(R.id.btnF1);
        Ans2=(Button) findViewById(R.id.btnF2);
        Ans3=(Button) findViewById(R.id.btnF3);
        Ans4=(Button) findViewById(R.id.btnF4);

        Food food1=new Food();
        food1.setQuestion("سمبوسه غذای کدام استان است؟");
        food1.setWrongAns1("تهران");
        food1.setWrongAns2("همدان");
        food1.setWrongAns3("ایلام");
        food1.setTrueAns("بوشهر");

        Food food2=new Food();
        food2.setQuestion("قیمه نثار برای کدام استان است؟");
        food2.setWrongAns1("تهران");
        food2.setWrongAns2("مرکزی");
        food2.setWrongAns3("سیستان و بلوچستان");
        food2.setTrueAns("قزوین");

        Food food3=new Food();
        food3.setQuestion("قطاب از شیرینی های کدام استان است؟");
        food3.setWrongAns1("کرمان");
        food3.setWrongAns2("همدان");
        food3.setWrongAns3("ایلام");
        food3.setTrueAns("کرمانشاه");

        Food food4=new Food();
        food4.setQuestion("یخ در بهشت یکی از نوشیدنی های معروف و شناخته شده کدام استان است؟");
        food4.setWrongAns1("گلستان");
        food4.setWrongAns2("مرکزی");
        food4.setWrongAns3("مازندران");
        food4.setTrueAns("گیلان");

        Food food5=new Food();
        food5.setQuestion("اکبر جوجه غذای کدام شهر است؟");
        food5.setWrongAns1("گیلان");
        food5.setWrongAns2("همدان");
        food5.setWrongAns3("ایلام");
        food5.setTrueAns("مازندران");

        foodQ.add(food1);
        foodQ.add(food2);
        foodQ.add(food3);
        foodQ.add(food4);
        foodQ.add(food5);

        int random=(int)(Math.random()*foodQ.size());
        String selectedQ=foodQ.get(random).getQuestion();
        question.setText(selectedQ);

        Ans1.setText(foodQ.get(random).getWrongAns1());
        Ans2.setText(foodQ.get(random).getWrongAns2());
        Ans3.setText(foodQ.get(random).getWrongAns3());
        Ans4.setText(foodQ.get(random).getTrueAns());

        Ans1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Ans1.setBackgroundColor(getResources().getColor(R.color.colorRed));
                Intent intent=new Intent(FoodActivity.this,GameActivity.class);
                startActivity(intent);
            }
        });

        Ans2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Ans2.setBackgroundColor(getResources().getColor(R.color.colorRed));
                Intent intent=new Intent(FoodActivity.this,GameActivity.class);
                startActivity(intent);
            }
        });

        Ans3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Ans3.setBackgroundColor(getResources().getColor(R.color.colorRed));
                Intent intent=new Intent(FoodActivity.this,GameActivity.class);
                startActivity(intent);
            }
        });

        Ans4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Ans4.setBackgroundColor(getResources().getColor(R.color.colorGreen));
                Intent intent=new Intent(FoodActivity.this,GameActivity.class);
                startActivity(intent);
            }
        });


    }
}