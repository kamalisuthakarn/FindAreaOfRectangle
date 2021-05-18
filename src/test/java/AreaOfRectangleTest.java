import org.junit.jupiter.api.Test;
import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.core.Is.is;
class AreaOfRectangleTest {
    @Test
    void ReturnAreaAs_10_WhenLength_5_Breadth_2() {
        Rectangle rectangle=new Rectangle();
        double area = rectangle.areaOfRectangle(5,2);
        assertThat(area,is(10));
    }
}