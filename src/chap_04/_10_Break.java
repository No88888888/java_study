package chap_04;

public class _10_Break {
    public static void main(String[] args) {
        // Break

        // For문
        int max = 20;
        for (int i = 1; i <= 50; i++) {
            System.out.println(i + "번 손님 주문하신 치킨 나왔습니다");
            if (i == max) {
                System.out.println("재료소진");
                break;
            }
        }
        int index = 1;
        while (index <= 50) {
            System.out.println(index + "번 손님 주문하신 치킨 나왔습니다");
            if (index == max) {
                System.out.println("그만");
                break;
            }
            index++;
        }
    }
}
