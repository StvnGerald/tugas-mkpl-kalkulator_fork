package com.simpel.kalkulator;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class KalkulatorTest {

    @Test
    void testTambah() {
        Kalkulator k = new Kalkulator();
        assertEquals(5, k.tambah(2, 3));
    }

    @Test
    void testKurang() {
        Kalkulator k = new Kalkulator();
        assertEquals(2, k.kurang(5, 3));
    }

    @Test
    void testKali() {
        Kalkulator k = new Kalkulator();
        assertEquals(6, k.kali(2, 3));
    }

    @Test
    void testBagi() {
        Kalkulator k = new Kalkulator();
        assertEquals(2, k.bagi(6, 3));
    }
    
    @Test
    void testMod() {
        Kalkulator k = new Kalkulator();
        assertEquals(2, k.modulo(5, 3));
    }
}