package lletresRepetides;
import java.util.*;
public class LlistaLletres {
	static List<Lletra>llistaLletres=new ArrayList<Lletra>();
	public LlistaLletres(){
	}
	public static void afegirLletra(Lletra lletra){
		llistaLletres.add(lletra);
	}
	public static int posicioLletra(char caracter){
		System.out.println("Posicio lletra");
		int posicio=0;
		boolean trobat=false;
		while(!trobat&&posicio<llistaLletres.size()){
			if(llistaLletres.get(posicio).getCaracter()==caracter){
				trobat=true;
			}
			else{
				posicio++;
			}
		}
		if(!trobat){
			posicio=-1;
		}
		return posicio;
	}
	public static void incrementaVegades(int posicio){
		System.out.println("Incrementa vegades");
		llistaLletres.get(posicio).sumaVegades();
	}
	public static List<Lletra> getLlistaLletres() {
		return llistaLletres;
	}
	@Override
	public String toString() {
		return "LlistaLletres []";
	}
	
}
