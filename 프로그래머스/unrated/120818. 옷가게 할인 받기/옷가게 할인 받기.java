class Solution {
    public int solution(int price) {
        
        double p1 = (double)price * 0.95;
        double p2 = (double)price * 0.9;
        double p3 = (double)price * 0.8;
        
        if(price >= 500000){
            return (int)p3;
        }
        else if(price >= 300000){
            return (int)p2;
        }
        if(price >= 100000){
            return (int)p1;
        }
        return price;
    }
}