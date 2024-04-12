package ejercicios;

import java.util.Scanner;

public class ejercicio1 {
	
	/*
	 * Realizar un algoritmo en java que pida por teclado, cada vez, un número entero y 
	 * que vaya sumando los números pares hasta que se pulse un número entero negativo que
	 *  será la salida del programa y que, al terminar el programa presente:
		La media de la suma de todos los números pares, sin contar el cero
		El número de impares introducidos 
		El número de ceros introducidos por teclado  
	*/

	public static void main(String[] args) {
		int num;
		int sumaPares=0;
		double mediaPares;
		int sumaImpares=0;
		int sumaCeros=0;
		int cont=0;
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Dame un numero entero: ");
		num=teclado.nextInt();
		
		while(num>=0) {
			
			if (num==0) sumaCeros++;
			else if(num%2==0) {
				cont++;
				sumaPares+=num;
			}
			else {
				sumaImpares++;
				}
			System.out.println("Dame un numero entero: ");
			num=teclado.nextInt();
		}
		
		teclado.close();
		mediaPares=(double)sumaPares/cont;
		
		System.out.println("La media de los numeros pares (sin contar el cero) es de: " +mediaPares);
		System.out.println("El numero de pares introducidos es: " +sumaPares);
		System.out.println("El numero de impares introducidos es: " +sumaImpares);
		System.out.println("El numero de ceros introducidos es: " +sumaCeros);

	}

}
