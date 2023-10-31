public class Main {
    public static void main(String[] args) {
        Character bigWarrior = CharacterFactory.createCharacter(Characters.MAGE, "John", 100);

        bigWarrior.attack();
    }
}