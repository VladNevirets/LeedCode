package com.java.learn.LeetCode.BinarySearch;

public class SquareX {
    public int mySqrt(int x) {
        long n = x;
        while (n * n > x) {
            n = (n + x / n) / 2;
        }
        return (int) n;
    }

}
