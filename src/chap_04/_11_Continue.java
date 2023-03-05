package chap_04;

public class _11_Continue {
    public static void main(String[] args) {
        // Continue

        int max = 20; // 최대 판매수량
        int sold = 0; // 현재 치킨 판맨 수량
        int noShow = 17; // 노쇼 손님
        for (int i = 1; i <= 50; i++) {
            if (i == noShow) {
                System.out.println(i + "번 손님 노쇼하셨음");
                continue;
            }
            System.out.println(i + "번 손님 주문하신 치킨");
            sold++;
            if (sold == max) {
                System.out.println("종료");
                break;
            }
        }
        sold = 0;
        int index = 0;
        while (index < 50) {
            index++;
            System.out.println(index + "번 손님 주문하신 치킨");
            if (index == noShow) {
                System.out.println(index + "번 노쇼");
                continue;
            }
            sold++;
            if (sold == max) {
                System.out.println("끝");
                break;
            }
        }
    }
}
