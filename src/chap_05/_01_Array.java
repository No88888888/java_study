package chap_05;
import java.util.Arrays;
public class _01_Array {


    public static void main(String[] args) {
        String coffeeRoss = "아메리카노";
        String coffeeRachel = "카페모카";
        String coffeeCandler = "라떼";

        // 배열 선언
//        String[] coffee = new String[4];

        // 두번째 방법
//        String coffee[] = new String[4];
//        coffee[0] = "아메리카노";

        // 세번째 방법
//        String[] coffee = new String[]{"아메리카노", "카페모카", "라떼", "카푸치노"};

        // 네번째 방법
        String[] coffee = {"아메리카노", "카페모카", "라떼", "카푸치노"};

        System.out.println("--------------------------");

        System.out.println(coffee[0] + "주세요");
        System.out.println(coffee[1] + "주세요");
        coffee[2] = "에스프레소";
        System.out.println(coffee[2] + "주세요");
        System.out.println(coffee[3] + "주세요");
        System.out.println(Arrays.toString(coffee));
        // 다른 자료형
        int[] i = new int[3];
        i[0] = 1;
        i[1] = 2;
        i[2] = 3;
        System.out.println(Arrays.toString(i));
        double[] d = new double[]{10.0, 11.2, 13.5};
        System.out.println(Arrays.toString(d));
        boolean[] b = {true, true, false};

    }
}
