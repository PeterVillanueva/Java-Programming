package package1;

import java.util.*;

public class Villanueva_Exercise1 implements ScoresAvgADT {
	private final static int NUM_EXAMS = 4;
	private Scanner scanner = new Scanner(System.in);
	private int[] exam;
	
	
	public Villanueva_Exercise1() {
		exam = new int[NUM_EXAMS];
	}

	
	public void enterScores() {
		System.out.print("Enter Four Scores:");
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
