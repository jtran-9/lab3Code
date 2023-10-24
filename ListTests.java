import static org.junit.Assert.*;
import org.junit.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListTests {
    @Test
    public void testFilter() {

    }

    @Test
    public void testMerge() {
        List<String> input1 = new ArrayList<>(Arrays.asList("a", "bad", "sleep", "yawn"));
        List<String> input2 = new ArrayList<>(Arrays.asList("close", "door", "run", "zoom"));

        assertEquals(new ArrayList<String>(Arrays.asList("a", "bad", "close", "door", "run", "sleep", "yawn", "zoom")), ListExamples.merge(input1, input2));
    }
}