package boj;

import java.util.*;

public class Main2606 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(); // 컴퓨터의 수
        int m = scanner.nextInt(); // 연결된 네트워크 상의 컴퓨터 쌍의 수

        // 그래프 생성
        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
        for (int i = 0; i <= n; i++) {
            graph.add(new ArrayList<>());
        }

        // 네트워크 정보 입력
        for (int i = 0; i < m; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            graph.get(a).add(b);
            graph.get(b).add(a);
        }

        boolean[] visited = new boolean[n + 1]; // 방문 여부 체크 배열
        int count = bfs(graph, visited, 1); // 1번 컴퓨터부터 탐색 시작

        System.out.println(count - 1); // 1번 컴퓨터는 포함되므로 -1을 해서 출력
    }

    // BFS 구현
    public static int bfs(ArrayList<ArrayList<Integer>> graph, boolean[] visited, int start) {
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(start); // 시작 노드 큐에 추가
        visited[start] = true; // 시작 노드 방문 체크
        int count = 0;

        while (!queue.isEmpty()) {
            int node = queue.poll();
            count++;

            for (int next : graph.get(node)) {
                if (!visited[next]) {
                    queue.offer(next);
                    visited[next] = true;
                }
            }
        }
        return count;
    }
}
