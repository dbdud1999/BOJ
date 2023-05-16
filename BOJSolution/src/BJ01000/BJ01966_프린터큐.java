package BJ01000;

import java.io.*;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.StringTokenizer;

/**
 * Solved Yet!!
 */
public class BJ01966_프린터큐 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int T = Integer.parseInt(br.readLine());
        int N, wond;  // 문서의 개수, 궁금한 문서 idx
        int[] compareImp;
        Queue<Integer> queue = new ArrayDeque<>();

        for (int test_case = 1; test_case <= T; test_case++) {
            st = new StringTokenizer(br.readLine());
            N = Integer.parseInt(st.nextToken());  // 문서의 개수
            wond = Integer.parseInt(st.nextToken());  // 궁금한 문서 index
            queue.clear();

            for (int i = 0; i < N; i++) {

            }
        }
        bw.append(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }
}
