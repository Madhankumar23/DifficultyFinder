package quizApplication;

import java.util.Scanner;

public class Quiz {
	
	int[][] data;
	int i,j;
	int size;
	
	public Quiz(int size) {
		this.size=size;
		this.data=new int[size][5];
		this.i=0; this.j=0;
	}
	
	void begin(int i,int size) {
		
	 Question q1=new Question("Which is the valid Keyword in Java?","Static","Final","interfere","super",new Answer("super"),"Easy");
	 Question q2=new Question("Which is the valid Keyword in Java?","Static","Final","interfere","super",new Answer("super"),"Easy");
	 Question q3=new Question("Which is the valid Keyword in Java?","Static","Final","interfere","super",new Answer("super"),"Easy");
	 Question q4=new Question("Which is the valid Keyword in Java?","Static","Final","interfere","super",new Answer("super"),"Easy");
	 Question q5=new Question("Which is the valid Keyword in Java?","Static","Final","interfere","super",new Answer("super"),"Easy");
	 Question[] arr= {q1,q2,q3,q4,q5};
	 
	 int countTotal=0;
	 int countCorrect=0;
	 int countWrong=0;
	 j=0;
	 
	 for(Question q:arr) {
		 
		 System.out.println(q.getQuestion()+" 'Level: "+q.getLevel()+"'");
		 System.out.println("A. "+q.getOption1());
		 System.out.println("B. "+q.getOption2());
		 System.out.println("C. "+q.getOption3());
		 System.out.println("D. "+q.getOption4());
		 System.out.print("Enter the Option: ");
		 
		 Scanner scan=new Scanner(System.in);
		 char ch1=scan.next().charAt(0);
		 char ch=Character.toUpperCase(ch1);
		 String answer="";
		 
		 switch(ch) {
		 case 'A':
			 answer=q.getOption1();
			 break;
		 case 'B':
			 answer=q.getOption2();
			 break;
		 case 'C':
			 answer=q.getOption3();
			 break;
		 case 'D':
			 answer=q.getOption4();
			 break;
		 default : break;
		 }
		 
		 if(answer.equals(q.answer.getAnswer())) {
			 System.out.println("-------------------------");
			 System.out.println("Correct Answer");
			 System.out.println("-------------------------");
			 countCorrect++;
			 data[i][j]=1;
			 j++;
		 }
		 else {
			 System.out.println("-------------------------");
			 System.out.println("Wrong Answer");
			 System.out.println("-------------------------");
			 countWrong++;
			 data[i][j]=0;
			 j++;
		 }
		 countTotal++;
		 System.out.println("-------------------------\n");
	 }
	 IResult result=new Results(countTotal,countCorrect,countWrong);
	 result.showResults();
	 
	 if((i+1)==size) {
		 IResult results=new Results(data,size);
		 results.difficultyIndex();
	 }
	}

}
