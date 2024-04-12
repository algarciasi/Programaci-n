package ejercicios;

public class ejercicio3 {
	
	/*Realizar una función que calcule y devuelva el área o el volumen de un cilindro,
	 *  según se especifique. Para distinguir un caso de otro se le pasará 
	 *  el carácter 'a' (para área) o 'v' (para el volumen) a la función .
		Además hemos de pasarle a la función el radio y la altura.

		En el método main, hacer las pruebas necesarias para comprobar que la función 
		hace lo que tiene que hacer.
	 */ 

	public static void main(String[] args) {
		
		calculoCilindro('a',5,5);
		calculoCilindro('v',5,5);
		
		
	}
	
	public static void calculoCilindro(char x, int radio, int altura) {
		
		double areaCilindro;
		double volumenCilindro;
		if(x=='a') {
			areaCilindro = ((2*Math.PI*radio*altura)+(2*Math.PI*Math.pow(radio, 2)));
			System.out.println("El area del cilindro es: " +areaCilindro);		
		}
		if(x=='v') {
			volumenCilindro =(Math.PI*Math.pow(radio, 2)*altura);
			System.out.println("El volumen del cilindro es: " +volumenCilindro);
		}

	}

}
