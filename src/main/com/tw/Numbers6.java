package com.tw;

public class Numbers6 {
    public static void main(String[] args) {
        for (long n = 0, ctr = 0; ctr < 15; n++) {
            if (isNarcDecNum(n)) {
                System.out.print(n + " ");
                ctr++;
            }
        }
    }

    private static boolean isNarcDecNum(long n) {
        if (n < 0) return false;
        String str1 = Long.toString(n);
        int x = str1.length();
        long sumNum = 0;
        for (char c : str1.toCharArray()) {
            sumNum += Math.pow(Character.digit(c, 10), x);
        }
        return sumNum == n;
    }


}
