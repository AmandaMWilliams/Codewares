import org.junit.Assert;
import org.junit.Test;

public class BubbleSortTest {
    BubbleSort b = new BubbleSort();

    @Test
    public void bubbleSortTest(){
        //given
        int[] testArray = {64,34,25,12,22,11,90};
        int[] expectedArray = {11,12,22,25,34,64,90};
        //when
        b.bubbleSort(testArray);
        //then

    }
}
