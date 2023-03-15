package com.ll.p120814;

public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.solution(7));
        System.out.println(sol.solution(1));
        System.out.println(sol.solution(15));
    }
}

class Solution {
    public int solution(int n) {
        if(n%7 == 0) return n/7;
        return n/7+1;
    }
}