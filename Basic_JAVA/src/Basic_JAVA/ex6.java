//Trabalho Realizado pelo Felipe Guedes	
/*

Fazer um programa que leia três valores com ponto flutuante de dupla precisão: A, B e C. Em seguida, calcule e
mostre:
a) a área do triângulo retângulo que tem A por base e C por altura.
b) a área do círculo de raio C. (pi = 3.14159)
c) a área do trapézio que tem A e B por bases e C por altura.
d) a área do quadrado que tem lado B.
e) a área do retângulo que tem lados A e B

		
		Entrada: 			Saída:
		3.0 4.0 5.2			TRIANGULO: 7.800
							CIRCULO: 84.949
							TRAPEZIO: 18.200
							QUADRADO: 16.000
							RETANGULO: 12.000
							
							
		Entrada: 			Saída:
		12.7 10.4 15.2		TRIANGULO: 96.520
							CIRCULO: 725.833
							TRAPEZIO: 175.560
							QUADRADO: 108.160
							RETANGULO: 132.080

*/


package Basic_JAVA;

import java.util.Locale;

public class ex6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		
		
	double A = 3.0;
	double B = 4.0;
	double C = 5.2;
	double pi = 3.14159; 
		
	double AreaTriangulo;
	double AreaCirculo;
	double AreaTrapezio;
	double AreaQuadrado;
	double AreaRetangulo;
	
	AreaTriangulo = (A*C)/2;
	AreaCirculo = pi* (C*C);
	AreaTrapezio = (C*(A+B))/2;
	AreaQuadrado = Math.pow(B,2);
	AreaRetangulo = A*B;
	
	
	System.out.printf("TRIANGULO: %.3f%n", AreaTriangulo);
	System.out.printf("CIRCULO: %.3f%n", AreaCirculo);
	System.out.printf("TRAPEZIO: %.3f%n", AreaTrapezio);
	System.out.printf("QUADRADO: %.3f%n", AreaQuadrado);
	System.out.printf("RETANGULO: %.3f%n%n%n", AreaRetangulo);
	

	
	double A2 = 12.7;
	double B2 = 10.4;
	double C2= 15.2;
	double pi2 = 3.14159; 
		
	double AreaTriangulo2;
	double AreaCirculo2;
	double AreaTrapezio2;
	double AreaQuadrado2;
	double AreaRetangulo2;
	
	AreaTriangulo2 = (A2*C2)/2;
	AreaCirculo2 = pi2* (C2*C2);
	AreaTrapezio2= (C2*(A2+B2))/2;
	AreaQuadrado2 = Math.pow(B2,2);
	AreaRetangulo2 = A2*B2;
	
	
	System.out.printf("TRIANGULO 2: %.3f%n", AreaTriangulo2);
	System.out.printf("CIRCULO 2: %.3f%n", AreaCirculo2);
	System.out.printf("TRAPEZIO 2: %.3f%n", AreaTrapezio2);
	System.out.printf("QUADRADO 2: %.3f%n", AreaQuadrado2);
	System.out.printf("RETANGULO 2: %.3f%n", AreaRetangulo2);

	
	}

}
