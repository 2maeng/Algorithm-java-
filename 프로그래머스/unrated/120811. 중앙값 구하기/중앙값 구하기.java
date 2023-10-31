import java.util.*;

class Solution {
    public int solution(int[] array) {
        
        Arrays.sort(array);
        
        int x = (array.length / 2);
        
        return array[x];
    }
}