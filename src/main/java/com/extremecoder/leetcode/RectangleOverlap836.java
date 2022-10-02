package com.extremecoder.leetcode;

public class RectangleOverlap836 {
    public boolean isRectangleOverlap(int[] rec1, int[] rec2) {
        return rec1[0] < rec2[2] && rec1[1] < rec2[3] && rec2[0] < rec1[2] && rec2[1] < rec1[3];
    }
}
/*The Rectangles will be overlap if the bottom left of first rec is less than the top right of second rect
and if the top right of first rec is greater than the bottom left of second rect */