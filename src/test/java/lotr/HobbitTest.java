package Lab_4;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class HobbitTest {
    private Hobbit character;

    @BeforeEach
    public void init() {
        character = new Hobbit();
    }

    @Test
    public void testToString() {
        assertEquals("Hobbit{hp=3, power=0}", character.toString());
    }

    @Test
    public void testIsClass() {
        assertNotNull(character);
    }

    @Test
    public void testSetHp() {
        character.setHp(-100);
        assertEquals(0, character.getHp());
    }
}