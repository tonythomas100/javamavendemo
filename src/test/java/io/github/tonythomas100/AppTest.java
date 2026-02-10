package io.github.tonythomas100;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @Test
    void testAdd() {
        assertEquals(9, App.add(2, 3, 4));
    }
}
