package leetcode;

import com.extremecoder.leetcode.NumberOfStepsToReduceANumberToZero1342;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class NumberOfStepsToReduceANumberToZero1342Test {

    @Test
    public void checked_With_valid_Input_I() {
        int inputs = 7;
        NumberOfStepsToReduceANumberToZero1342 obj = new NumberOfStepsToReduceANumberToZero1342();
        Assertions.assertEquals(5, obj.numberOfSteps(inputs));
    }

    @Test
    public void checked_with_valid_Input_II() {
        int inputs = 14;
        NumberOfStepsToReduceANumberToZero1342 obj = new NumberOfStepsToReduceANumberToZero1342();
        Assertions.assertEquals(6, obj.numberOfSteps(inputs));
    }
}
