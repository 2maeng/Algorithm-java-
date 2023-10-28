import java.util.*;

class Solution {
    public int[] solution(int[] numbers, int num1, int num2) {
        
        // num1(포함)
        // num2(미포함)
        
        int[] answer = Arrays.copyOfRange(numbers, num1, num2 + 1);
        
        return answer;
    }
}