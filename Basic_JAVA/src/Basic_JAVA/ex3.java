//Trabalho Realizado pelo Felipe Guedes	
/* 	
	Fazer um programa para ler quatro valores inteiros A, B, C e D. A seguir, calcule e mostre a diferença do produto
de A e B pelo produto de C e D segundo a fórmula: DIFERENCA = (A * B - C * D).
		
		Entrada: 			Saída:
		5					DIFERENCA = -26
		6
		7
		8
	
		Entrada: 			Saída:
		5					DIFERENCA = 8
		6
		-7
		8
	
*/
package Basic_JAVA;

public class ex3 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	int A = 5;
	int B = 6;
	int C = 7;
	int D = 8;
	int DIFERENCA;
	
	DIFERENCA = (A * B - C * D);
	
	System.out.println("DIFERENCA = " + DIFERENCA);
	
	int A2 = 5;
	int B2 = 6;
	int C2= -7;
	int D2 = 8;
	int DIFERENCA2;
	
	DIFERENCA2 = (A2 * B2 - C2 * D2);
	
	System.out.println("DIFERENCA = " + DIFERENCA2);
	
	}
}
