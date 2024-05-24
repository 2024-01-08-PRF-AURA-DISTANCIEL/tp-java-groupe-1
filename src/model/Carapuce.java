package model;

public abstract class Carapuce extends Specie {
	public Carapuce(String speciesName, String type, double lifeInit, double atkInit) {
		this.speciesName = carapuce;
		this.type = water;
		this.lifeInit = 20;
		this.atkInit = 3;
		}
	
	public void trip(Where Place) {
		System.out.println("Le pokemon : " + this.nom + " se promene au : " + Place);
		if (Place == "Plage") {
			System.out.println("Le pokemon : " + this.nom + "apprecie la promenade !");
			//getExp ici
		}
	}
}
