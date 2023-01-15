import MyScannerPackage.MyScanner;

public class Ejer1_2PedirNombre {

	public static void main(String[] args) {
		/*String miNombre = MyScanner.pideString();
		System.out.print("Tu nombre es: " + miNombre );*/
		int numero = MyScanner.pideNumero();
		System.out.println("tu numero es: "+ numero);
	}

	/*public static String pideString() {
		Scanner teclado = new Scanner(System.in);
		String nombre;
		
		System.out.print("Dame un nombre: ");
		nombre = teclado.next();
		teclado.close();
		return nombre;
	}*/
}
