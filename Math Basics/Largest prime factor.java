/* Given a number n, your task is to find the largest prime factor of n.

Examples:

Input: n = 5
Output: 5
Explanation: The prime factorization of 5 is just 5. Therefore, the largest prime factor is 5.
Input: n = 24
Output: 3
Explanation: The prime factorization of 24 is 23×3. Among the prime factors (2, 3), the largest is 3.
Input: n = 13195
Output: 29
Explanation: The prime factorization of 13195 is 5×7×13×29. The largest prime factor is 29.
Constraints:
2 <= n <= 109 */

class Solution {
    static int largestPrimeFactor(int n) {
        // code here
        int maxPrime=-1;
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                maxPrime=i;
            }
            while(n%i==0){
                n=n/i;
            }
        }
        if(n>1)
        maxPrime=Math.max(maxPrime,n);
    
        return maxPrime;
    }
}
