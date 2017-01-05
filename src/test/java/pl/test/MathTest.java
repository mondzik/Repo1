package pl.test;

import java.util.List;

import static org.junit.Assert.assertEquals;

/**
 * Created by Pawel Pawluczuk on 05/01/2017.
 */
public class MathTest {
    @org.junit.Test
    public void getFactors_simple() {
        List<Factors> factors = Math.getFactors(10);

        assertEquals(factors.size(), 4);
        assertEquals(factors.get(0).getX(),1);
        assertEquals(factors.get(0).getY(), 10);

        assertEquals(factors.get(3).getX(),10);
        assertEquals(factors.get(3).getY(), 1);

    }
}
