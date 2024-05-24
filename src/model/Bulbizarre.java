package model;

public abstract class Bulbizarre extends Specie {
	public Bulbizarre(String speciesName, String type, double lifeInit, double atkInit) {
		this.speciesName = bulbizarre;
		this.type = grass;
		this.lifeInit = 17;
		this.atkInit = 5;
		}
	
	public void trip(Where Place) {
		System.out.println("Le pokemon : " + this.nom + " se promene au : " + Place);
		if (Place == "Jardin") {
			System.out.println("Le pokemon : " + this.nom + "apprecie la promenade !");
			//getExp ici
		}
	}
}
