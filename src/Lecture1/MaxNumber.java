package Lecture1;

public class MaxNumber {

	public static void main(String[] args) {
		int x = 7, y = 14;
		if (x >= y) {

			System.out.println(x + " is greater than " + y);
		} else
			System.out.println(y + " is greater than " + x);
		main(x, y);
	}

	public static void main(int x, int y) {
		int z = 14;

		if (x >= y && x >= z) {
			System.out.println(x + "x is greater");
		} else if (y >= z) {
			System.out.println(y + "y is greater");
		} else
			System.out.println(z + "z is greater");
	}

}
