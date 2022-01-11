package day02;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MathAlgorithmTest {

    @Test
    void testGreatestCommonDivisor() {
        assertEquals(6, MathAlgorithm.greatestCommonDivisor(12, 18));
        assertEquals(8, MathAlgorithm.greatestCommonDivisor(16, 24));
        assertEquals(1, MathAlgorithm.greatestCommonDivisor(15, 16));
    }

}