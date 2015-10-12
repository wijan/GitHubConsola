package lletresRepetides;
import java.util.*;
public class LlistaParaules {
	String[]arrayParaules;
	public LlistaParaules(String frase){
		arrayParaules=frase.split(" ");
	}
	void treureIComptarLletres(){
		LlistaLletres llista=new LlistaLletres();
		System.out.println("Treure i comptar lletres");
		for(int i=0;i<arrayParaules.length;i++){
			System.out.println("Primer for");
			for(int j=0;j<arrayParaules[i].length();j++){
				System.out.println("Segon for");
				char caracter=arrayParaules[i].charAt(j);
				if(!HiEs(caracter, llista)){
					Lletra lletra=new Lletra(caracter);
					llista.afegirLletra(lletra);
					System.out.println("Afegida la lletra: "+caracter+".");
				}
				else{
					int posicio=llista.posicioLletra(caracter);
					llista.incrementaVegades(posicio);
				}
			}
		}
	}
	boolean HiEs(char caracter, LlistaLletres llista){
		System.out.println("Hi es");
		boolean b=true;
		if(llista.posicioLletra(caracter)==-1){
			b=false;
		}
	return b;
	}
	public String[] getArrayParaules() {
		return arrayParaules;
	}
	
	
}
