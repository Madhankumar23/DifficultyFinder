package quizApplication;

public class Results implements IResult {
	
	int totalQuestions;
	int correctAnswers;
	int wrongAnswers;
	int[][] data;
	int[] sum;
	int total;
	int size;
	
	public Results(int totalQuestions, int correctAnswers, int wrongAnswers) {
		this.totalQuestions = totalQuestions;
		this.correctAnswers = correctAnswers;
		this.wrongAnswers = wrongAnswers;
		this.sum=new int[5];
		this.total=0;
	}
	
	public Results() {
	}
	
	 Results(int[][] data2, int size2) {
		 this.data=data2;
		 this.size=size2;
	}

	public void showResults() {
		System.out.println("Result: ");
		System.out.println("Total Question : "+totalQuestions);
		System.out.println("Correct Answers : "+correctAnswers);
		System.out.println("Wrong Answers : "+wrongAnswers);
		System.out.println("Your's Percentage : "+showPercentage(correctAnswers,totalQuestions));
		System.out.println("Your's Performance : "+showPerformance(showPercentage(correctAnswers,totalQuestions)));
	}
	
	public double showPercentage(int correctAnswers,int totalQuestions) {
		return((double)correctAnswers/totalQuestions)*100;
	}
	
	public String showPerformance(double percentage) {
		String performance="";
		if(percentage>60)
			performance="Good";
		else if(percentage<40)
			performance="Poor";
		else
			performance="Average";
		
		return performance;
	}
	
	public void difficultyIndex() {
		//difficultyIndex(data, size);
	}
	
	/*public void difficultyIndex(int[][] data,int size) {
		for(int j=0;j<5;j++) {
			total=0;
		   for(int i=0;i<size;i++) {
				total+=data[i][j];
		}
			sum[j]=total;
		}
		
		Question ques=new Question();
		
		for(int i=0;i<5;i++) {
			 int index=sum[i]/size;
			 if(index>0.75) {
				 ques.levels[i]="Easy";
			 }
			 else if(index<0.25) {
				 ques.levels[i]="Difficult";
			 }
			 else {
				 ques.levels[i]="Moderate";
			 }
		}
		
		System.out.println("The Difficulty Level of Questions:");
		
		for(int i=0;i<5;i++) {
			System.out.println("Question"+(i+1)+" "+ques.levels[i]);
		}
	}*/
	
	
}
