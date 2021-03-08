package HackerRankTests;

import HackerrankEasy.JumpingOnClouds;
import org.junit.Assert;
import org.junit.Test;

public class JumpingOnCloudsTest {
    JumpingOnClouds j = new JumpingOnClouds();

    @Test
    public void jumpingOnCloudsTest(){
        //given
        int[] testArray = {0,0,1,0,0,1,0};
        int expected = 4;
        //when
        int actual = j.jumpingOnClouds(testArray);
        //then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void jumpingOnCloudsTest2(){
        //given
        int[] testArray = {0,0,0,1,0,0};
        int expected = 3;
        //when
        int actual = j.jumpingOnClouds(testArray);
        //then
        Assert.assertEquals(expected, actual);
    }
}
