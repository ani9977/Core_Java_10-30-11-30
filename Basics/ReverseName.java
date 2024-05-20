package in.co.Basics;

public class ReverseName {

	public static void main(String[] args) {

//		String name = "aniket kumawat";
//		for (int i = name.length()-1; i >= 0; i--) {
//			System.out.print(name.charAt(i));
//		}
		String s = "aniket kumawat";
		String[] s1 = s.split(" ");
		for (int i = 0; i < s1.length; i++) {
			for (int j= s1[i].length()-1; j>=0; j--) {
				System.out.print(s1[i].charAt(j));
			}
			System.out.print(" ");
		}

		
		
	}

}
