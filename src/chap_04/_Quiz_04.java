package chap_04;

public class _Quiz_04 {
    public static void main(String[] args) {
        int hour = 5; // 주차시간
        boolean small = false; // 경차여부
        boolean disabled = false; // 장애인차 여부

        int fee = hour * 4000; // 총 요금
        if (fee > 30000) { // 3만원 초과 시 3만원
            fee = 30000;

        }
        if (small || disabled) { // 경차거나 장애인 차면
//            fee *= 0.5;
//            fee = (int) (fee * 0.5f);
            fee *= 0.5f;         // 50% 할인
        }
        System.out.println(fee);
    }
}
