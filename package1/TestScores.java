package package1;

public class TestScores {
	public static void main(String[] args) {
		ScoresAvgADT scores;
		scores = (ScoresAvgADT) new Scores();
		scores.enterScores();
		scores.computeAverage();
		scores = (ScoresAvgADT) new Scores1D();
		scores.enterScores();
		scores.computeAverage();
		scores = (ScoresAvgADT) new Villanueva_Exercise1();
		scores.enterScores();
		scores.computeAverage();

		}
	}
	    public interface ScoresAvgADT{
		// asks user to enter test scores
		public void enterScores();

		public void computeAverage();
}