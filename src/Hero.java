public class Hero {

    private int health;
    private int damage;
    private String spells;


    public Hero(int health, int damage, String spells) {
        this.health = health;
        this.damage = damage;
        this.spells = spells;
    }

    public Hero(int health, int damage) {
        this.health = health;
        this.damage = damage;

    }

//    public void heroAttack() {
//        System.out.println("Hero attack!");
//
//    }


    public int getHealth() {
        return health;
    }

    public int getDamage() {
        return damage;
    }

    public String getSpells() {
        return spells;
    }


}
