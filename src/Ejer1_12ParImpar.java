import CalculadoraPackage.Calculadora;
import MyScannerPackage.MyScanner;

/*Algoritmo que pida un número y visualice por pantalla si es par o impar. */
public class Ejer1_12ParImpar {

	public static void main(String[] args) {
		int num1 = MyScanner.pideNumero();
		
		Calculadora parImp = new Calculadora ();
		
		parImp.setNum1(num1);
		
		System.out.println(parImp.parImpar());
			
		
	}

}
