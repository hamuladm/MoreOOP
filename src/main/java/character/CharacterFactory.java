package character;

import java.util.Set;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.lang.reflect.Constructor;
import org.reflections.Reflections;

public class CharacterFactory {
    public character.Character createCharacter() {
        Reflections reflection = new Reflections("character");
        Set<Class<? extends character.Character>> charSubTypes = reflection.getSubTypesOf(character.Character.class);
        List<Class<? extends character.Character>> charSubTypesList = new ArrayList<>(charSubTypes);

        Random random = new Random();
        int idx = random.nextInt(charSubTypes.size());
        Class<? extends character.Character> randomClass = charSubTypesList.get(idx);

        try {
            Constructor<? extends character.Character> constructor = randomClass.getDeclaredConstructor();
            character.Character product = constructor.newInstance();
            return product;
        }
        catch (Exception e) {
            return null;
        }
    }
}