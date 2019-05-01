package other;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class AnagramCheckTest {

    @Test
    public void iAnagram() {

        assertTrue(AnagramCheck.iAnagram("rare", "rrea"));
        assertFalse(AnagramCheck.iAnagram("play", "pley"));
        assertTrue(AnagramCheck.iAnagram("hi", "ih"));
    }

    @Test
    public void checkAnagram() {
        assertTrue(AnagramCheck.checkAnagram("rare", "rrea"));
        assertFalse(AnagramCheck.checkAnagram("play", "pley"));
        assertTrue(AnagramCheck.checkAnagram("hi", "ih"));
        assertTrue(AnagramCheck.checkAnagram("word", "wrdo"));
        assertFalse(AnagramCheck.checkAnagram("b", "bbb"));
        assertFalse(AnagramCheck.checkAnagram("ccc", "ccccccc"));
        assertTrue(AnagramCheck.checkAnagram("a", "a"));
        assertFalse(AnagramCheck.checkAnagram("sleep", "slep"));
        assertTrue(AnagramCheck.checkAnagram("boat", "btoa"));
        assertFalse(AnagramCheck.checkAnagram("pure", "in"));
        assertFalse(AnagramCheck.checkAnagram("fill", "fil"));
    }

}