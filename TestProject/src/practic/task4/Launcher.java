package practic.task4;

import java.util.Arrays;

import nedis.study.interfaces.t4.exceptions.StringUtils;

public class Launcher {

	public static void main(String[] args) {
		
	    String str = "word, Word in world wordpress srg word reword";
		String word = "word";
		
		StringUtils su = new StringUtilsImpl();
		StringUtilsImpl su1 = new StringUtilsImpl();
		
		System.out.println(Arrays.asList(su.div("1", "2")));
		System.out.println(Arrays.toString(su.findWord(str, word)));
		System.out.println(Double.parseDouble("5"));
		
	}

}
