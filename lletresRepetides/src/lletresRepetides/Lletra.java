package lletresRepetides;

public class Lletra {
	char caracter;
	int vegades;
	public Lletra(char lletra){
		caracter=lletra;
		vegades=1;
	}
	public char getCaracter() {
		return caracter;
	}
	public int getVegades() {
		return vegades;
	}
	public void sumaVegades() {
		this.vegades++;
	}
	@Override
	public String toString() {
		return "Lletra [caracter=" + caracter + ", vegades=" + vegades + "]";
	}
	
	
}
