package lesson2.practic;

public class FindNumbers {

	public static void main(String[] args) {
		String source1 = "qwelwfk2334k23bdrtbr94854975dlfbrt54nkfntb";
		System.out.println(findNumbers(source1));

		String source2 = " 2423423dsvr vse-srbre434f.bsgtb5435b ";
		System.out.println(findNumbers(source2));

		String src1 = "qwqwe123wewerw2343dfdf56hh6f";
		// 123,2343,56,6
		System.out.println(findNumbers(src1));

		String src2 = "qwqwe12.3wewerw67;43dfdf5-6hh6";
		// 12,3,67,43,5,6,6
		System.out.println(findNumbers(src2));

	}

	static String findNumbers(String text) {

		StringBuilder builder = new StringBuilder();
		for (int i = 0; i < text.length(); i++) {
			char c = text.charAt(i);
			if (Character.isDigit(c)) {
				builder.append(c);
				builder.append(",");
			}
		}
		if (text.length() > 0) {
			builder.deleteCharAt(builder.length() - 1);

		}
		return builder.toString();
	}
}

// Ne rabotayushchiy kod
/*
 * StringBuilder result = new StringBuilder(); boolean foundDigit = false; for
 * (int i = 0; i < text.length(); i++) { char ch = text.charAt(i); if
 * (Character.isDigit(ch)) { result.append(ch); foundDigit = true;
 * 
 * } else { if (result.length() > 0 && foundDigit) { result.append(",");
 * 
 * } foundDigit = false;
 * 
 * }
 * 
 * }
 * 
 * if (result.length() > 0) { result.deleteCharAt(result.length()-1);
 * 
 * }
 * 
 * return result.toString();
 */
