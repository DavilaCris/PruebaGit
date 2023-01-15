import IndicadorPackage.Indicador;

public class Ejer1_04IndicadorMain {
	
	public static void main(String[] args) {
		Indicador [] arrayIndicador =  new Indicador[10];
			
		Indicador deNivel;
		
		for (int i = 0; i < 5; i++) {
			deNivel = new Indicador (100,200,"Gramos", "Glucometro "+i);
			arrayIndicador[i]=deNivel;
		}
		
		//arrayIndicador[0].imprimirIndicador();
		for (int i = 0; i < 5; i++) {
			arrayIndicador[i].imprimirIndicador();
			System.out.println("\n");			
		}
		
		
	}

	

}
