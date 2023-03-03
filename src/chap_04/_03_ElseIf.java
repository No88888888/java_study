package chap_04;

public class _03_ElseIf {
    public static void main(String[] args) {
        // elseif

        boolean hallabong = false;
        boolean mango = false;
        
        if (hallabong) {
            System.out.println("한라봉");

        } else if (mango) {
            System.out.println("망고");
        } else {
            System.out.println("아메리카노");
            
        }
        System.out.println("끝");
    }
}
