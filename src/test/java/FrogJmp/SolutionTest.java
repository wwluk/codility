package FrogJmp;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
    Solution solution = new Solution();

    @Test
    public void testSamePosition() throws Exception {
        assertEquals(0, solution.solution(1, 1, 1));
    }

    @Test
    public void testOneStep() {
        assertEquals(1, solution.solution(1, 2, 1));
    }

    @Test
    public void testLongerStep() {
        assertEquals(1, solution.solution(1, 3, 2));
    }

    @Test
    public void testGreater() {
        assertEquals(1, solution.solution(1, 3, 3));
    }

    @Test
    public void testMoreThanOneStepNeeded() {
        assertEquals(3, solution.solution(5, 35, 10));
    }

    @Test
    public void testMoreThanOneStepNeededGreater() {
        assertEquals(3, solution.solution(5, 33, 10));
    }

    @Test
    public void testFromAssignment() {
        assertEquals(3, solution.solution(10, 85, 30));
    }

}