package se.bocheng.device;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SmokeTest {
    @Test
    void testTemp() {
        boolean expected = true;
        boolean actual = ((1 + 1) == 2 );
        assertEquals(expected, actual);
    }
}
