package HackerRankTests;

import HackerrankEasy.SalesByMatch;
import org.junit.Assert;
import org.junit.Test;

public class SalesByMatchTest {

    SalesByMatch s = new SalesByMatch();

    @Test
    public void sockMerchantTest(){
        //given
        int testNumberOfSocks = 10;
        int[] testColorsOfSocks = {1,1,3,1,2,1,3,3,3,3};
        int expected = 4;
        //when
        int actual = s.sockMerchant(testNumberOfSocks, testColorsOfSocks);
        // then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void sockMerchantTest2(){
        //given
        int testNumberOfSocks = 9;
        int[] testColorsOfSocks = {10,20,20,10,10,30,50,10,20};
        int expected = 3;
        //when
        int actual = s.sockMerchant(testNumberOfSocks, testColorsOfSocks);
        // then
        Assert.assertEquals(expected, actual);
    }
}
