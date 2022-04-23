import org.junit.Test;
import static junit.framework.Assert.assertEquals;

public class WatermelonTest {
    @Test
    public void TestCaseEven(){
        assertEquals("YES", Watermelon.solution(8));
    }

    @Test
    public void TestCaseOdd(){
        assertEquals("NO", Watermelon.solution(5));
    }

    @Test
    public void TestCase2(){
        assertEquals("NO", Watermelon.solution(2));
    }
}