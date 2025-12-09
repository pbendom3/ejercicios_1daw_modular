package org.example;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class ValidarTest {

    @Test
    void suma_3() {

//        assertAll(
//                () -> assertEquals(15,Validar.suma_3(8,6,2)),
//                () -> assertEquals(-11,Validar.suma_3(-8,-6,2))
//        );

        assertEquals(16,Validar.suma_3(8,6,2));
        assertEquals(-12,Validar.suma_3(-8,-6,2));

    }

    @Test
    void validar_positivo() {

        assertTrue(Validar.validar_positivo(17));
        assertFalse(Validar.validar_positivo(-9));
        assertTrue(Validar.validar_positivo(0));

    }

    @Test
    void cadena() {

        String entradaSimulada = "alessandra";
        System.setIn(new ByteArrayInputStream(entradaSimulada.getBytes()));

        ByteArrayOutputStream salida = new ByteArrayOutputStream();
        System.setOut(new PrintStream(salida));

        Validar.cadena();

        String salidaEsperada = "Hola alessandra";

        assertTrue(salida.toString().contains(salidaEsperada));

    }
}