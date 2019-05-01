package other;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StringManipulationTest {

    @Test
    public void countOccurrencesOfSubstring() {
        assertEquals(StringManipulation.countOccurrencesOfSubstring("hh1", "1"), 1);
        assertEquals(StringManipulation.countOccurrencesOfSubstring("1", "1"), 1);
        assertEquals(StringManipulation.countOccurrencesOfSubstring("hh", "0"), 0);

    }
}