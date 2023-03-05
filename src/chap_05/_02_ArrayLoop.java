package chap_05;

public class _02_ArrayLoop {
    public static void main(String[] args) {
        String[] coffee = {"아메리카노", "카페모카", "라떼", "카푸치노"};
        for (int i = 0; i < coffee.length; i++) {
            System.out.println(coffee[i] + "주세요");
        }
        
        // enhanced for (for-each) 반복문
        for (String coffees : coffee) {
            System.out.println(coffees);
        }
    }
}
