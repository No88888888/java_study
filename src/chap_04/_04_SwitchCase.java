package chap_04;

public class _04_SwitchCase {
    public static void main(String[] args) {
        int ranking = 3;
        if (ranking == 1) {
            System.out.println("전액장학금");

        } else if (ranking == 2) {
            System.out.println("반액");
        } else {
            System.out.println("대상 아님");
        }
        System.out.println("끝");
        
        
        // switch case문
        ranking = 2;
        switch (ranking) {
            case 1:
                System.out.println("전액");
                break;
            case 2: // 중복되는 행동은 이와같이 생략가능하다
            case 3:
                System.out.println("반액");
                break;
            default:
                System.out.println("끝");
        }
        System.out.println("종료");
    }
}
