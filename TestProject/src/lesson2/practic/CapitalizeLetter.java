package lesson2.practic;

public class CapitalizeLetter {

	public static void main(String[] args) {
		String source1 = "as gtet E rt w wi ywe Aa try";
		System.out.println(capitalize(source1));
		
		String source2 = "ay yY ttt ghthhh ";
		System.out.println(capitalize(source2));

	}
	
	static String capitalize(String str) {
		StringBuilder result = new StringBuilder();
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if ("aeiou".indexOf(ch) != -1) {
				result.append(Character.toUpperCase(ch));
			}
			else {
				result.append(ch);
			}
		}
		return result.toString();
	}

}
