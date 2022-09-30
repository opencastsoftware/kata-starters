package kata;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import java.util.HashMap;

class KataTest {
    @Test
    void incrementAddsOne() {
        Kata kata = new Kata();
        assertEquals(kata.increment(1), 2);
    }

    @Test
    void returnEmptyString(){
        Kata kata = new Kata();
        HashMap<String, String> map = new HashMap<>();
        String empty = "";
        assertEquals("", kata.interpolate(empty, map));

    }

    @Test
    void returnStringEmptyMap(){
        Kata kata = new Kata();
        HashMap<String, String> map = new HashMap<>();
        String empty = "$temp$";
        assertEquals("$temp$", kata.interpolate(empty, map));

    }

    @Test
    void returnStringPopulatedMap(){
        Kata kata = new Kata();
        HashMap<String, String> map = new HashMap<>();
        map.put("temp", "temporary");
        String empty = "$temp$";
        assertEquals("temporary", kata.interpolate(empty, map));

    }

    @Test
    void returnStringSentencePopulatedMap(){
        Kata kata = new Kata();
        HashMap<String, String> map = new HashMap<>();
        map.put("temp", "temporary");
        map.put("name", "John Doe");
        String str = "$temp$ here comes the name $name$";
        assertEquals("temporary here comes the name John Doe", kata.interpolate(str, map));

    }
}
