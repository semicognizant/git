package testing_ground_pkg;

import java.util.Scanner;

public class Main_prog {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Question q = new Question();
		q.setText("Who ws the inventor of Java?");
		q.setAnswer("James Gosling");
		
		q.display();
		System.out.print("Your answer: ");
		String response = in.nextLine();
		System.out.println(q.checkAnswer(response));

	}

}
