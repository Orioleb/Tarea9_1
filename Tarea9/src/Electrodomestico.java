
public class Electrodomestico {
	
	protected double precioBase;
	protected String color;
	protected char consumo;
	protected double peso;
	
	/**
	 * Constructor por defecto
	 */
	public Electrodomestico() {
		color="Blanco";
		consumo='F';
		precioBase=100;
		peso=5;
	}
	/**
	 * Por defecto menos precioBase y peso
	 * @param precioBase
	 * @param peso
	 */
	public Electrodomestico(double precioBase, double peso) {
		this.precioBase=precioBase;
		this.peso=peso;
		color="Blanco";
		consumo='F';
	}
	/**
	 * Constructor por parametro
	 * @param precioBase
	 * @param peso
	 * @param consu
	 * @param colo
	 */
	public Electrodomestico(double precioBase, double peso, char consu, String colo) {
		this.precioBase=precioBase;
		this.peso=peso;
		//Aplicamos metodo comprobar consumo si es false consumo por defecto

		if(comprobarConsumoEnergetico(consu)==true) {
			consumo=consu;
		}
		else {
			consumo='F';
		}
		//Aplicamos metodo comprobar color si es false color por defecto
		if(comprobarColor(colo)==true) {
			color=colo;
		}
		else {
			color="Blanco";
		}
	
	}
	
	//GETTERS
	
	public double getPrecioBase() {
		return precioBase;
	}
	
	public double getPeso() {
		return peso;
	}
	
	public String getColor() {
		return color;
	}
	
	
	/**
	 * comprovamos que la letra es correcta se encuentra entre A y F
	 * @param letra
	 * @return
	 */
	public boolean comprobarConsumoEnergetico(char letra) {
		boolean correcta;
		if((letra>='A')&&(letra<='F')) {
			correcta=true;
		}
		else {
			correcta=false;
		}
		return correcta;
	}
	
	/**
	 * Metodo que permite saber si el color se encuentra entre los disponibles
	 * @param col
	 * @return
	 */
	public boolean comprobarColor(String col) {
		String[] c= {"negro", "blanco", "rojo", "azul", "gris"}; //Posibles colores
		boolean trobat=false;
		int i=0;
		while((i<5)&&(trobat==false)) {
			if(col.equalsIgnoreCase(c[i])==true) {
				trobat=true;
			}
			i++;
		}
		return trobat;
		
	}
	
	/**
	 * Dependiendo del peso ehay un precio u otro
	 * @param peso
	 * @return precio de intervalos de peso
	 */
	public double precioTamaño() {
		double preciot=0;
		if((peso>=0)&&(peso<=19)) {
			preciot=10;
		}
		else {
			if((peso>=20)&&(peso<=49)) {
				preciot=50;
			}
			else {
				if((peso>=50)&&(peso<=79)) {
					preciot=80;
				}
				else {
					if(peso>=80) {
						preciot=100;
					}
				}
			}
		}
		return preciot;
	}
	
	/**
	 * Dependiendo de la letra de consumo hay un precio u otro
	 * @return precio de letra de consumo seleccionada
	 */
	public double precioLetra() {
		double preciol=0;
		if(consumo=='A') {
			preciol=100;
		}
		else {
			if(consumo=='B') {
				preciol=80;
			}
			else {
				if(consumo=='C') {
					preciol=60;
				}
				else {
					if(consumo=='D') {
						preciol=50;
					}
					else {
						if(consumo=='E') {
							preciol=30;
						}
						else {
							if(consumo=='F') {
								preciol=10;
							}
						}
					}
				}
			}
		}
		return preciol;
	}
	
	/**
	 * Precio final dependiendo de tamaño, consumo y precio inicial
	 * @return precio final
	 */
	public double precioFinal() {
		double total;
		total=precioBase+precioLetra()+precioTamaño();
		return total;
		
	}
	

}
