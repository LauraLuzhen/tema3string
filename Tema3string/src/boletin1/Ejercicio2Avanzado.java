package boletin1;

import java.util.Scanner;

public class Ejercicio2Avanzado {

	// Creamos el Scanner
	static Scanner reader = new Scanner (System.in);
	
	public static void main(String[] args) {
		
		// Declaración de variables
		// Variable que guarda la contraseña
		String contraseña = "contraseña";
		// Variable que guarda la posible contraseña
		String adivinar;
		
		char c[] = tabla(contraseña);
		char a[];
		char tablaPistas[];
		
		System.out.println("Introduce la contraseña: ");
		adivinar = reader.nextLine();
		
		while (contraseña.compareTo(adivinar) != 0) {
			a = tabla(adivinar);
			
			tablaPistas = pistas(a, c);
			for (char valor: tablaPistas) {
				System.out.print(valor);
			}
			System.out.println("Introduce la contraseña: ");
			adivinar = reader.nextLine();
		}
		
		System.out.println("Has adivinado la contraseña");
		reader.close();
	}
	
	// Función que pone la contraseña en una tabla
	static char[] tabla(String c) {
		
		char t[] = new char[c.length()];
		
		for (int i = 0; i < c.length(); i++) {
			t[i] = c.charAt(i);
		}
		
		return t;
	}
	
	// Función que devuelve las letras acertadas y las que no las pone en *
	static char[] pistas(char a[], char c[]) {
		
		char t[] = new char[c.length];
		
		a = new char[c.length];
		
		for (int i = 0; i < c.length; i++) {
			if (c[i] == a[i]) {
				t[i] = c[i];
			} else {
				t[i] = '*';
			}
		}
		
		return t;
	}
}
