package controller;

public class controllerFactorial {

	public controllerFactorial() {
		super();
	}
	
	public int Factorial(int n) {
		
		/* 
		Condi��o de Parada:
		Quando o n�mero "n" que est� entrando chegar a 0, 
		retornamos 1 
		*/  
		if (n == 0) {
			return 1;
		}
		
		/* 
		 Enquanto "n" � diferente da condi��o de parada, 
		 o retorno de "n" multiplicado por n - 1 vai sendo empilhado, com os n�meros em ordem decrescente, 
		 e a partir do momento que a condi��o de parada for atingida, os numeros empilhados v�o multiplicando
		 o n�mero imediatamente anterior na pilha.
		 */
		
		else {
			return n * Factorial(n - 1) ;
		}
		
	}

}
