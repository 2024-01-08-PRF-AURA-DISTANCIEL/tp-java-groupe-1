package model;

public abstract class Roucool extends Specie {
	public Roucool(String speciesName, String type, double lifeInit, double atkInit) {
		this.speciesName = roucool;
		this.type = flying;
		this.lifeInit = 12;
		this.atkInit = 8;
		}
	
	public void trip(Where Place) {
		System.out.println("Le pokemon : " + this.nom + " se promene au : " + Place);
		if (Place == "Desert") {
			System.out.println("Le pokemon : " + this.nom + "apprecie la promenade !");
			//getExp ici
		}
	}
}
