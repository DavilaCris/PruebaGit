import CalculadoraPackage.Calculadora;
import MyScannerPackage.MyScanner;

public class Ejer1_7NumeroMayor {

	public static void main(String[] args) {
		int num1 = MyScanner.pideNumero();
		int num2 = MyScanner.pideNumero();
		
		Calculadora mayoMenor = new Calculadora();
		mayoMenor.setNum1(num1);
		mayoMenor.setNum2(num2);

		System.out.println("el numero mayor es: " + mayoMenor.mayorQue());

	}

}
