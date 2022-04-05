package kata;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class KataTest {
    @Test
    void incrementAddsOne() {
        var kata = new Kata();
        assertEquals(kata.increment(1), 2);
    }
}
