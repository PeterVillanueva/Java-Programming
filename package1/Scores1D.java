package package1;

import java.util.*;
public class Scores1D implements ScoresAvgADT{
	private final static int NUM_EXAMS = 3;
	private Scanner scanner = new Scanner(System.in);
	private int[] exam;
	
	public Scores1D() {
		exam = new int[NUM_EXAMS];
		}

	public void enterScores() {
		System.out.print("Enter three scores:");
		for(int i=0; i<NUM_EXAMS; i++)
			exam[i] = scanner.nextInt();
	}

	public void computeAverage() {
		double sum;
		sum = 0.0;
		for(int i=0; i<NUM_EXAMS; i++)
		sum = sum + exam[i];
		System.out.printf("Average score: %.2f \n", sum / NUM_EXAMS);
	}
}
