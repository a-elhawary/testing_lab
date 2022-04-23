import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class ForcesTest{
    @Test
    public void TestPositive(){
        int forces[][] = {
                {2 , 3 , 4},
                {5 , 12, 3},
                {1, 0, 3},
                {5 , 12, 3},
        };
        assertEquals("NO", Forces.solution(forces));
    }

    @Test
    public void TestNegative(){
        int forces[][] = {
                {-2 , -3 , -4},
                {-5 , -12, -3},
                {-1, 0, -3},
                {-2 , -3 , -4},
                {-5 , -12, -3},
        };
        assertEquals("NO", Forces.solution(forces));
    }

    @Test
    public void TestZeros(){
        int forces[][] = {
                {0, 0, 0},
                {0, 0, 0},
                {0, 0, 0}
        };
        assertEquals("YES", Forces.solution(forces));
    }

    @Test
    public void TestOnlyXEquilibrium(){
        int forces[][] = {
                {-1, 3, 12},
                {2, 4, -1},
                {-1, -3, 2}
        };
        assertEquals("NO", Forces.solution(forces));
    }

    @Test
    public void TestOnlyYEquilibrium(){
        int forces[][] = {
                {30, -1, 12},
                {-8, 2, -1},
                {2, -1, 2},
                {-8, 2, -1},
                {2, -2, 2}
        };
        assertEquals("NO", Forces.solution(forces));
    }

    @Test
    public void TestOnlyZEquilibrium(){
        int forces[][] = {
                {5, 4, -1},
                {3, 2, 2},
                {12, 2, -1}
        };
        assertEquals("NO", Forces.solution(forces));
    }

    @Test
    public void TestEquilibrium(){
        int forces[][] = {
                {7, 12, -1},
                {-4, -6, 2},
                {-3, -6, -1}
        };
        assertEquals("YES", Forces.solution(forces));
    }
}