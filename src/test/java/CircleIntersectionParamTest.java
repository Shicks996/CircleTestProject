import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CircleIntersectionParamTest {

    @ParameterizedTest
    @CsvSource({
            "0,2,0,2,-1",     // совпадают
            "0,2,4,2,1",      // внешнее касание
            "0,4,2,2,1",      // внутреннее касание
            "0,3,4,3,2",      // пересекаются
            "0,2,10,2,0",     // не пересекаются (далеко)
            "0,5,1,1,0"       // одна внутри другой
    })
    void testCircleIntersections(int x1, int r1, int x2, int r2, int expected) {
        assertEquals(expected, CircleIntersection.getCommonPointsCount(x1, r1, x2, r2));
    }
}