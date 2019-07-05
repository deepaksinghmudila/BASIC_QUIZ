package com.example.basic_quiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Last extends AppCompatActivity {

    TextView mGrade, mFinalSCore;
    Button mRetryButton;
    public QuestionLibrary mQuestionLibrary = new QuestionLibrary();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_last);

        mGrade = (TextView) findViewById(R.id.grade);
        mFinalSCore = (TextView) findViewById(R.id.outOf);
        mRetryButton = (Button)findViewById(R.id.retry);


        Bundle bundle = getIntent().getExtras();
        int score = bundle.getInt("final score");

        mFinalSCore.setText(" You Scored "+ score +" Out of "+ mQuestionLibrary.mQuestions. length);

        if(score ==  mQuestionLibrary.mQuestions. length ){
            mGrade.setText("Outstanding");
        }
        else if( score>0 && score< mQuestionLibrary.mQuestions. length){
            mGrade.setText("Normal");
        }
        else{
            mGrade.setText("Poor");
        }

       mRetryButton.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {

               startActivity(new Intent(Last.this,MainActivity.class));
               Last.this.finish();
           }
       });


    }
}
