package lesson2;

public class TestString {

	public static void main(String[] args) {
		String text = "Hello world";
		System.out.println(text);
		System.out.println(text.length());
		System.out.println(text.charAt(0));
		System.out.println(text.charAt(6));
		System.out.println(text.toUpperCase());
		System.out.println(text.toLowerCase());
		System.out.println(text.contains("world"));
		System.out.println(text.contains("world3"));
		System.out.println(text.substring(0, 5));
		System.out.println(text.substring(5));
		System.out.println(text.indexOf("o"));
		System.out.println(text.indexOf("O"));
		System.out.println(text.indexOf("o", 5));
		System.out.println(text.replace("world", "Java"));
		
		if(text.indexOf("O") == -1) {
			System.out.println("O not found");
		} else {
			System.out.println("O is found");
		}
	}

}
