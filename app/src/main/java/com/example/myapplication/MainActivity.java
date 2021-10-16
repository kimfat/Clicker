package com.example.myapplication;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    private long score = 0;
    TextView mainText;
    Button plusBtn;
    Button minusBtn;
    ImageButton restartBtn;

    protected String end(long n){
        if(n < 0){
            n *= -1;
        }
        if(n % 100 > 10 && n % 100 < 20){
            return "раз";
        }else if(n % 10 >= 2 && n % 10 <= 4){
            return "раза";
        }else{
            return "раз";
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mainText = (TextView) findViewById(R.id.mainTxt);
        plusBtn = (Button) findViewById(R.id.plusBtn);
        restartBtn = (ImageButton) findViewById(R.id.restartBtn);
        minusBtn = (Button) findViewById(R.id.minusBtn);
        View.OnClickListener plusClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                score ++;
                String s = "Кнопка нажата " + score + " " + end(score);
                mainText.setText(s.toCharArray(),0, s.length());
            }
        };
        plusBtn.setOnClickListener(plusClickListener);
        View.OnClickListener minusClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                score --;
                String s = "Кнопка нажата " + score + " " + end(score);
                mainText.setText(s.toCharArray(),0, s.length());
            }
        };
        minusBtn.setOnClickListener(minusClickListener);
        View.OnClickListener restartClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                score = 0;
                String s = "Кнопка нажата " + score + " " + end(score);
                mainText.setText(s.toCharArray(),0, s.length());
            }
        };
        restartBtn.setOnClickListener(restartClickListener);
    }

}