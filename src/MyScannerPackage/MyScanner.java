package MyScannerPackage;

import java.util.Scanner;

public class MyScanner {
	
	private static Scanner teclado;
	
	
	
	public static String pideString() {
		teclado = new Scanner(System.in);
		String nombre;
		
		System.out.print("Introduce un String: ");
		nombre = teclado.next();
		return nombre;
	}
	public static int pideNumero() {
		teclado = new Scanner(System.in);
		int numero;
		
		System.out.print("Introduce un numero ");
		numero = teclado.nextInt();
		return numero;
	}
	public static String pideNombre() {
		teclado = new Scanner(System.in);
		String pideNombre;
		
		System.out.print("Introduce un Nombre: ");
		pideNombre = teclado.next();
		return pideNombre;
	}
	
	public static String pideApellido() {
		teclado = new Scanner(System.in);
		String pideApellido;
		
		System.out.print("Introduce un Apellido: ");
		pideApellido = teclado.next();
		return pideApellido;
	}
	public static void closeTeclado () {
		teclado.close();
	}
	
	
}
