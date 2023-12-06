package boj;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

// https://www.acmicpc.net/problem/20001

public class Main20001 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Stack<Boolean> stack = new Stack<Boolean>();

        while (true) {
            // 고무오리 : rubberduck ( rbd )
            String rbd = br.readLine();
            if (rbd.equals("고무오리")) {
                if (stack.size() == 0) {
                    // "고무오리" 해결할 문제가 없어서 벌칙으로 두 문제 추가 (push)
                    stack.push(true);
                    stack.push(true);
                } else {
                    // 문제가 없을시 (pop)반환
                    stack.pop();
                }
            } else if (rbd.equals("문제")) {
                // 문제 발생(추가)
                stack.push(true);
            } else if (rbd.equals("고무오리 디버깅 끝")) {
                break;
            }
        }
        // ? 1 : 0  참 또는 거짓과 같이 스택이 완전히 pop 되었느냐(비었느냐) : 스택이 남아있느냐
        System.out.println(stack.isEmpty() ? "고무오리야 사랑해" : "힝구");
    }
}
