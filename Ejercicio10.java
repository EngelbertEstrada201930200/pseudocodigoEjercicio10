import java.util.*;
public class Ejercicio10 {

	public static void main (String[] args){

		int numero;
		int suma = 0;
		int resta = 0;
		int mult = 0 ;
		int sumab = 0;

		Scanner entrada = new Scanner (System.in);

		while ( suma < 1000) {

			System.out.print (" Ingresa un numero: ");
			numero = entrada.nextInt();

			suma = suma + numero;
			resta =  1000 - suma; 

			System.out.print ("Disponible "+ resta);

			if ( numero % 6 == 0){

				mult = mult+1;
			} 

				if (  numero >= 1 && numero <=10){
					sumab = sumab+numero;
				}

		}

		System.out.println("\n a) La cantidad de numeros multiplos de 6 son: " +mult);
		System.out.println("\n b) La suma entre 1 a 10 es: "+sumab);


	}
}