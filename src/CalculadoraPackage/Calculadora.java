package CalculadoraPackage;

public class Calculadora {
	private int num1, num2, num3;

	

	public int sumar(int num1, int num2) {
		int suma;
		suma = num1 + num2;
		return suma;
	}

	public int sumar() {
		int suma;
		suma = this.num1 + this.num2 + this.num3;
		return suma;
	}

	public int restar() {
		int resta;
		resta = num1 - num2 - num3;

		return resta;
	}

	public double dividir() {
		double divide;
		divide = ((num1 / num2)/ num3);

		return divide;
	}

	public int multiplicar() {
		int multiplica;
		multiplica = num1 * num2 * num3;

		return multiplica;
	}

	public int mayorQue() {
		int mayor = num1;
		
		if (num2 > mayor ) {
			mayor = num2;
			 
		}
		
		 if (num3 > mayor){
			mayor= num3;
			
		} 
		 
		return mayor;
	}
	
	public String igualesDistin() {
	
		String mayor1= "";
		if (num1 > num2) {
			mayor1 = "el numero mayor es "+ num1;
		}
		else {
			mayor1 = "el numero mayor es "+ num2;;
		}
		
		if (num1 == num2) {
			mayor1 = "Los numeros son iguales";
		}
		
		
		return mayor1;
	}
	
	public String parImpar () {
		String result = "";
		if (num1 % 2 == 0) {
			result = "El numero es par";
		}else {
			result = "El numero es impar";
		}
		return result;
	}
	public int getNum1() {
		return num1;
	}
	
	

	public void setNum1(int num1) {
		this.num1 = num1;
	}

	public int getNum2() {
		return num2;
	}

	public void setNum2(int num2) {
		this.num2 = num2;
	}
	public int getNum3() {
		return num3;
	}

	public void setNum3(int num3) {
		this.num3 = num3;
	}
}
