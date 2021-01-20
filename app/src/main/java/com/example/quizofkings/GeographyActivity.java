package com.example.quizofkings;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;

class Geography{
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
public class GeographyActivity extends AppCompatActivity {
    ArrayList<Geography> geoQ=new ArrayList<>();
    TextView question;
    Button Ans1;
    Button Ans2;
    Button Ans3;
    Button Ans4;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_geography);
        question=(TextView) findViewById(R.id.questionGeo);
        Ans1=(Button) findViewById(R.id.btnG1);
        Ans2=(Button) findViewById(R.id.btnG2);
        Ans3=(Button) findViewById(R.id.btnG3);
        Ans4=(Button) findViewById(R.id.btnG4);

        Geography Geo1=new Geography();
        Geo1.setQuestion("شهر گناباد در کدام استان است؟");
        Geo1.setWrongAns1("تهران");
        Geo1.setWrongAns2("یزد");
        Geo1.setWrongAns3("کرمانشاه");
        Geo1.setTrueAns("خراسان");

        Geography Geo2=new Geography();
        Geo2.setQuestion("کدام کشور در حوزه اطراف دریای خزر نیست؟");
        Geo2.setWrongAns1("قزاقستان");
        Geo2.setWrongAns2("ترکمنستان");
        Geo2.setWrongAns3("آذربایجان");
        Geo2.setTrueAns("تاجیکستان");

        Geography Geo3=new Geography();
        Geo3.setQuestion("کبودرآهنگ در کدام شهر قرار دارد؟");
        Geo3.setWrongAns1("کرمان");
        Geo3.setWrongAns2("کرامشاه");
        Geo3.setWrongAns3("ایلام");
        Geo3.setTrueAns("همدان");

        Geography Geo4=new Geography();
        Geo4.setQuestion("مسجد لار در کدام استان واقع می باشد؟");
        Geo4.setWrongAns1("گلستان");
        Geo4.setWrongAns2("مرکزی");
        Geo4.setWrongAns3("مازندران");
        Geo4.setTrueAns("فارس");

        Geography Geo5=new Geography();
        Geo5.setQuestion("دریاچه گهر کدام شهر است؟");
        Geo5.setWrongAns1("دورود");
        Geo5.setWrongAns2("علی آباد");
        Geo5.setWrongAns3("نورآباد ممسنی");
        Geo5.setTrueAns("رشت");

        geoQ.add(Geo1);
        geoQ.add(Geo2);
        geoQ.add(Geo3);
        geoQ.add(Geo4);
        geoQ.add(Geo5);


        int random=(int)(Math.random()*geoQ.size());
        String selectedQ=geoQ.get(random).getQuestion();
        question.setText(selectedQ);

        Ans1.setText(geoQ.get(random).getWrongAns1());
        Ans2.setText(geoQ.get(random).getWrongAns2());
        Ans3.setText(geoQ.get(random).getWrongAns3());
        Ans4.setText(geoQ.get(random).getTrueAns());

        Ans1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Ans1.setBackgroundColor(getResources().getColor(R.color.colorRed));
                Intent intent=new Intent(GeographyActivity.this,GameActivity.class);
                startActivity(intent);
            }
        });

        Ans2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Ans2.setBackgroundColor(getResources().getColor(R.color.colorRed));
                Intent intent=new Intent(GeographyActivity.this,GameActivity.class);
                startActivity(intent);
            }
        });

        Ans3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Ans3.setBackgroundColor(getResources().getColor(R.color.colorRed));
                Intent intent=new Intent(GeographyActivity.this,GameActivity.class);
                startActivity(intent);
            }
        });

        Ans4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Ans4.setBackgroundColor(getResources().getColor(R.color.colorGreen));
                Intent intent=new Intent(GeographyActivity.this,GameActivity.class);
                startActivity(intent);
            }
        });

    }
}