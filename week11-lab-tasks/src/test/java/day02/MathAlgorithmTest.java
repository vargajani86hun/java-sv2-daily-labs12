package day02;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MathAlgorithmTest {

    @Test
    void testGreatestCommonDivisor() {
        assertEquals(6, MathAlgorithm.getGreatestCommonDivisorOf(12, 18));
        assertEquals(8, MathAlgorithm.getGreatestCommonDivisorOf(16, 24));
        assertEquals(12, MathAlgorithm.getGreatestCommonDivisorOf(12, 24));
        assertEquals(1, MathAlgorithm.getGreatestCommonDivisorOf(15, 16));
    }

}