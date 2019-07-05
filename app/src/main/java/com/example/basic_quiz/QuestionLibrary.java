package com.example.basic_quiz;

public class QuestionLibrary  {

  public String mQuestions [] = {
          " C++ is ___ language.",
          " C++ is language.",
          "C++ is pure object oriented language."
  };

 public  String mChoice [][] = {
         {"Interpreted","Machine friendly","compiled","User Friendly"},
         {"pure object oriented","no object oriented","partially object oriented","dumb"},
         {"no","yes","no idea","none of the above"}
 };

public  String mCorrectAnswers[] ={"compiled","partially object oriented","yes"  };

 public String getQuestions(int a) {
     String question = mQuestions[a];
     return question;
 }
    public String getChoice1(int a) {
        String choice0 = mChoice[a][0];
        return choice0;
    }
    public String getChoice2(int a) {
        String choice1 = mChoice[a][1];
        return choice1;
    }
    public String getChoice3(int a) {
        String choice2 = mChoice[a][2];
        return choice2;
    }
    public String getChoice4(int a) {
        String choice3 = mChoice[a][3];
        return choice3;
    }

    public String getCorrectAnswer(int a) {
        String answer = mCorrectAnswers[a];
        return answer;
    }
}
