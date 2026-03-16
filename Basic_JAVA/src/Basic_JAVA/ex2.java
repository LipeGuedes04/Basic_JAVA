//Trabalho Realizado pelo Felipe Guedes	
/* 	
		Faça um programa para ler o valor do raio de um círculo, e 
		depois mostrar o valor da área deste círculo com quatro
		casas decimais conforme exemplos.
		Fórmula da área: area = π . raio2
		Considere o valor de π = 3.14159
		
		Entrada:2.00 		Saída:A=12.5664
		
		Entrada:100.64      Saída:A=31819.3103
		 
		Entrada: 150.00     Saída: A=70685.7750
	
*/
package Basic_JAVA;

public class ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	double pi = 3.14159;	
	double raio = 2.00;
	double AreaCirculo;
		
	AreaCirculo = pi * Math.pow(raio, 2);
	System.out.printf("A1= %.4f%n" , AreaCirculo);
		
		
	double pi2 = 3.14159;	
	double raio2 = 100.64;
	double AreaCirculo2;
		
	AreaCirculo2 = pi2 * Math.pow(raio2, 2);
	System.out.printf("A2= %.4f%n" , AreaCirculo2);
	
	
	double pi3 = 3.14159;	
	double raio3 = 150.00;
	double AreaCirculo3;
		
	AreaCirculo3 = pi3 * Math.pow(raio3, 2);
	System.out.printf("A3= %.4f%n" , AreaCirculo3);
		
	}

}
