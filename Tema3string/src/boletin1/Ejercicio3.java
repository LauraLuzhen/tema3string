package boletin1;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {

		// Declaración de variables
		// Variable que guarda la frase del usuario
		String frase;

		// Creamos el Scanner
		Scanner reader = new Scanner(System.in);

		// Le pedimos una frase al usuario
		System.out.println("Introduce una frase: ");
		frase = reader.nextLine();

		// Llamamos a la función y la imprimimos
		System.out.println("La frase tiene " + cantEspacio(frase) + " espacios.");

		// Cerramos el Scanner
		reader.close();
	}

	// Función que devuelve la cantidad de espacios que hay en un String
	static int cantEspacio(String f) {

		// Declaración de variables
		// Variable que guarda la cantidad de espacios que hay
		int espacios = 0;
		// Variable que guarda el carácter a comparar
		char caracter;

		// Creamos un for que recorra todas las posiciones de la frase
		for (int i = 0; i < f.length(); i++) {
			// Nos guardamos el carácter que vamos a comparar
			caracter = f.charAt(i);

			// Creamos un if que comprueba si el carácter es un espacio o no
			if (caracter == ' ') {
				// Si lo es aumentamos el contador
				espacios++;
			}
		}

		// Devolvemos la canrtidad
		return espacios;
	}
}
