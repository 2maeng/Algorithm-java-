class Solution {
    public int[] solution(int n) {
    
        int x = 0;
        
        if(n % 2 == 0){
            x = n / 2;
        }
        else {
            x = n / 2 + 1;
        }
        
        int[] answer = new int[x];
        
        int index = 0; 
        
        for(int i = 1; i <= n; i++){
            if(i % 2 == 1){
                answer[index] = i;
                
                index++;
            }
            
        }
        
        return answer;
       
    }
}