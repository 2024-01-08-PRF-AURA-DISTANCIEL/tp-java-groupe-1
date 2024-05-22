package model;

public class Attack {
// cretion class Attack
    private String name;
    private String attackType;
    private int damagePoints;

    // Constructeur du attack
    public Attack(String name, String attackType, int damagePoints) {
        this.name = name;
        this.attackType = attackType;
        this.damagePoints = damagePoints;
    }

}