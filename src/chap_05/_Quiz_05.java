package chap_05;

public class _Quiz_05 {
    public static void main(String[] args) {
//        int[] shoes = {250, 255, 260, 265, 270, 275, 280, 285, 290, 295};
        int[] shoes = new int[10];

        for (int i = 0; i < shoes.length; i++) {
            shoes[i] = 250 + (5 * i);
        }

        for (int shoe:
                shoes
             ) {
            System.out.println(shoe + " 재고 있음");

        }
    }
}
