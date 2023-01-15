/* Diseñar un algoritmo que pida por teclado tres números; si el primero es negativo,
debe imprimir el producto de los tres y si no lo es, imprimirá la suma.*/
import CalculadoraPackage.Calculadora;
import MyScannerPackage.MyScanner;

public class Ejer1_11 {
public static void main (String [] args) {
	int num1 = MyScanner.pideNumero();
	int num2 = MyScanner.pideNumero();
	int num3 = MyScanner.pideNumero();
	
	Calculadora menorMult = new Calculadora ();
	menorMult.setNum1(num1);
	menorMult.setNum2(num2);
	menorMult.setNum3(num3);
	
	if (num1 < 0) {
		System.out.println("el producto de los 3 numeros es: " + menorMult.multiplicar());
	} else {
		System.out.println("La suma de los 3 numeros es: " + menorMult.sumar());
	}
}
}
