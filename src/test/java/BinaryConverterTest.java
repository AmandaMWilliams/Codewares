import org.junit.Assert;
import org.junit.Test;

public class BinaryConverterTest {
    @Test
    public void binaryConverterTest() {
        //given
        int given = 7;
        String expected = "111";
        //when
        String actual = BinaryConverter.Converter.toBinary(given);
        //then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void binaryConverterTest2() {
        //given
        int given = 114;
        String expected = "1110010";
        //when
        String actual = BinaryConverter.Converter.toBinary(given);
        //then
        Assert.assertEquals(expected, actual);
    }
}
