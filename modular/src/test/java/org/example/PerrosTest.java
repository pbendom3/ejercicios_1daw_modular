package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PerrosTest {

    @Test
    void edad_humana() {

        assertAll(
                () -> assertEquals(30, Perros.edad_humana(5)),
                () -> assertEquals(21, Perros.edad_humana(4))
        );

    }

}