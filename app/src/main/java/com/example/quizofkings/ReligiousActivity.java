package com.example.quizofkings;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;

class Religious{
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
public class ReligiousActivity extends AppCompatActivity {
    ArrayList<Religious> ReligiousQ =new ArrayList<>();
    TextView question;
    Button Ans1;
    Button Ans2;
    Button Ans3;
    Button Ans4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_religious);
        question=(TextView) findViewById(R.id.questionReligous);
        Ans1=(Button) findViewById(R.id.btnR1);
        Ans2=(Button) findViewById(R.id.btnR2);
        Ans3=(Button) findViewById(R.id.btnR3);
        Ans4=(Button) findViewById(R.id.btnR4);

        Religious Rel1=new Religious();
        Rel1.setQuestion("امام حسين(ع) در چه روزى متولد شد؟ ");
        Rel1.setWrongAns1("دوم شعبان");
        Rel1.setWrongAns2("اول رجب");
        Rel1.setWrongAns3("چهارم شعبان");
        Rel1.setTrueAns("سوم شعبان");

        Religious Rel2=new Religious();
        Rel2.setQuestion("مدت امامت امام حسن(ع) چند سال بود؟");
        Rel2.setWrongAns1("1");
        Rel2.setWrongAns2("2");
        Rel2.setWrongAns3("4");
        Rel2.setTrueAns("3");

        Religious Rel3=new Religious();
        Rel3.setQuestion("چه كسى تصميم به قتل امام حسن(ع) گرفت؟ ");
        Rel3.setWrongAns1("یزید");
        Rel3.setWrongAns2("مامون");
        Rel3.setWrongAns3("عمرو بن عاص");
        Rel3.setTrueAns("معاویه");

        Religious Rel4=new Religious();
        Rel4.setQuestion("مادر حضرت سجاد(ع) چه نام دارد؟ ");
        Rel4.setWrongAns1("ام لیلا");
        Rel4.setWrongAns2("ام اسحاق");
        Rel4.setWrongAns3("ارینب");
        Rel4.setTrueAns("شهربانو");

        Religious Rel5=new Religious();
        Rel5.setQuestion("امام حسين(ع) از مكه به قصد كجا خارج شد؟");
        Rel5.setWrongAns1("مدینه");
        Rel5.setWrongAns2("نجف");
        Rel5.setWrongAns3("کربلا");
        Rel5.setTrueAns("کوفه");

        ReligiousQ.add(Rel1);
        ReligiousQ.add(Rel2);
        ReligiousQ.add(Rel3);
        ReligiousQ.add(Rel4);
        ReligiousQ.add(Rel5);

        int random=(int)(Math.random()*ReligiousQ.size());
        String selectedQ=ReligiousQ.get(random).getQuestion();
        question.setText(selectedQ);

        Ans1.setText(ReligiousQ.get(random).getWrongAns1());
        Ans2.setText(ReligiousQ.get(random).getWrongAns2());
        Ans3.setText(ReligiousQ.get(random).getWrongAns3());
        Ans4.setText(ReligiousQ.get(random).getTrueAns());

        Ans1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Ans1.setBackgroundColor(getResources().getColor(R.color.colorRed));
                Intent intent=new Intent(ReligiousActivity.this,GameActivity.class);
                startActivity(intent);
            }
        });

        Ans2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Ans2.setBackgroundColor(getResources().getColor(R.color.colorRed));
                Intent intent=new Intent(ReligiousActivity.this,GameActivity.class);
                startActivity(intent);
            }
        });

        Ans3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Ans3.setBackgroundColor(getResources().getColor(R.color.colorRed));
                Intent intent=new Intent(ReligiousActivity.this,GameActivity.class);
                startActivity(intent);
            }
        });

        Ans4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Ans4.setBackgroundColor(getResources().getColor(R.color.colorGreen));
                Intent intent=new Intent(ReligiousActivity.this,GameActivity.class);
                startActivity(intent);
            }
        });


    }
}