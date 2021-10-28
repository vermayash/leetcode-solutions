/**
 * LeetCode 13. Roman To Integer 
 * October 25, 2021 
 * Difficulty: Easy 
 * Language: Java
 */

public class LC0013RomanToInteger {
    /**
     * Initial Implementation
     * 
     * Time taken: 7 ms. Memory Usage: 41.8 MB
     * 
     * Time complexity: O(n). Space Complexity: O(1)
     * 
     * Time taken to think and execute: 19m 14sec.
     * 
     * @param s
     * @return
     */
    public int romanToInt(String s) {
        char[] c = s.toCharArray();

        int total = 0;

        for (int i = 0; i < c.length; i++) {
            if (i == c.length - 1) {
                total += symbolToInt(c[i]);
                continue;
            }

            if (symbolToInt(c[i]) >= symbolToInt(c[i + 1])) {
                total += symbolToInt(c[i]);
            } else {
                int temp = symbolToInt(c[i + 1]) - symbolToInt(c[i]);
                total += temp;
                i++;
            }
        }

        return total;
    }

    public int symbolToInt(char c) {
        switch (c) {
        case 'I':
            return 1;
        case 'V':
            return 5;
        case 'X':
            return 10;
        case 'L':
            return 50;
        case 'C':
            return 100;
        case 'D':
            return 500;
        case 'M':
            return 1000;
        default:
            return 0;
        }
    }

    public static void main(String[] args) {
        String s = "MCMXCIV";
        LC0013RomanToInteger ri = new LC0013RomanToInteger();
        System.out.println(ri.romanToInt(s));
    }
}
