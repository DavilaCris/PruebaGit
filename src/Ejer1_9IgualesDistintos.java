import CalculadoraPackage.Calculadora;
import MyScannerPackage.MyScanner;

public class Ejer1_9IgualesDistintos {

	public static void main(String[] args) {
		int num1 = MyScanner.pideNumero();
		int num2 = MyScanner.pideNumero();
	
		Calculadora iguales2 = new Calculadora ();
		iguales2.setNum1(num1);
		iguales2.setNum2(num2);
		
		System.out.println(iguales2.igualesDistin());
		}
	}


