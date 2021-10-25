/**
 * LeetCode 9. Palindrome Number October 25, 2021 Difficulty: Easy Language:
 * Java
 */

public class LC0009PalindromeNumber {
    /**
     * Initial function
     * 
     * Runtime: 13 ms. Memory usage: 42.7 MB.
     * 
     * Time comlexity: O(n), Space complexity: O(1)
     * 
     * Time taken to think of solution and execute successfully: 9m 57sec.
     * 
     * @param x
     * @return
     */
    public boolean isPalindrome(int x) {
        if (x < 0)
            return false;

        char[] str = String.valueOf(x).toCharArray();

        int low = 0;
        int high = str.length - 1;

        while (low <= high) {
            if (str[low] != str[high])
                return false;
            else {
                low++;
                high--;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        int x = 101;
        LC0009PalindromeNumber pn = new LC0009PalindromeNumber();
        System.out.println(pn.isPalindrome(x));
    }
}
