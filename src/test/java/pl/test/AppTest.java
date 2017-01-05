package pl.test;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

import java.util.List;

import static org.junit.Assert.assertTrue;

/**
 * Unit test for simple App.
 */
public class AppTest {
    @org.junit.Test
    public void dividedBy10() {
        //given
        int number = 10;
        //when
        List<Factors> factors = Math.getFactors(10);

        //then
        assertTrue();
    }
}