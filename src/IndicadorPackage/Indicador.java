package IndicadorPackage;

public class Indicador {
	/*
	 	Desarrollar un programa en Java que utilice una clase que se llame Indicador que sea la
		representación de un indicador de la vida real (indicadores de nivel, de velocidad,
		tacómetros, etc).
		La clase deberá tener los atributos valorMinimo, valorMaximo, valorActual,
		unidades y nombre del indicador. En el momento de la creación de cada objeto se
		asignarán todos los elementos salvo el valorActual. Entre los métodos que se
		programarán deberán estar el de asignación del valorActual, imprimir el valor, imprimir el
		indicador e incrementar y disminuir el valorActual con el que cuentan.
		En ese programa (el principal), crearás un vector de elementos de tipo Indicador y se podrá
		escoger el indicador a tratar.
	 */
	
	private int valorMinimo;
	private int valorMaximo;
	private int valorActual;
	private String unidades;
	private String nombre;
	
	public Indicador(int valorMinimo, int valorMaximo, String unidades, String nombre) {
		this.valorMinimo=valorMinimo;
		this.valorMaximo=valorMaximo;
		this.unidades=unidades;
		this.nombre=nombre;		
	}
	
	public int getValorActual() {
		return valorActual;
	}

	 
	//asignación del valorActual,
	public void setValorActual(int valorActual) {
		this.valorActual = valorActual;
	}
	
	//imprimir el valor
	public void imprimirValorActual() {
		System.out.println("Valor Actual"+valorActual);
		
	}
	
	public void imprimirIndicador() {
		System.out.println("Valor valorMinimo"+valorMinimo);
		System.out.println("Valor valorMaximo"+valorMaximo);
		System.out.println("Valor unidades"+unidades);
		System.out.println("Valor nombre"+nombre);
		System.out.println("Valor valorActual"+valorActual);		
	}
	
	//disminuir el valor actual
	public int dismunirValorActual() {
		return valorActual -1;		
	}
	
	//incrementar actual
	public int incrementarValorActual() {
		return valorActual +1;		
	}

}
