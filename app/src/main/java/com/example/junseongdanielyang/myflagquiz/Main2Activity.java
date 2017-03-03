package com.example.junseongdanielyang.myflagquiz;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.animation.Animation;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.security.SecureRandom;
import java.util.List;
import java.util.logging.Handler;

public class Main2Activity extends AppCompatActivity {

    //for version 2; dynamic change q and answers and image
    private List<String> fileNameList;
    private String correctAnswers2;
    private int totalGuesses;
    private int correctAnswers;
    private SecureRandom random;
    private Handler handler; //used to delay loading next flag
    private Animation shakeAnimation;
    private ImageView flagImageView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main02);

        final Button btnE = (Button) findViewById(R.id.btnE);
        //final TextView result = (TextView) findViewById(R.id.btnA);
        final Button btnF = (Button) findViewById(R.id.btnF);
        //final TextView result = (TextView) findViewById(R.id.btnB);
        final Button btnG = (Button) findViewById(R.id.btnG);
        //final TextView result = (TextView) findViewById(R.id.btnC);
        final Button btnH = (Button) findViewById(R.id.btnH);
        //final TextView result = (TextView) findViewById(R.id.btnD);
        final TextView result = (TextView) findViewById(R.id.qTextView);


        btnE.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick (View v){
                result.setText("Incorrect!");
                btnE.setEnabled(false);
            }
        });

        btnF.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v){
                result.setText("Incorrect!");
                btnF.setEnabled(false);
            }
        });

        btnG.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v){
                result.setText("Your answer is correct");
                btnG.setEnabled(false);
            }
        });

        btnH.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v){
                result.setText("Incorrect!");
                btnH.setEnabled(false);
            }
        });}}