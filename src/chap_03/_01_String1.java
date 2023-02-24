package chap_03;

public class _01_String1 {
    public static void main(String[] args) {
        String s = "I like Java and Python and C.";
        System.out.println(s.length());

        System.out.println(s.toUpperCase());
        System.out.println(s.toLowerCase());

        System.out.println(s.contains("Java"));
        System.out.println(s.indexOf("Java")); // 7
        System.out.println(s.indexOf("C#")); // -1 반환
        System.out.println(s.indexOf("and")); // 12 앞에서부터 찾은 and
        System.out.println(s.lastIndexOf("and")); // 23 뒤에서부터 찾은 and
        System.out.println(s.startsWith("I")); // 해당 문자로 싲가하면 true
        System.out.println(s.endsWith(".")); // 해당 문자로 끝나면 true


    }
}
