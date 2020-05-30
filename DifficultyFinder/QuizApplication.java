package quizApplication;

import java.util.Scanner;

public class QuizApplication {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		
		System.out.print("Enter the Students Count for writing the Exam: ");
		int size=scan.nextInt();
		
		Quiz quiz=new Quiz(size);
		PersonChanger change=new PersonChanger();
		
		int i=0;
		int j=size;
		
		while(size-->0) {
		quiz.begin(i,j);
		i++;
		
		change.Changer(i,j);
		}
		
	}
	
	

}
