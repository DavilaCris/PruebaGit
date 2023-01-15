import CalculadoraPackage.Calculadora;
import MyScannerPackage.MyScanner;

public class Ejer1_8MayorIgual {

	public static void main(String[] args) {
		int num1 = MyScanner.pideNumero();
		int num2 = MyScanner.pideNumero();
	
		Calculadora calIgualMayor = new Calculadora();
		calIgualMayor.setNum1(num1);
		calIgualMayor.setNum2(num2);
		
		System.out.println( calIgualMayor.igualesDistin());
		
	}

}
