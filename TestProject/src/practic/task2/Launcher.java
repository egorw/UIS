package practic.task2;

import nedis.study.interfaces.t2.core.FractionNumber;
import nedis.study.interfaces.t2.core.FractionNumberOperation;

public class Launcher {

	public static void main(String[] args) {
		
		FractionNumber num1 = new FractionNumberImpl(1, 2);
		FractionNumber num2 = new FractionNumberImpl(1, 4);
		
		System.out.println(num1);
		System.out.println(num2);
		
		
		FractionNumberOperation fno = new FractionNumberOperationImpl();
		
		System.out.println("Результат сложения : " + num1 + "+ " + num2 + "= " + fno.add(num1, num2));
		System.out.println("Результат умножения : " + num1 + "* " + num2 + "= " + fno.mul(num1, num2));
		System.out.println("Результат вычитания : " + num1 + "- " + num2 + "= " + fno.sub(num1, num2));
		System.out.println("Результат деления : " + num1 + "/ " + num2 + "= " + fno.div(num1, num2));
		
	}
}
