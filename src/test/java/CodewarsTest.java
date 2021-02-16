import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CodewarsTest {
        @Test
        public void testSolution() {
            assertEquals("############5616", Codewars.maskify("4556364607935616"));
            assertEquals("#######5616",      Codewars.maskify(     "64607935616"));
            assertEquals("1",                Codewars.maskify(               "1"));
            assertEquals("",                 Codewars.maskify(                ""));

            // "What was the name of your first pet?"
            assertEquals("##ippy",                                    Codewars.maskify("Skippy")                                  );
            assertEquals("####################################man!",  Codewars.maskify("Nananananananananananananananana Batman!"));
        }
    }
