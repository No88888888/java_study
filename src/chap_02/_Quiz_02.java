package chap_02;

public class _Quiz_02 {
    public static void main(String[] args) {
        int x = 115;

        String a = (120 <= x) ? "가능" : "불가능";
        System.out.println("키가 " + x + "cm 이므로 탑승 " + a + "합니다" );

        x = 121;
        a = (120 <= x) ? "탑승" : "불가능";
        System.out.println("키가 " + x + "cm 이므로 탑승 " + a + "합니다" );

    }
}
