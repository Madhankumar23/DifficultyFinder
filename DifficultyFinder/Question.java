package quizApplication;

public class Question {
	
	String question;
	String option1;
	String option2;
	String option3;
	String option4;
	Answer answer;
	String level;
	String[] levels;
	
	public Question() {
		
	}
	public Question(String question, String option1, String option2, String option3, String option4, Answer answer,String level) {
		this.question = question;
		this.option1 = option1;
		this.option2 = option2;
		this.option3 = option3;
		this.option4 = option4;
		this.answer = answer;
		this.level=level;
		this.levels=new String[5];
	}
	public String getQuestion() {
		return question;
	}
	public String getOption1() {
		return option1;
	}
	public String getOption2() {
		return option2;
	}
	public String getOption3() {
		return option3;
	}
	public String getOption4() {
		return option4;
	}
	public Answer getAnswer() {
		return answer;
	}
	public String getLevel() {
		return level;
	}
	
	
}
