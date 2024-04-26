import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class PrimeFactorTest {
    PrimeFactor primeFactor;

    @BeforeEach
    void setUp() {
        primeFactor = new PrimeFactor();
    }

    @Test
    void test1() {
        assertEquals(Arrays.asList(), primeFactor.of(1));
    }

    @Test
    void test2() {
        assertEquals(Arrays.asList(2), primeFactor.of(2));
    }

    @Test
    void test3() {
        assertEquals(Arrays.asList(3), primeFactor.of(3));
    }

    @Test
    void test4() {
        assertEquals(Arrays.asList(2,2), primeFactor.of(4));
    }

    @Test
    void test6() {
        assertEquals(Arrays.asList(2,3), primeFactor.of(6));
    }
}