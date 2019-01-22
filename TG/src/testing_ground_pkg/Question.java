package testing_ground_pkg;

import java.util.Scanner;

public class Question {
	
	private String text;
	private String answer;
	
	public Question () {
		text="";
		answer="";
	}
	
	public void setText(String questionText) {
		text=questionText;
	}
	
	public void setAnswer(String correctResponse) {
		answer=correctResponse;
	}
	
	public boolean checkAnswer(String response) {
		return response.equals(answer);
	}
	
	public void display() {
		System.out.println(text);
	}
	
	
	public void presentQuestion() {
		this.display();
		System.out.print("Your answer: ");
		Scanner in = new Scanner(System.in);
		String response = in.nextLine();
		System.out.println(this.checkAnswer(response));
	}
	
	public void doSomething() {};

}
