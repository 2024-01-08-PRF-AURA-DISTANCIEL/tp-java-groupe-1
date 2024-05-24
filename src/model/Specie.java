package model;

public abstract class Specie extends Pokemon {
    protected String speciesName;
    protected String type;
    protected int initialHp;
    protected int initialXp;

    public Specie(int id, String name, String speciesName, String type, int initialHp, int initialXp, int maxHp, Attack attack) {

        super(id, name, 1, 0, 1, 100);

        this.speciesName = speciesName;
        this.type = type;
        this.initialHp = initialHp;
        this.initialXp = initialXp;
    }

    public abstract void trip(String place);

}
