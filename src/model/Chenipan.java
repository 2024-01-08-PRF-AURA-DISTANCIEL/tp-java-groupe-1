package model;

public class Chenipan extends Specie {
	public Chenipan(int id, String name, String speciesName, String type, double lifeInit, double atkInit, int maxHp, Attack attack) {
		super(id, name, speciesName, type, (int) lifeInit, 0, maxHp, attack);
	}

	@Override
	public void trip(String place) {
		System.out.println("Le Pokémon : " + getName() + " se promène au : " + place);
		if (place.equals("Foret")) {
			System.out.println("Le Pokémon : " + getName() + " apprécie la promenade !");
			gainXp(2);
		}
	}
}
