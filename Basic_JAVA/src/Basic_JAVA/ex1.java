//Trabalho Realizado pelo Felipe Guedes	
/* 	
		Faça um programa para ler dois valores inteiros, e depois mostrar na tela
		a soma desses números com uma mensagem explicativa, conforme exemplos
		
		Entrada: 			Saída:
		10					SOMA = 40
		30
						
		Entrada: 			Saída:
		-30					SOMA = -20
		10

		Entrada: 			Saída:
		0					SOMA = 0
		0

*/
package Basic_JAVA;

public class ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x1 = 10;
		int b1 = 30;
		int SOMA;
			
		SOMA = x1 + b1;
		
		System.out.println("SOMA = " + SOMA);
			
		int x2 = -30;
		int b2 = 10;
		int SOMA2;
			
		SOMA2 = x2 + b2;
		
		System.out.println("SOMA2 = " + SOMA2);
		
		int x3 = 0;
		int b3 = 0;
		int SOMA3;
		
		SOMA3 = x3 + b3;
		
		System.out.println("SOMA3 = " + SOMA3);
				
	}

}
