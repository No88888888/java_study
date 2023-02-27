package chap_03;

public class _02_String2 {
    public static void main(String[] args) {
        String s = "I like Java and Python and C.";

        // 문자열 변환
        System.out.println(s.replace(" and", ",")); // " and"를 "," 로 변환
        System.out.println(s.substring(7, 25));
        System.out.println(s.substring(s.indexOf("Java")));
        System.out.println(s.substring(s.indexOf("Java"), s.indexOf(".")));
    }
}
