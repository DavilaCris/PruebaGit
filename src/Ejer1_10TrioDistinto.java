import CalculadoraPackage.Calculadora;
import MyScannerPackage.MyScanner;

public class Ejer1_10TrioDistinto {

	public static void main(String[] args) {
		int num1 = MyScanner.pideNumero();
		int num2 = MyScanner.pideNumero();
		int num3 = MyScanner.pideNumero();
		MyScanner.closeTeclado();
		Calculadora trio = new Calculadora ();
		trio.setNum1(num1);
		trio.setNum2(num2);
		trio.setNum3(num3);
		
		System.out.println(trio.mayorQue());
		
	}

}
