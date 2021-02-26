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
}
