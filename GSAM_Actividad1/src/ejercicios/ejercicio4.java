package ejercicios;

public class ejercicio4 {

	/*	Crea un array de enteros e introduce la edad de 10 personas, 
	 * 	y las variables necesarias para, recorrer el array  
	 * 	y mostrar al final los siguientes datos:
		Número de mayores de edad.
		Número de menores de edad.
		Media de edades.
	 */
	
	public static void main(String[] args) {
		
		int mayorEdad=0;
		int menorEdad=0;
		int sumaEdad=0;
		double mediaEdad=0.0;
		
		int [] enteros = {15,20,21,8,19,54,60,7,17,18};
		
		for(int i=0;i<enteros.length;i++) {
			sumaEdad += enteros[i];
			if(enteros[i]>=18) mayorEdad++;
			else menorEdad++;
		}
		mediaEdad=(double)sumaEdad/enteros.length;
		
		System.out.println("El numero de personas mayores de edad es: " +mayorEdad);
		System.out.println("El numero de personas menores de edad es: " +menorEdad);
		System.out.println("La media de edad de las personas es: " +mediaEdad);
		
	}

}
