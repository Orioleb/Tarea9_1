
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Electrodomestico[] llista;
		llista=new Electrodomestico[10];
		
		Lavadora l1=new Lavadora();
		llista[0]=l1;
		Lavadora l2=new Lavadora(30,50);
		llista[1]=l2;
		Lavadora l3=new Lavadora(40,20,'B',"Negro",40);
		llista[2]=l3;
		Lavadora l4=new Lavadora(20,80,'D',"Marron",20);
		llista[3]=l4;
		Lavadora l5=new Lavadora(50,20);
		llista[4]=l5;
		Television t1=new Television();
		llista[5]=t1;
		Television t2=new Television(35,60);
		llista[6]=t2;
		Television t3=new Television(25,70,'C',"Azul",50,true);
		llista[7]=t3;
		Television t4=new Television(60,70,'A',"Gris",20,false);
		llista[8]=t4;
		Television t5=new Television(70,100,'A',"Negro",60,true);
		llista[9]=t5;
		String taux="";
		String laux="";
		double p=0; //precio final electrodomesticos
		double t=0;//precio final televisiones
		double l=0; //precio final lavadoras
		for(int i=0;i<10;i++) {
			if(llista[i] instanceof Television) {
				taux=taux+" "+Double.toString(llista[i].precioFinal());
				t=t+llista[i].precioFinal();
			}
			else {
				laux=laux+" "+Double.toString(llista[i].precioFinal());
				l=l+llista[i].precioFinal();
			}
			p=p+llista[i].precioFinal();
		}
		String efinal=Double.toString(p);
		String tfinal=Double.toString(t);
		String lfinal=Double.toString(l);
		System.out.println("Televisiones-> "+taux+" total TV="+tfinal+" Lavadoras-> "+laux+" total Lavadoras="+lfinal+" Electrodomesticos(total)= "+efinal);

	}
	


}
