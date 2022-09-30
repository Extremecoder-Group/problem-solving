package com.extremecoder.leetcode;

/*https://leetcode.com/problems/remove-digit-from-number-to-maximize-result/*/
public class RemoveDigitFromNumberToMaximizeResult2259 {
    public String removeDigit(String number, char digit) {
        String ans = "";
        for (int i = 0; i < number.length(); i++) {
            if (number.charAt(i) == digit) {
                String temp = number.substring(0, i) + number.substring(i + 1);
                if (ans.equals("")) {
                    ans = temp;
                } else {
                    if (temp.compareTo(ans) > 0) {
                        ans = temp;
                    }
                }
            }
        }
        return ans;
    }
}
