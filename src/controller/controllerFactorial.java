package controller;

public class controllerFactorial {

	public controllerFactorial() {
		super();
	}
	
	public int Factorial(int n) {
		
		/* 
		Condição de Parada:
		Quando o número "n" que está entrando chegar a 0, 
		retornamos 1 
		*/  
		if (n == 0) {
			return 1;
		}
		
		/* 
		 Enquanto "n" é diferente da condição de parada, 
		 o retorno de "n" multiplicado por n - 1 vai sendo empilhado, com os números em ordem decrescente, 
		 e a partir do momento que a condição de parada for atingida, os numeros empilhados vão multiplicando
		 o número imediatamente anterior na pilha.
		 */
		
		else {
			return n * Factorial(n - 1) ;
		}
		
	}

}
