package chap_03;

public class _Quiz_03 {
    public static void main(String[] args) {
        String id = "901231-1234567";
        System.out.println(id.substring(0, 8)); // 0부터 8까지 
        System.out.println(id.substring(0, id.indexOf("-") + 2)); // 0부터 "-" 위치 2칸 뒤까지 
    }
}
