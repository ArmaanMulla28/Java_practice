import java.util.Arrays;
import java.util.Scanner;
public class GraphTraversal {
    static int[][] adj;
    static boolean[] visited;
    static int n;
    static void BFS(int start) {
        Arrays.fill(visited, false);

        int[] queue = new int[n];
        int front = 0, rear = -1;

        visited[start] = true;
        queue[++rear] = start;
        System.out.print("BFS Traversal: ");
        while (front <= rear) {
            int vertex = queue[front++];
            System.out.print(vertex + " ");
            for (int i = 0; i < n; i++) {
                if (adj[vertex][i] == 1 && !visited[i]) {
                    visited[i] = true;
                    queue[++rear] = i;
                }
            }
        }
        System.out.println();
    }
    static void DFSUtil(int vertex) {
        visited[vertex] = true;
        System.out.print(vertex + " ");

        for (int i = 0; i < n; i++) {
            if (adj[vertex][i] == 1 && !visited[i]) {
                DFSUtil(i);
            }
        }
    }
    static void DFS(int start) {
        Arrays.fill(visited, false);

        System.out.print("DFS Traversal: ");
        DFSUtil(start);
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of vertices: ");
        n = sc.nextInt();
        if (n <= 0) {
            System.out.println("Invalid number of vertices.");
            sc.close();
            return;
        }
        adj = new int[n][n];
        visited = new boolean[n];

        System.out.println("Enter adjacency matrix:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                adj[i][j] = sc.nextInt();
            }
        }
        System.out.print("Enter starting vertex (0 to "
                + (n - 1) + "): ");
        int start = sc.nextInt();
        if (start < 0 || start >= n) {
            System.out.println("Invalid starting vertex.");
            sc.close();
            return;
        }
        BFS(start);
        DFS(start);
        sc.close();
    }
}
