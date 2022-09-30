package leetcode;

import com.extremecoder.leetcode.RemoveDigitFromNumberToMaximizeResult2259;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RemoveDigitFromNumberToMaximizeResult2259Test {

    @Test
    public void checked_With_valid_Input_I() {
        String inputs = "123";
        char digit = '3';
        RemoveDigitFromNumberToMaximizeResult2259 obj = new RemoveDigitFromNumberToMaximizeResult2259();
        Assertions.assertEquals("12", obj.removeDigit(inputs, digit));
    }

    @Test
    public void checked_With_valid_Input_II() {
        String inputs = "1231";
        char digit = '1';
        RemoveDigitFromNumberToMaximizeResult2259 obj = new RemoveDigitFromNumberToMaximizeResult2259();
        Assertions.assertEquals("231", obj.removeDigit(inputs, digit));
    }
}
