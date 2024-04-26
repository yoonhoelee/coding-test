import java.util.*;

class Solution {
    public int solution(int[][] targets) {
        int answer = 0;
        Arrays.sort(targets, (a, b) -> Integer.compare(a[1], b[1]));
        double lastShot = Double.NEGATIVE_INFINITY;

        for (int i = 0; i < targets.length; i++) {
            int start = targets[i][0];
            int end = targets[i][1];
            if (lastShot < start) {
                lastShot = end - 0.1;
                answer++;
                System.out.println(lastShot);
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        int[][] targets = {{4,5}, {4,8}, {10,14}, {11,13}, {5,12}, {3,7}, {1,4}};
        Solution solution = new Solution();
        int result = solution.solution(targets);
        System.out.println("Number of intervals processed: " + result);
    }
}
