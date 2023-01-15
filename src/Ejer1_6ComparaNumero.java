import CalculadoraPackage.Calculadora;
import MyScannerPackage.MyScanner;

public class Ejer1_6ComparaNumero {

	public static void main(String[] args) {
		int num1 = MyScanner.pideNumero();
		int num2 = MyScanner.pideNumero();
		
		Calculadora myCalculadora = new Calculadora ();
		myCalculadora.setNum1(num1);
		myCalculadora.setNum2(num2);
		
		System.out.println(myCalculadora.mayorQue());

	}
}
