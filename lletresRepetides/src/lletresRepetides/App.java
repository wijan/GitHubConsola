package lletresRepetides;
import java.util.*;
public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner llegir=new Scanner(System.in);
		System.out.println("Escriu una frase i el programa contarà cuantes"
				+ " de cada una de les lletres hi ha:");
		String frase=llegir.nextLine();
		LlistaParaules llista=new LlistaParaules(frase);
		llista.treureIComptarLletres();
		System.out.println(LlistaLletres.getLlistaLletres());
	}
}
