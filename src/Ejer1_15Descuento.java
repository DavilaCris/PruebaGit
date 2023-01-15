import java.util.Scanner;


public class Ejer1_15Descuento {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		int num;
		double monto, descuento;

		System.out.println("dame el numero me des de la compra");
		num = teclado.nextInt();
		System.out.println("dime cual es el monto de la compra");
		monto = teclado.nextFloat();
		teclado.close();
		switch (num) {
		case 1: {
			System.out.println("tu monto a pagar es: " + monto);

		}
			break;
		case 2: {
			System.out.println("tu monto a pagar es: " + monto);

		}
			break;
		case 3: {
			System.out.println("tu monto a pagar es: " + monto);

		}
			break;
		case 4: {
			System.out.println("tu monto a pagar es: " + monto);

		}
			break;
		case 5: {
			System.out.println("tu monto a pagar es: " + monto);

		}
			break;
		case 6: {
			System.out.println("tu monto a pagar es: " + monto);

		}
			break;
		case 7: {
			System.out.println("tu monto a pagar es: " + monto);

		}
			break;
		case 8: {
			System.out.println("tu monto a pagar es: " + monto);

		}
			break;
		case 9: {
			System.out.println("tu monto a pagar es: " + monto);

		}
			break;
		case 10: {

			descuento = (monto * 0.18);
			System.out.println("el total a pagar es: " + (monto - descuento));

		}
			break;
		case 11: {

			System.out.println("tu monto a pagar es: " + monto);

		}
			break;
		case 12: {
			System.out.println("tu monto a pagar es: " + monto);

		}
			break;
		default:
			throw new IllegalArgumentException("Tiene que ser un mes valido: " + num);
		}
	}

}
