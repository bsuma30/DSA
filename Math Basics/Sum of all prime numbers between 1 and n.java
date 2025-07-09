/*Given a positive integer n, compute and return the sum of all prime numbers between 1 and n (inclusive).

A prime number is a natural number greater than 1 that has no positive divisors other than 1 and itself.  

Examples:

Input: n = 5
Output: 10
Explanation: 2, 3 and 5 are prime numbers between 1 and 5(inclusive), and their sum is 2 + 3 + 5 = 10.
Input: n = 10
Output: 17
Explanation: 2, 3, 5 and 7 are prime numbers between 1 and 10(inclusive), and their sum is 2 + 3 + 5 + 7 = 17.
Constraints:
1 <= n <= 105*/

class Solution {
    public int prime_Sum(int n) {
        int c=0;
        for(int i=2;i<=n;i++){
            
            if(isPrime(i)){
                c+=i;
            }
        
        }
            
        return c;
    }
    public boolean isPrime(int i){
        for(int j=2;j<=i/2;j++){
            if(i%j==0)
            return false;
        }
        return true;
    }
}
