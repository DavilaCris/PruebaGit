import CalculadoraPackage.Calculadora;
import MyScannerPackage.MyScanner;

public class Ejer1_5Calculadora {

	public static void main(String[] args) {
	 
		int num1, num2;
		
		num1 = MyScanner.pideNumero();
		num2 = MyScanner.pideNumero();
		MyScanner.closeTeclado();
		
		Calculadora miCalculadora = new Calculadora();
		
		miCalculadora.setNum1(num1);
		miCalculadora.setNum2(num2);
		
		System.out.println(" tu suma es: " + miCalculadora.sumar());
		System.out.println(" tu otra suma es: " + miCalculadora.sumar(20,5));
		System.out.println(" tu resta es: " + miCalculadora.restar());
		System.out.println(" tu multiplicacion es: " + miCalculadora.multiplicar());
		System.out.println(" tu division es: " + miCalculadora.dividir());
	}

	
}
