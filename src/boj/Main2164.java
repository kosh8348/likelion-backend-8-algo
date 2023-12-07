package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

// https://www.acmicpc.net/problem/2164

public class Main2164 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        Queue<Integer> cards = new LinkedList<>();
        for (int i = 1; i <= N; i++) {
            cards.offer(i); // 1부터 N까지의 카드를 큐에 넣음
        }

        while (cards.size() > 1) {
            cards.poll(); // 제일 위의 카드를 버림

            int movedCard = cards.poll(); // 제일 위의 카드를 제일 아래로 옮김
            cards.offer(movedCard);
        }

        System.out.println(cards.peek()); // 마지막에 남는 카드 출력
    }
}
