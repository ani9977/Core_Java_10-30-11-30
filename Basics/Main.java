package in.co.Basics;

public class Main {
	public static void main(String[] args) {
		String name = "aniket";
		int rows = 3; // Number of rows to print

		for (int i = 1; i <= rows; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(name + " ");
			}
			System.out.println();
		}
	}
}
