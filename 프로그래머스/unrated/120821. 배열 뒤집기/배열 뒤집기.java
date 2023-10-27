class Solution {
    public int[] solution(int[] num_list) {
        
    int left = 0;
    int right = num_list.length - 1;
        
    while (left < right) {
        // 왼쪽과 오른쪽 요소를 스왑
        int temp = num_list[left];
        num_list[left] = num_list[right];
        num_list[right] = temp;
        
        left++;
        right--;
    }
        return num_list;
    }
}