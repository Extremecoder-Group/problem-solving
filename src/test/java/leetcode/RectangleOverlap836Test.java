package leetcode;

import com.extremecoder.leetcode.RectangleOverlap836;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RectangleOverlap836Test {

    @Test
    public void checked_With_valid_Input_I() {

        RectangleOverlap836 obj = new RectangleOverlap836();
        int[] rec1 = {0, 0, 2, 2};
        int[] rec2 = {1, 1, 3, 3};
        Assertions.assertEquals(true, obj.isRectangleOverlap(rec1, rec2));
    }

    @Test
    public void checked_With_valid_Input_II() {
        RectangleOverlap836 obj = new RectangleOverlap836();
        int[] rec1 = {0, 0, 1, 1};
        int[] rec2 = {1, 0, 2, 1};
        Assertions.assertEquals(false, obj.isRectangleOverlap(rec1, rec2));
    }

}
