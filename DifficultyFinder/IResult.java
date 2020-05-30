package quizApplication;

public interface IResult {
	
	void showResults();
	double showPercentage(int correctAnswers,int totalQuestions);
	String showPerformance(double percentage);
	void difficultyIndex();
}
