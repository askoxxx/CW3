// MULTIPLES OD 3 AND 5 

public class Solution {
    
        public static int multiples(int number) {
            int sum = 0;
            for (int i = 1; i < number; i++) {
                if (i % 3 == 0) {
                    sum = sum + i; 
                } else if (i % 5 == 0) {
                    sum = sum + i;
                }
            }
            return sum;
        }
}
