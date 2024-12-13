package boletin1;

import java.util.Scanner;

public class Ejercicio9 {

	// Creamos el Scanner
	static Scanner reader = new Scanner (System.in);
	
	public static void main(String[] args) {
		
		// Declaración de variables
		// Variable que guarda la frase del usuario
		String frase;
		// Variable que guarda el saludo de una persona de Javalín
		String saludo = "Javalín, javalón     ";
		// Variable que guarda la despedida de una persona de Javalín en su dialecto
		String despedida = "     javalén, len, len";
		// Variable que indica si es de Javalandia por su saludo
		int val1;
		int val2;
		String fraseNormal;
		
		// Le pedimos una frase al usuario
		System.out.println("Introduce una frase: ");
		frase = reader.nextLine();
		
		if (frase.length() >= despedida.length()) {
		val1 = frase.indexOf(saludo, 0, saludo.length());
		val2 = frase.indexOf(despedida, frase.length()-despedida.length(), frase.length());
		if (val1 >= 0 || val2 >= 0) {
			if (val1 >= 0) {
				fraseNormal = frase.replace(saludo, "");
			} else {
				fraseNormal = frase.replace(despedida, "");
			}
		} else {
			fraseNormal = frase + " (No es de Javalandia)";
		}
		} else {
			fraseNormal = frase + " (No es de Javalandia)";
		}
		System.out.println(fraseNormal);
		
		// Cerramso el Scanner
		reader.close();
	}
}
