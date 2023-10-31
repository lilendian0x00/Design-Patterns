import java.util.HashMap;

public class CharacterFactory {
    static Character createCharacter(Characters character_type, String name, Integer level) {
        Character character = null;
        switch (character_type) {
            case Characters.WARRIOR -> character = new Warrior(name, level);
            case Characters.MAGE -> character = new Mage(name, level);
            case Characters.ROGUE-> character = new Rogue(name, level);
        }

        return character;

    }
}
