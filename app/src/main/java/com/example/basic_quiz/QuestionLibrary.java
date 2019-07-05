package com.example.basic_quiz;

public class QuestionLibrary  {

  public String mQuestions [] = {
          "For binary search algo. to work,it is necessary that the array(list) must be:",
          "push() and pop() functions are found in:",
          "The mini. no. of edges req.to create a cyclic graph of n vertices is:",
          "Which data structure is used for balancing of symbols?",
          "Which data structure is used in redo-undo feature?",
          "Data structure is best suited for effi. imple.of priority queue?",
          "Time Complexity of Binary Search:",
          "Time Complexity of Merge Sort:",
          "Number of edges present in a complete graph having n vertices?",
          "Maximum no. of edges in a bipartite graph having 10 vertices?"
  };

 public  String mChoice [][] = {
         {"sorted","unsorted","in a heap","popped out of stack"},
         {"queues","lists","stacks","trees"},
         {"n","n-1","n+1","2n"},
         {"Stack","Queue","Tree","Graph"},
         {"Queue","Graph","Stack","Tree"},
         {"Array","Linked List","Heap","Stack"},
         {"NLog(N)","Log(N*2)","Log(N)","Log(N*3)"},
         {"NLog(N)","Log(N*2)","Log(N)","Log(N*3)"},
         {"(n*(n+1))/2"," (n*(n-1))/2"," n","5n+2"},
         {"24","21","25","16"}
 };

public  String mCorrectAnswers[] ={"sorted","stacks","n", "Stack","Stack","Heap","Log(N)","NLog(N)","(n*(n-1))/2","25"};

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
