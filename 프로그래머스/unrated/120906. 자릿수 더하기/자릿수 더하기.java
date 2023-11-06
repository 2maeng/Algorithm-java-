class Solution {
    public int solution(int n) {
        
        int sum = 0;
        
        while (n != 0) {
            int digit = n % 10; // 현재 자릿수
            sum += digit; // 자릿수를 더함
            n = n / 10; // 다음 자릿수를 구하기 위해 정수를 10으로 나눔
        }
        
        return sum;
    }
}