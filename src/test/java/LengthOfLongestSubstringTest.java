import org.junit.Assert;
import org.junit.Test;

public class LengthOfLongestSubstringTest {

    @Test
    public void lengthOfLongestSubstringTest(){
        //given
        String s = "abcabcbb";
        int expected = 3;
        //when
        int actual = LengthOfLongestSubstring.lengthOfLongestSubstring(s);
        //then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void lengthOfLongestSubstringTest2(){
        //given
        String s = " ";
        int expected = 1;
        //when
        int actual = LengthOfLongestSubstring.lengthOfLongestSubstring(s);
        //then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void lengthOfLongestSubstringTest3(){
        //given
        String s = "au";
        int expected = 2;
        //when
        int actual = LengthOfLongestSubstring.lengthOfLongestSubstring(s);
        //then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void lengthOfLongestSubstringTest4(){
        //given
        String s = "";
        int expected = 0;
        //when
        int actual = LengthOfLongestSubstring.lengthOfLongestSubstring(s);
        //then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void lengthOfLongestSubstringTest5(){
        //given
        String s = "aab";
        int expected = 2;
        //when
        int actual = LengthOfLongestSubstring.lengthOfLongestSubstring(s);
        //then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void lengthOfLongestSubstringTest6(){
        //given
        String s = "dbdf";
        int expected = 3;
        //when
        int actual = LengthOfLongestSubstring.lengthOfLongestSubstring(s);
        //then
        Assert.assertEquals(expected, actual);
    }
}
