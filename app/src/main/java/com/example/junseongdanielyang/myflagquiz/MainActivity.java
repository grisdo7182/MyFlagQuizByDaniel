package com.example.junseongdanielyang.myflagquiz;

import android.content.Intent;
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

public class MainActivity extends AppCompatActivity {

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
        setContentView(R.layout.activity_main);

        final Button btnA = (Button) findViewById(R.id.btnA);
        //final TextView result = (TextView) findViewById(R.id.btnA);
        final Button btnB = (Button) findViewById(R.id.btnB);
        //final TextView result = (TextView) findViewById(R.id.btnB);
        final Button btnC = (Button) findViewById(R.id.btnC);
        //final TextView result = (TextView) findViewById(R.id.btnC);
        final Button btnD = (Button) findViewById(R.id.btnD);
        //final TextView result = (TextView) findViewById(R.id.btnD);
        final TextView result = (TextView) findViewById(R.id.qTextView);


        btnA.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick (View v){
                result.setText("Incorrect!");
                        btnA.setEnabled(false);
            }
        });

        btnB.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v){
                result.setText("Incorrect!");
                btnB.setEnabled(false);
            }
        });

        btnC.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick (View v){
                result.setText("Your answer is correct!");
                Intent startQ2Activity = new Intent(v.getContext(), Main2Activity.class);
                startActivity(startQ2Activity);
            }
        });

        btnD.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v){
                result.setText("Incorrect!");
                btnD.setEnabled(false);
            }
        });}}