package practic.task4;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import nedis.study.interfaces.t4.exceptions.CustomException;
import nedis.study.interfaces.t4.exceptions.StringUtils;

public class StringUtilsImpl implements StringUtils {

	@Override
	public double div(String number1, String number2)
			throws NullPointerException, NumberFormatException, ArithmeticException {
		
		double n1 = Double.parseDouble(number1);
		double n2 = Double.parseDouble(number2);
		
		/*if (n2 == 0) {
			throw new ArithmeticException();
		} else if (number1 == null || number2 == null) {
			throw new NullPointerException();
		}else if (!(isDigit(number1) && isDigit(number2))) {
			throw new NumberFormatException();
		}*/
		

		return n1 / n2;

	}
	
	private boolean isDigit(String a) {
		char[] num = a.toCharArray();
		
		for (int i = 0; i < num.length; i++) {
			if (!Character.isDigit(num[i])) {
				return false;
			}
		}
		return true;
	}

	@Override
	public int[] findWord(String text, String word) throws NullPointerException {

		int[] result = new int[text.length()];
		String w = String.format("\\b%s\\b", word);
		int index = 0;
		int count = 0;

		Pattern p = Pattern.compile(w);
		Matcher m = p.matcher(text);

		while (m.find()) {

			index = m.start();
			result[count] = index;
			count++;
		}
		
		int[] res = new int[count];
		for(int i=0;i<count;i++){
			res[i] = result[i];
			//System.out.println(res[i]);
		}

		return res;
		
		/*int[] result = new int[text.length()];
		int counter = 0;
		int index = 0;
		while (true) {
			index = text.indexOf(word, index);
			if (index == -1) {
				break;
			} else {
				result[counter] = index;
				counter++;
				index++;
			}
		}

		return result;*/
	}

	private int parseNumber(StringBuilder s, double[] results, int counter) {
		if (s.length() > 0) {
			double value = Double.parseDouble(s.toString());
			results[counter++] = value;
			s.delete(0, s.length());
		}
		return counter;
	}

	@Override
	public double[] findNumbers(String text) throws CustomException {
		double[] results = new double[text.length()];
		int counter = 0;
		StringBuilder s = new StringBuilder();
		for (int i = 0; i < text.length(); i++) {
			char ch = text.charAt(i);
			if (Character.isDigit(ch)) {
				s.append(ch);
			} else if (ch == '.') {
				if (s.indexOf(".") == -1) {
					if (s.length() > 0) {
						s.append(ch);
					}
				} else {
					counter = parseNumber(s, results, counter);
				}
			} else {
				counter = parseNumber(s, results, counter);
			}
		}

		counter = parseNumber(s, results, counter);

		if (counter == 0) {
			throw new CustomException("Not found");
		}

		double[] result = new double[counter];
		for (int i = 0; i < counter; i++) {
			result[i] = results[i];
		}
		return result;
	}

}
