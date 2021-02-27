import Easy.Grasshopper;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GrasshopperTest {
    @Test
    public void test1() {
        assertEquals(1,
                Grasshopper.summation(1));
    }
    @Test
    public void test2() {
        assertEquals(36,
                Grasshopper.summation(8));
    }
}
