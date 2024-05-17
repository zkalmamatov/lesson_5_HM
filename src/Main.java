

public class Main {
    public static void main(String[] args) {

        Boss Butcher = new Boss();
        Butcher.setHealth(700);
        Butcher.setDamage(50);
        Butcher.setDefense("Druid");
        System.out.println("Butcher: " + "HP-" + Butcher.getHealth() + " damage-" + Butcher.getDamage() +
                " defense-" + Butcher.getDefense());

        System.out.println();
        Hero[] ourHeroes = createHeroes();
        System.out.println();

        for (Hero hero : ourHeroes) {
            System.out.println(" HP: " + hero.getHealth() + " damage: "
                    + hero.getDamage() + " spells: " + hero.getSpells());
        }


    }

    public static Hero[] createHeroes() {
        Hero Magical = new Hero(200, 30, "Freeze");
        Hero Physical = new Hero(250, 35);
        Hero Druid = new Hero(180, 15, "Fire");

        Hero[] ourHeroes = new Hero[]{Magical, Physical, Druid};
        System.out.println("Heroes is create");
        return ourHeroes;


    }


}