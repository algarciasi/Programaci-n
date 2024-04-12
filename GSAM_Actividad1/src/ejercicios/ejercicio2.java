package ejercicios;

import java.util.Scanner;

public class ejercicio2 {

	/*Pedimos por pantalla un nombre y una contraseña:

		Si el nombre coincide con “sara”, preguntamos por  la contraseña 
		y si coincide con “sarita”, escribimos el mensaje “usuario y contraseña correctas,
		bienvenido a la aplicación”
		
		Si el nombre NO es “sara” Escribimos "usuario incorrecto”

		Si el nombre es correcto y la contraseña NO, Escribimos “contraseña incorrecta”.
	 */
	
	public static void main(String[] args) {
		String nombre, pass;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Dame el nombre: ");
		nombre=teclado.next();
		
		
		if(!nombre.equals("sara")) System.out.println("usuario incorrecto");
		else {
			System.out.println("Dame la contraseña: ");
			pass=teclado.next();
			teclado.close();
			if(pass.equals("sarita")) System.out.println("usuario y contraseña correctas, bienvenido a la aplicación");
			else System.out.println("contraseña incorrecta");
		
		}
	}

}
