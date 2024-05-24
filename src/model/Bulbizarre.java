package model;

public class Bulbizarre extends Specie {
	public Bulbizarre(int id, String name, String speciesName, String type, double lifeInit, double atkInit, int maxHp, Attack attack) {
		super(id, name, speciesName, type, (int) lifeInit, 0, maxHp, attack);
	}

	@Override
	public void trip(String place) {
		System.out.println("Le Pokémon : " + getName() + " se promène au : " + place);
		if (place.equals("Jardin")) {
			System.out.println("Le Pokémon : " + getName() + " apprécie la promenade !");
			gainXp(2);
		}
	}
}
