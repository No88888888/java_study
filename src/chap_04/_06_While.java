package chap_04;

public class _06_While {
    public static void main(String[] args) {
        // 반복문 while
        int distance = 25; // 전체거리 25m
        int move = 0; // 전체 이동 거리 0m
        while (move < distance) {
            System.out.println("발차기를 계속");
            System.out.println("현재이동거리: " + move);
            move += 3;
        }
        System.out.println("도착");

    }
}
