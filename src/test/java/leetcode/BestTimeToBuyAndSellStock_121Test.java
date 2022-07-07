package leetcode;

import com.extremecoder.leetcode.BestTimeToBuyAndSellStock_121;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BestTimeToBuyAndSellStock_121Test {

    @Test
    public void checked_With_valid_Input_I() {
        int[] inputs = new int[]{7, 1, 5, 3, 6, 4};
        BestTimeToBuyAndSellStock_121 obj = new BestTimeToBuyAndSellStock_121();
        Assertions.assertEquals(5, obj.maxProfit(inputs));
    }

    @Test
    public void checked_With_valid_Input_II() {
        int[] inputs = new int[]{7, 3, 5, 4, 6, 1, 2};
        BestTimeToBuyAndSellStock_121 obj = new BestTimeToBuyAndSellStock_121();
        Assertions.assertEquals(3, obj.maxProfit(inputs));
    }

    @Test
    public void checked_With_Zero_Result() {
        int[] inputs = new int[]{7,6,4,3,1};
        BestTimeToBuyAndSellStock_121 obj = new BestTimeToBuyAndSellStock_121();
        Assertions.assertEquals(0, obj.maxProfit(inputs));
    }

    @Test
    public void checked_With_Empty_input() {
        int[] inputs = new int[]{};
        BestTimeToBuyAndSellStock_121 obj = new BestTimeToBuyAndSellStock_121();
        Assertions.assertEquals(0, obj.maxProfit(inputs));
    }
}
