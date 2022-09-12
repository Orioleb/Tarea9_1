
public class Television extends Electrodomestico{
	private int pulgadas;
	private boolean TDT;
	
	//Usamos super para heredar constructor clase padre
	/**
	 * Constructor por defecto
	 */
	public Television() {
		super();
		pulgadas=20;
		TDT=false;
	}
	/**
	 * Constructor por defecto menos precioBase y peso
	 * @param precioBase
	 * @param peso
	 */
	public Television(double precioBase, double peso) {
		super(precioBase, peso);
		pulgadas=20;
		TDT=false;
	}
	/**
	 * Constructor por parametro
	 * @param precioBase
	 * @param peso
	 * @param consu
	 * @param colo
	 * @param pulgadas
	 * @param TDT
	 */
	public Television(double precioBase, double peso, char consu, String colo, int pulgadas, boolean TDT) {
		super(precioBase, peso, consu, colo);
		this.pulgadas=pulgadas;
		this.TDT=TDT;
	}
	
	//GETTERS
	public int getPulgadas() {
		return pulgadas;
	}
	
	public boolean getTDT() {
		return TDT;
	}
	/**
	 * Precio final teniendo en cuenta pulgadas, TDT, tamaño, letra y precioBAse
	 */
	@Override
	public double precioFinal() {
		
		double inicial=precioBase+precioLetra()+precioTamaño();
		double total=inicial;
		if((pulgadas>40)&&(TDT==true)) {
			total=(inicial*0.3)+inicial+50;
		}
		else {
			if(pulgadas>40) {
				total=(inicial*0.3)+inicial;
			}
			else {
				if(TDT==true) {
					total=inicial+50;
				}
			}
		}
		return total;
		
	}

}
