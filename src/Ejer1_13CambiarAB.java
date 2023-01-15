
import MyScannerPackage.MyScanner;

/*Dadas dos variables numéricas a y b, que el usuario debe introducir por teclado, se
pide realizar un algoritmo que intercambie los valores de ambas variables y
muestre por pantalla cuánto valen al final las dos variables.
*/
public class Ejer1_13CambiarAB {

	public static void main(String[] args) {
		int num1 = MyScanner.pideNumero();
		int num2 = MyScanner.pideNumero();
		int aux;
		
		aux = num1;
		num1 = num2;
		num2 = aux;
		
		System.out.println("la variable uno tiene " + num1 + " la variable dos tiene " + num2+ " como valor ");
		
	}

}
