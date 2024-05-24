package model;

public abstract class Chenipan extends Specie {
	public Chenipan(String speciesName, String type, double lifeInit, double atkInit) {
		this.speciesName = chenipan;
		this.type = bug;
		this.lifeInit = 10;
		this.atkInit = 2;
		}
	
	public void trip(Where Place) {
		System.out.println("Le pokemon : " + this.nom + " se promene au : " + Place);
		if (Place == "Jungle") {
			System.out.println("Le pokemon : " + this.nom + "apprecie la promenade !");
			//getExp ici
		}
	}
}
