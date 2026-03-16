//Trabalho Realizado pelo Felipe Guedes	
/* 	
Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por
hora e calcula o salário desse funcionário. A seguir, mostre o número e o salário do funcionário, com duas casas
decimais..
		
		Entrada: 			Saída:
		25					NUMBER = 25
		100					SALARY = U$ 550.00
		5.50
	
		Entrada: 			Saída:
		1					NUMBER = 1
		200					ALARY = U$ 4100.00
		20.50

		Entrada: 			Saída:
		6  					NUMBER = 6
		145 				SALARY = U$ 2254.75=
		15.55

*/

package Basic_JAVA;

import java.util.Locale;

public class ex4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
			
		int numeroFunci = 25;
		int horasTraba = 100;
		double valorHora = 5.50;
		double salario;
		
		salario = horasTraba * valorHora;
		
		System.out.printf("NUMBER = %d%n", numeroFunci);
		System.out.printf("SALARY = U$ %.2f%n", salario);
		
		int numeroFunci2 = 1;
		int horasTraba2 = 200;
		double valorHora2 = 20.50;
		double salario2;
		
		salario2 = horasTraba2 * valorHora2;
		
		System.out.printf("NUMBER = %d%n", numeroFunci2);
		System.out.printf("SALARY = U$ %.2f%n", salario2);
						
		int numeroFunci3 = 6;
		int horasTraba3 = 145;
		double valorHora3 = 15.55;
		double salario3;
		
		salario3 = horasTraba3 * valorHora3;
		
		System.out.printf("NUMBER = %d%n", numeroFunci3);
		System.out.printf("SALARY = U$ %.2f%n", salario3);
		

	}

}
