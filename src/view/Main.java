package view;

import controller.controllerFactorial;

public class Main {

	public static void main(String[] args) {
		controllerFactorial factorial = new controllerFactorial();
		
		int n = 4;
		int exclamation = factorial.Factorial(n);
		
		System.out.println(exclamation);
		
	}

}
