package programmers;

import java.util.Arrays;

// https://school.programmers.co.kr/learn/courses/30/lessons/181925

class Solution181925 {
    public static void Solution181925(String[] args) {
        int[] numLog = {0, 1, 11, 2, 3}; // 예시로 주어진 numLog 배열
        String result = solution(numLog); // solution 함수 호출
        System.out.println(result); // 결과 출력
    }

    public static String solution(int[] numLog) {
        int current = numLog[0]; // 초기 수
        StringBuilder sb = new StringBuilder(); // 문자열을 만들기 위한 StringBuilder

        for (int i = 1; i < numLog.length; i++) {
            int diff = numLog[i] - numLog[i - 1]; // 현재 값과 이전 값의 차이

            if (diff == 1) {
                sb.append("w"); // 1을 더한 경우는 "w"
            } else if (diff == -1) {
                sb.append("s"); // 1을 뺀 경우는 "s"
            } else if (diff == 10) {
                sb.append("d"); // 10을 더한 경우는 "d"
            } else if (diff == -10) {
                sb.append("a"); // 10을 뺀 경우는 "a"
            }
        }

        return sb.toString(); // 결과 문자열 반환
    }
}