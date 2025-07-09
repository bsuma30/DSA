/*Given a number n. Return true if the digit sum(or sum of digits) of n is a Palindrome number otherwise false.

A Palindrome number is a number that stays the same when reversed

Examples:

Input: n = 56
Output: true
Explanation: The digit sum of 56 is 5+6 = 11. Since, 11 is a palindrome number.Thus, answer is true.
Input: n = 98
Output: false
Explanation: The digit sum of 98 is 9+8 = 17. Since 17 is not a palindrome,thus, answer is false.
Constraints:
1 <= n <= 109*/


class Solution {
    boolean isDigitSumPalindrome(int n) {
        // code here
        int sum=0,r;
        while(n!=0){
            r=n%10;
            sum+=r;
            n=n/10;
        }
        int s=sum,c=0;
        while(sum!=0){
            r=sum%10;
            c=c*10+r;
            sum=sum/10;
        }
        if(c==s)
        return true;
        else
        return false;
    }
}
