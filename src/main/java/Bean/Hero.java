package Bean;

public class Hero {
    private int id;
    private String name;
    private float hp;
    private int damage;

    public Hero(int id, String name, float hp, int damage) {
        this.id = id;
        this.name = name;
        this.hp = hp;
        this.damage = damage;
    }

    public Hero() {
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

    public float getHp() {
        return hp;
    }

    public void setHp(float hp) {
        this.hp = hp;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public boolean isEqual(Hero hero)
    {
        return this.name.equals(hero.name);
    }
}
