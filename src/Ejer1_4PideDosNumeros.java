import MyScannerPackage.MyScanner;

public class Ejer1_4PideDosNumeros {

	public static void main(String[] args) {
	int num1, num2;
	
	num1 = MyScanner.pideNumero();
	num2 = MyScanner.pideNumero();
	MyScanner.closeTeclado();
	System.out.println("Tus numeros son: " + num1 + " y " + num2);
	

	}

}
