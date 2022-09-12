
public class Lavadora extends Electrodomestico{
	
	final double carga;
	
	//Usamos super para heredar constructor clase padre
	/**
	 * Constructor por defecto
	 */
	public Lavadora() {
		super();
		carga=5;
	}
	/**
	 * Constructor por defecto menos precioBase y peso
	 * @param precioBase
	 * @param peso
	 */
	public Lavadora(double precioBase, double peso) {
		super(precioBase, peso);
		carga=5;
	}
	/**
	 * Constructor por parametro
	 * @param precioBase
	 * @param peso
	 * @param consu
	 * @param colo
	 * @param c
	 */
	public Lavadora(double precioBase, double peso, char consu, String colo, double c) {
		super(precioBase, peso, consu, colo);
		carga=c;
	}
	
	//GETTER
	public double getCarga() {
		return carga;
	}
	/**
	 * Calculo precio final teniendo en cuenta la letra, el tamaño y la carga
	 */
	@Override
	public double precioFinal() {
		double total;
		if(carga>30) {
			total=precioBase+precioLetra()+precioTamaño()+50;
		}
		else {
			total=precioBase+precioLetra()+precioTamaño();
		}
		return total;
		
	}
	

}
