package testing_ground_pkg;

import java.util.Scanner;

public class Main_prog {

	public static void main(String[] args) {

		
		ChoiceQuestion first = new ChoiceQuestion();
		
		
		first.setText("What was the orginal name of the Java language?");
		first.addChoice("*7", false);
		first.addChoice("Duke", false);
		first.addChoice("Oak", true);
		first.addChoice("Gosling", false);
		
		Question second = new Question();
		second.setText("Who was the invetor of Java?");
		second.setAnswer("James Gosling");
		
		//first.presentQuestion();
		//second.presentQuestion();
		
		
		
		System.out.println(first.toString());
		System.out.println(second.toString());
		
	}
	


}
