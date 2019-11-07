package practice;

public class EExampleJava {

	public static void main(String[] args) {

		String str = null;

		try {
			System.out.println(str.length());
			System.out.println("I am inside try");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		System.out.println("Prog ended");

	}

}
