package fr.aminamsy;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SampleTest {

    @Test
    void op() {
        assertEquals(20, new Sample().op(Sample.Operation.ADD, 2, 18));
        assertEquals(10, new Sample().op(Sample.Operation.MULT, 2, 5));
    }

    @Test
    void fact() {
        assertEquals(120, new Sample().fact(5));
        assertEquals(720, new Sample().fact(6));
    }
}