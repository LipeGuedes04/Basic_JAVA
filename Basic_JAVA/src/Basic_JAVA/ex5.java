//Trabalho Realizado pelo Felipe Guedes	
/*

Fazer um programa para ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1, o
código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. Calcule e mostre o valor a ser pago.
		
		Entrada: 			Saída:
		12 1 5.30			VALOR A PAGAR: R$ 15.50
		16 2 5.10
		
		Entrada: 			Saída:
		13 2 15.30			VALOR A PAGAR: R$ 51.40
		161 4 5.20

		Entrada: 			Saída:
		1 1 15.10			VALOR A PAGAR: R$ 30.20
		2 1 15.10

*/

package Basic_JAVA;

public class ex5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int CodP1 = 12;
		int NumeroP1 = 1;
		double ValorP1 = 5.30;
		
		int CodP2 = 16;
		int NumeroP2 = 2;
		double ValorP2 = 5.10;
		
		
		double totalPagar;
		
		
		totalPagar = (NumeroP1 * ValorP1) + (NumeroP2 * ValorP2);
		

		System.out.printf("CÓDIGOS DO PRODUTO 1: %d%n", CodP1);
		System.out.printf("CÓDIGOS DO PRODUTO 2: %d%n", CodP2);
		System.out.printf("VALOR A PAGAR: R$ %.2f%n%n", totalPagar);
	
		int CodP3 = 13;
		int NumeroP3 = 2;
		double ValorP3 = 15.30;
		
		int CodP4 = 161;
		int NumeroP4 = 4;
		double ValorP4 = 5.20;
		
		
		double totalPagar2;
		
		
		totalPagar2 = (NumeroP3 * ValorP3) + (NumeroP4 * ValorP4);
		

		System.out.printf("CÓDIGOS DO PRODUTO 3: %d%n", CodP3);
		System.out.printf("CÓDIGOS DO PRODUTO 4: %d%n", CodP4);
		System.out.printf("VALOR A PAGAR: R$ %.2f%n%n", totalPagar2);

		
		int CodP5 = 1;
		int NumeroP5 = 1;
		double ValorP5 = 15.10;
		
		int CodP6 = 2;
		int NumeroP6 = 1;
		double ValorP6 = 15.10;
		
		
		double totalPagar3;
		
		
		totalPagar3 = (NumeroP5 * ValorP5) + (NumeroP6 * ValorP6);
		

		System.out.printf("CÓDIGOS DO PRODUTO 5: %d%n", CodP5);
		System.out.printf("CÓDIGOS DO PRODUTO 6: %d%n", CodP6);
		System.out.printf("VALOR A PAGAR: R$ %.2f", totalPagar3);

		
	}

}
