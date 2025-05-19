import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CircleIntersectionTest {

    @Test
    public void testSameCircles() {
        assertEquals(-1, CircleIntersection.getCommonPointsCount(0, 2, 0, 2));
    }

    @Test
    public void testTouchExternally() {
        assertEquals(1, CircleIntersection.getCommonPointsCount(0, 2, 4, 2));
    }

    @Test
    public void testTouchInternally() {
        assertEquals(1, CircleIntersection.getCommonPointsCount(0, 4, 2, 2));
    }

    @Test
    public void testIntersectTwoPoints() {
        assertEquals(2, CircleIntersection.getCommonPointsCount(0, 3, 4, 3));
    }

    @Test
    public void testNoIntersectionFar() {
        assertEquals(0, CircleIntersection.getCommonPointsCount(0, 2, 10, 2));
    }

    @Test
    public void testNoIntersectionInside() {
        assertEquals(0, CircleIntersection.getCommonPointsCount(0, 5, 1, 1));
    }
}