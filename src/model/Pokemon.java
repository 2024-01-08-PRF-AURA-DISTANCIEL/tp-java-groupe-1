package model;

public class Pokemon {
    private int id;
    private String name;
    private int level;
    private int xp;
    private int hp;
    private int maxHp;

    public Pokemon(int id, String name, int level, int xp, int hp, int maxHp) {
        this.id = id;
        this.name = name;
        this.level = level;
        this.xp = xp;
        this.hp = hp;
        this.maxHp = maxHp;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getXp() {
        return xp;
    }

    public void gainXp(int xp) {
        this.xp += xp;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getMaxHp() {
        return maxHp;
    }

    public void setMaxHp(int maxHp) {
        this.maxHp = maxHp;
    }

    public void receiveDamage(int damage) {
        this.hp -= damage;
        if (this.hp <= 0) {
            this.hp = 0;
        }
    }
}
