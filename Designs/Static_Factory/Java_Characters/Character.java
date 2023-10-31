public abstract class Character {
    String name;
    Integer level;

    abstract void attack();
}

enum Characters {
    WARRIOR,
    MAGE,
    ROGUE
}


class Warrior extends Character {
    public Warrior(String name, Integer level) {
        this.name = name;
        this.level = level;
    }
    @Override
    void attack() {
        System.out.printf("Warrior::%s (level %d) is attacking!\n", this.name, this.level);
    }
}

class Mage extends Character {
    public Mage(String name, Integer level) {
        this.name = name;
        this.level = level;
    }
    @Override
    void attack() {
        System.out.printf("Mage::%s (level %d) is attacking!\n", this.name, this.level);
    }
}

class Rogue extends Character {
    public Rogue(String name, Integer level) {
        this.name = name;
        this.level = level;
    }
    @Override
    void attack() {
        System.out.printf("Rogue::%s (level %d) is attacking!\n", this.name, this.level);
    }
}