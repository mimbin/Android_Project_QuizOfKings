package com.example.quizofkings;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;

class Science{
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
public class ScienceActivity extends AppCompatActivity {
    ArrayList<Science> scienceQ=new ArrayList<>();
    TextView question;
    Button Ans1;
    Button Ans2;
    Button Ans3;
    Button Ans4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_science);
        question=(TextView) findViewById(R.id.questionSc);
        Ans1=(Button) findViewById(R.id.btnSc1);
        Ans2=(Button) findViewById(R.id.btnSc2);
        Ans3=(Button) findViewById(R.id.btnSc3);
        Ans4=(Button) findViewById(R.id.btnSc4);

        Science science1=new Science();
        science1.setQuestion("پوست انسان چند رنگدانه دارد؟");
        science1.setWrongAns1("1");
        science1.setWrongAns2("2");
        science1.setWrongAns3("3");
        science1.setTrueAns("4");

        Science science2=new Science();
        science2.setQuestion("چقدر طول میکشد تا نور خورشید به زمین برسد؟");
        science2.setWrongAns1("7 دقیقه");
        science2.setWrongAns2("6 دقیقه");
        science2.setWrongAns3("5 ذقیقه");
        science2.setTrueAns("8 دقیقه");

        Science science3=new Science();
        science3.setQuestion("تنها ماده غذایی که فاسد نمیشود کدام است؟");
        science3.setWrongAns1("شکلات");
        science3.setWrongAns2("رب");
        science3.setWrongAns3("لواشک");
        science3.setTrueAns("عسل");

        Science science4=new Science();
        science4.setQuestion("زرافه تازه متولد شده چند متر قد دارد؟ ");
        science4.setWrongAns1("4");
        science4.setWrongAns2("3");
        science4.setWrongAns3("5");
        science4.setTrueAns("2");

        Science science5=new Science();
        science5.setQuestion("در بدن انسان چند لیتر آب وجود دارد؟");
        science5.setWrongAns1("5");
        science5.setWrongAns2("8");
        science5.setWrongAns3("80");
        science5.setTrueAns("50");

        scienceQ.add(science1);
        scienceQ.add(science2);
        scienceQ.add(science3);
        scienceQ.add(science4);
        scienceQ.add(science5);

        int random=(int)(Math.random()*scienceQ.size());
        String selectedQ=scienceQ.get(random).getQuestion();
        question.setText(selectedQ);

        Ans1.setText(scienceQ.get(random).getWrongAns1());
        Ans2.setText(scienceQ.get(random).getWrongAns2());
        Ans3.setText(scienceQ.get(random).getWrongAns3());
        Ans4.setText(scienceQ.get(random).getTrueAns());

        Ans1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Ans1.setBackgroundColor(getResources().getColor(R.color.colorRed));
                Intent intent=new Intent(ScienceActivity.this,GameActivity.class);
                startActivity(intent);
            }
        });

        Ans2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Ans2.setBackgroundColor(getResources().getColor(R.color.colorRed));
                Intent intent=new Intent(ScienceActivity.this,GameActivity.class);
                startActivity(intent);
            }
        });

        Ans3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Ans3.setBackgroundColor(getResources().getColor(R.color.colorRed));
                Intent intent=new Intent(ScienceActivity.this,GameActivity.class);
                startActivity(intent);
            }
        });

        Ans4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Ans4.setBackgroundColor(getResources().getColor(R.color.colorGreen));
                Intent intent=new Intent(ScienceActivity.this,GameActivity.class);
                startActivity(intent);
            }
        });

    }
}