package chap_04;

public class _01_if {
    public static void main(String[] args) {
        // 조건문
        int hour = 15; // 오전 10시
        if (hour < 14) {
            System.out.println("아이스 아메리카노");
            System.out.println("샷추가");
        }
        
        System.out.println("커피 주문 완료");

        hour = 10;
        boolean morningCoffee = false;
        if ( hour < 14 && !morningCoffee) {
            System.out.println(("아이스아메리카노"));

        }
        System.out.println("끝");

        hour = 15;
        morningCoffee = false;
        if (hour >= 14 || morningCoffee == true) {
            System.out.println("예스");
        }
    }
}
