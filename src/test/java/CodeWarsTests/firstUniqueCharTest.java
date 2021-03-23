package CodeWarsTests;

import Medium.FirstUniqueChar;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class firstUniqueCharTest {

    @Test
    public void test1() {
        assertEquals(4, FirstUniqueChar.firstUniqChar("ababc"));
    }
    @Test
    public void test2() {
        assertEquals(0, FirstUniqueChar.firstUniqChar("z"));
    }
    @Test
    public void test3() {
        assertEquals(-1, FirstUniqueChar.firstUniqChar("ababcc"));
    }
}

