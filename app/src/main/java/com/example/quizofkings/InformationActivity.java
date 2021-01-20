package com.example.quizofkings;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;

class Information{
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
public class InformationActivity extends AppCompatActivity {

    ArrayList<Information> InfoQ=new ArrayList<>();
    TextView question;
    Button Ans1;
    Button Ans2;
    Button Ans3;
    Button Ans4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_information);
        question=(TextView) findViewById(R.id.questionInfo);
        Ans1=(Button) findViewById(R.id.btnI1);
        Ans2=(Button) findViewById(R.id.btnI2);
        Ans3=(Button) findViewById(R.id.btnI3);
        Ans4=(Button) findViewById(R.id.btnI4);

        Information Info1=new Information();
        Info1.setQuestion("واحد پول ژاپن؟");
        Info1.setWrongAns1("یورو");
        Info1.setWrongAns2("دبلن");
        Info1.setWrongAns3("لیر");
        Info1.setTrueAns("ین");

        Information Info2=new Information();
        Info2.setQuestion("عددی که روی طلای 18 عیار حک میشود؟");
        Info2.setWrongAns1("720");
        Info2.setWrongAns2("800");
        Info2.setWrongAns3("925");
        Info2.setTrueAns("750");

        Information Info3=new Information();
        Info3.setQuestion("وزیر نفت دولت یازدهم؟");
        Info3.setWrongAns1("گودرزی");
        Info3.setWrongAns2("دهفانی");
        Info3.setWrongAns3("آخوندی");
        Info3.setTrueAns("زنگنه");

        Information Info4=new Information();
        Info4.setQuestion("کدام درخت نماد صلح است؟");
        Info4.setWrongAns1("انار");
        Info4.setWrongAns2("بابونه");
        Info4.setWrongAns3("سیب");
        Info4.setTrueAns("زیتون");

        Information Info5=new Information();
        Info5.setQuestion("مقبره شهریار کجا واقع شده است؟");
        Info5.setWrongAns1("تهران");
        Info5.setWrongAns2("همدان");
        Info5.setWrongAns3("ایلام");
        Info5.setTrueAns("تبریز");

        InfoQ.add(Info1);
        InfoQ.add(Info2);
        InfoQ.add(Info3);
        InfoQ.add(Info4);
        InfoQ.add(Info5);

        int random=(int)(Math.random()*InfoQ.size());
        String selectedQ=InfoQ.get(random).getQuestion();
        question.setText(selectedQ);

        Ans1.setText(InfoQ.get(random).getWrongAns1());
        Ans2.setText(InfoQ.get(random).getWrongAns2());
        Ans3.setText(InfoQ.get(random).getWrongAns3());
        Ans4.setText(InfoQ.get(random).getTrueAns());

        Ans1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Ans1.setBackgroundColor(getResources().getColor(R.color.colorRed));
                Intent intent=new Intent(InformationActivity.this,GameActivity.class);
                startActivity(intent);
            }
        });

        Ans2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Ans2.setBackgroundColor(getResources().getColor(R.color.colorRed));
                Intent intent=new Intent(InformationActivity.this,GameActivity.class);
                startActivity(intent);
            }
        });

        Ans3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Ans3.setBackgroundColor(getResources().getColor(R.color.colorRed));
                Intent intent=new Intent(InformationActivity.this,GameActivity.class);
                startActivity(intent);
            }
        });

        Ans4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Ans4.setBackgroundColor(getResources().getColor(R.color.colorGreen));
                Intent intent=new Intent(InformationActivity.this,GameActivity.class);
                startActivity(intent);
            }
        });


    }
}