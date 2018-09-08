package practic.task1;

import nedis.study.interfaces.ExampleInterface;

public class Launcher {

	public static void main(String[] args) {
		ExampleInterface ex = new ExampleInterfaceImpl();
		System.out.println(ex.getHelloWorld());

		
		
	}

}
