package chap_02;

public class _01_Operator1 {
    public static void main(String[] args) {
        // 산술 연산자

        // 일반 연산
        System.out.println(4 + 2); // 6
        System.out.println(4 - 2); // 2
        System.out.println(4 * 2); // 8
        System.out.println(4 / 2); // 2
        System.out.println(5 / 2); // 2
        System.out.println(2 / 4); // 0
        System.out.println(5 % 2); // 1
        System.out.println((double) 5 / 2);

        // 우선 순위 연산
        System.out.println(2 + 2 * 2); // 6
        System.out.println((2 + 2) * 2); // 8
        System.out.println(2 + (2 * 2)); // 6

        // 증감 연산 ++, --
        int val;
        val = 10;
        System.out.println(val); // 10
        System.out.println(++val); // 11
        System.out.println(val); // 11

        val = 10;
        System.out.println(val); // 10
        System.out.println(val++); // 10
        System.out.println(val); // 11

        val = 10;
        System.out.println(val); // 10
        System.out.println(--val); // 9
        System.out.println(val); // 9

        val = 10;
        System.out.println(val); // 10
        System.out.println(val--); // 10
        System.out.println(val); // 9

        // 은행 대기번호 표
        int waiting = 0;
        System.out.println("대기 인원 : " + waiting++); // 대기인원 : 0
        System.out.println("대기 인원 : " + waiting++); // 대기인원 : 1
        System.out.println("대기 인원 : " + waiting++); // 대기인원 : 2
        System.out.println("총 대기 인원 : " + waiting); // 총 대기 인원 : 3



    }
}
