package practice;

public class StringMethods {

	public static void main(String[] args) {

		String str = "Automation Training";
		String str1= "Automation training";

		int len = str.length();
		System.out.println(len);

		String uppercaseString = str.toUpperCase();
		System.out.println(uppercaseString);

		String lowercaseString = str.toLowerCase();
		System.out.println(lowercaseString);

		String replacedString = str.replace("Training", "Testing");
		System.out.println(replacedString);

		char ch = str.charAt(4);
		System.out.println(ch);

		int index = str.indexOf("m");
		System.out.println(index);

		boolean b=str.equals(str1);
		System.out.println(b);
		
		
		boolean bb=str.equalsIgnoreCase(str1);
		System.out.println(bb);
		
		
	}

}
