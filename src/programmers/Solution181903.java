package programmers;

// https://school.programmers.co.kr/learn/courses/30/lessons/181903

class Solution181903 {
    public static void Solution181903(String[] args) {
        int q = 3; // 예시로 주어진 q 값
        int r = 2; // 예시로 주어진 r 값
        String code = "abcdefghi"; // 예시로 주어진 code 값

        String result = solution(q, r, code); // solution 함수 호출
        System.out.println(result); // 결과 출력
    }

    public static String solution(int q, int r, String code) {
        StringBuilder sb = new StringBuilder(); // 새로운 문자열을 만들기 위한 StringBuilder

        for (int i = 0; i < code.length(); i++) {
            if (i % q == r) {
                sb.append(code.charAt(i)); // q로 나눈 나머지가 r인 경우 문자열에 추가
            }
        }

        return sb.toString(); // 결과 문자열 반환
    }
}
