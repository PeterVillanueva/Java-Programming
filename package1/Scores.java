package package1;

import java.util.*;
public class Scores implements ScoresAvgADT {
	private final static int NUM_EXAMS = 3;
	private Scanner scanner = new Scanner(System.in);
	private int exam1, exam2, exam3;
	public Scores() {
	}

	public void enterScores() {
		System.out.print("Enter three scores: ");

		exam1 = scanner.nextInt();
		exam2 = scanner.nextInt();
		exam3 = scanner.nextInt();

	}
	public void computeAverage() {
		double sum;
		sum = exam1 + exam2 + exam3;
		System.out.printf("Average score: %.2f \n",sum / NUM_EXAMS);
	}
}