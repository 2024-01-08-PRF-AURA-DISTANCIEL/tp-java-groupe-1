package model;

public abstract class Specie extends Pokemon {
	public Specie(String speciesName, String type, double lifeInit, double atkInit) {
		this.speciesName = speciesName;
		this.type = type;
		this.lifeInit = lifeInit;
		this.atkInit = atkInit;
		}
	public abstract void trip(Where Place);
}
