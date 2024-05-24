package model;

public class Attack {
    private String name;
    private String attackType;
    private int damagePoints;

    // Constructor
    public Attack(String name, String attackType, int damagePoints) {
        this.name = name;
        this.attackType = attackType;
        this.damagePoints = damagePoints;
    }

}