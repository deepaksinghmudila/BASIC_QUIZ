package com.example.basic_quiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private QuestionLibrary mQuestionLibrary = new QuestionLibrary();
    private TextView mScoreView;
    private TextView mQuestionView;
    private Button mButtonChoice1;
    private Button mButtonChoice2;
    private Button mButtonChoice3;
    private Button mButtonChoice4;

    private String mAnswer;
    int mScore = 0;
    private int mQuestionNumber = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       final int len = mQuestionLibrary.mQuestions. length;

        mScoreView = (TextView) findViewById(R.id.score);
        mQuestionView = (TextView) findViewById(R.id.question);
        mButtonChoice1 = (Button) findViewById(R.id.Choice1);
        mButtonChoice2 = (Button) findViewById(R.id.Choice2);
        mButtonChoice3 = (Button) findViewById(R.id.Choice3);
        mButtonChoice4 = (Button) findViewById(R.id.Choice4);

        updateQuestion();

        mButtonChoice1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (mButtonChoice1.getText() == mAnswer) {

                    mScore += 1;
                    updateScore(mScore);
                    Toast.makeText(MainActivity.this, "Correct", Toast.LENGTH_SHORT).show();

                    if (mQuestionNumber == len ) {

                        Intent i = new Intent(MainActivity.this,Last.class);
                        Bundle bundle = new Bundle();
                        bundle.putInt("final score",mScore);
                        i.putExtras(bundle);
                        //startActivity(i);
                        startActivityForResult(i,2);
                        //MainActivity.this.finish();                  // this finishes the current activity
                     }
                    else{
                        updateQuestion();
                    }
                   }
                else {
                    Toast.makeText(MainActivity.this, "Wrong", Toast.LENGTH_SHORT).show();
                    if (mQuestionNumber == len  ) {

                        Intent i = new Intent(MainActivity.this,Last.class);
                        Bundle bundle = new Bundle();
                        bundle.putInt("final score",mScore);
                        i.putExtras(bundle);
                        startActivityForResult(i,2);//startActivity(i);
                        //MainActivity.this.finish();
                    }
                    else{
                        updateQuestion();
                    }
                }
            }
        });

        mButtonChoice2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (mButtonChoice2.getText() == mAnswer) {

                    mScore += 1;
                    updateScore(mScore);

                    Toast.makeText(MainActivity.this, "Correct", Toast.LENGTH_SHORT).show();
                    if (mQuestionNumber == len ) {

                        //Toast.makeText(MainActivity.this, "this is mScore"+ mScore, Toast.LENGTH_SHORT).show();
                        Intent i = new Intent(MainActivity.this,Last.class);
                        Bundle bundle = new Bundle();
                        bundle.putInt("final score",mScore);
                        i.putExtras(bundle);
                        startActivityForResult(i,2);//startActivity(i);
                        //MainActivity.this.finish();
                    }
                    else{
                        updateQuestion();
                    }

                } else {
                    Toast.makeText(MainActivity.this, "Wrong", Toast.LENGTH_SHORT).show();
                    if (mQuestionNumber == len  ) {

                        Intent i = new Intent(MainActivity.this,Last.class);
                        Bundle bundle = new Bundle();
                        bundle.putInt("final score",mScore);
                        i.putExtras(bundle);
                        startActivityForResult(i,2);//startActivity(i);
                        //MainActivity.this.finish();
                    }
                    else{
                        updateQuestion();
                    }
                }
            }
        });

        mButtonChoice3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (mButtonChoice3.getText() == mAnswer) {

                    mScore += 1;
                    updateScore(mScore);
                    Toast.makeText(MainActivity.this, "Correct", Toast.LENGTH_SHORT).show();
                    if (mQuestionNumber == len  ) {

                        Intent i = new Intent(MainActivity.this,Last.class);
                        Bundle bundle = new Bundle();
                        bundle.putInt("final score",mScore);
                        i.putExtras(bundle);
                        startActivityForResult(i,2);//startActivity(i);
                       // MainActivity.this.finish();
                    }
                    else{
                        updateQuestion();
                    }

                } else {

                    Toast.makeText(MainActivity.this, "Wrong", Toast.LENGTH_SHORT).show();
                    if (mQuestionNumber == len  ) {

                        Intent i = new Intent(MainActivity.this,Last.class);
                        Bundle bundle = new Bundle();
                        bundle.putInt("final score",mScore);
                        i.putExtras(bundle);
                        startActivityForResult(i,2);//startActivity(i);
                        //MainActivity.this.finish();
                    }
                    else{
                        updateQuestion();
                    }
                }
            }
        });

        mButtonChoice4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (mButtonChoice4.getText() == mAnswer) {

                    mScore +=  1;
                    updateScore(mScore);
                    Toast.makeText(MainActivity.this, "Correct", Toast.LENGTH_SHORT).show();

                    if (mQuestionNumber == len  ) {

                        Intent i = new Intent(MainActivity.this,Last.class);
                        Bundle bundle = new Bundle();
                        bundle.putInt("final score",mScore);
                        i.putExtras(bundle);
                        startActivityForResult(i,2);//startActivity(i);
                        //MainActivity.this.finish();
                    }
                    else{
                        updateQuestion();
                    }

                } else {
                    Toast.makeText(MainActivity.this, "Wrong", Toast.LENGTH_SHORT).show();
                    if (mQuestionNumber == len  ) {

                        Intent i = new Intent(MainActivity.this,Last.class);
                        Bundle bundle = new Bundle();
                        bundle.putInt("final score",mScore);
                        i.putExtras(bundle);
                        startActivityForResult(i,2);//startActivity(i);
                        //MainActivity.this.finish();
                    }
                    else{
                        updateQuestion();
                    }
                }
            }
        });

    }

   private void updateQuestion() {

       mQuestionView.setText(mQuestionLibrary.getQuestions(mQuestionNumber)); // set the question in questionView

       mButtonChoice1.setText(mQuestionLibrary.getChoice1(mQuestionNumber));  // set the option1 in button1
       mButtonChoice2.setText(mQuestionLibrary.getChoice2(mQuestionNumber));   // set the option2 in button2
       mButtonChoice3.setText(mQuestionLibrary.getChoice3(mQuestionNumber));    // set the option3 in button3
       mButtonChoice4.setText(mQuestionLibrary.getChoice4(mQuestionNumber));    // set the option4 in button4

       mAnswer = mQuestionLibrary.getCorrectAnswer(mQuestionNumber);           // store the correct answer corresponding to the mQuestionNumber
       mQuestionNumber++;                                                      // updates the question
   }

    private void updateScore( int point){

        mScoreView.setText(""+mScore);                // set the mScore on mScoreView.
    }

}
