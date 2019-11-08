package practice;

public class EExampleJava {

	public static void main(String[] args) {

		int i = 10;
		int j = 0;
		try {

			System.out.println(i / j);
		} catch (NullPointerException npe) {
			System.out.println(npe.getMessage());
		}

		finally {
			System.out.println("I am the last line of the prog");
		}
	}

}
