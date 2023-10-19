import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class EXP1Test {

    @Test
    public void testReverse() {
        EXP1 exp1 = new EXP1();

        // Test with a simple word
        String reversedWord = exp1.reverse("hello");
        assertEquals("olleh", reversedWord);

        // Test with an empty string
        reversedWord = exp1.reverse("");
        assertEquals("", reversedWord);

        // Test with a single-character word
        reversedWord = exp1.reverse("a");
        assertEquals("a", reversedWord);
    }
}
