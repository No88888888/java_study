package chap_04;

public class _05_For {
    public static void main(String[] args) {
        // 반복문
        String a = "Love and peace";
        for (int i = 0; i < a.length(); i += 2) {
            System.out.println("어서오세요" + i);
        }

        for (int i = 0; i < a.length(); i += 2) {
            System.out.print(i); // print하면 줄바꿈없이 붙여서 출력
        }

        System.out.println();

        for (int i = 5; i > 0; i--) {
            System.out.print(i);
        }

        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum += i;
            System.out.println(sum);
        }
    }
}
