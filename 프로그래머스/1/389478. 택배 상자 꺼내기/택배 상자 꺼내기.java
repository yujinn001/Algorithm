class Solution {
    public int solution(int n, int w, int num) { 
        int answer = 0;
        int row;

        row = num % w != 0 ? num / w + 1 : num / w ;

        int i = num; 
        do {
            i += 2* (row * w - i) + 1;
            answer++;
            row++;
        }
        while(i<=n);
        return answer;
    }
}