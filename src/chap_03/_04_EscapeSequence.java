package chap_03;

public class _04_EscapeSequence {
    public static void main(String[] args) {
        // 특수문자, 이스케이프 문자
        System.out.println("자바가");
        System.out.println("너무");
        System.out.println("재밌어요");

        // 줄바꿈
        System.out.println("자바가\n 너무 \n재밌어요");

        // 탭
        System.out.println("해물파전\t\t9000원");
        System.out.println("해물전\t\t8000원");
        System.out.println("해물전\t\t7000원");

        // \\: 역슬래시
        System.out.println("C:\\Program files\\Java");

        // 다비가 "냐옹"이라고 했어요
        System.out.println("다비가 \"냐옹\"이라고 했어요");
        System.out.println("다비가 '냐옹'이라고 했어요");
    }
}
