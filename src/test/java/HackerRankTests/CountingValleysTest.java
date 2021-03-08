package HackerRankTests;

import HackerrankEasy.CountingValleys;
import org.junit.Assert;
import org.junit.Test;

public class CountingValleysTest {
    CountingValleys c = new CountingValleys();

    @Test
    public void countingValleysTest(){
        //given
        int testSteps = 8;
        String testPath = "UDDDUDUU";
        int expected = 1;
        //when
        int actual = c.countingValleys(testSteps, testPath);
        //then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void countingValleysTest2(){
        //given
        int testSteps = 12;
        String testPath = "DDUUDDUDUUUD";
        int expected = 2;
        //when
        int actual = c.countingValleys(testSteps, testPath);
        //then
        Assert.assertEquals(expected, actual);
    }
}
