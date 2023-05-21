package Lecture1;

public class Marks {

	public static void main(String[] args) {
		int marks = 65;
		if (marks >= 75) {
			System.out.println("pass");
		} else if (marks < 75 && marks >= 65) {
			System.out.println("A");
		} else if (marks < 65 && marks >= 55) {
			System.out.println("B");
		} else
			System.out.println("fail");
	}

}
