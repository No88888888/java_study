package chap_05;

import java.util.Arrays;

public class _03_MultiArray {
    public static void main(String[] args) {
        // 다차워 배열(2차원배열)

        String[] seatA = {"A1", "A2", "A3", "A4", "A5"};
        String[] seatB = {"B1", "B2", "B3", "B4", "B5"};
        String[] seatC = {"C1", "C2", "C3", "C4", "C5"};

        // 3 X 5 크기의 2차원 배열
        String[][] seats = new String[][]{
                {"A1", "A2", "A3", "A4", "A5"},
                {"B1", "B2", "B3", "B4", "B5"},
                {"C1", "C2", "C3", "C4", "C5"}
        };

        // B2에 접근하는법
        System.out.println(seats[1][1]);
        // C5 접근
        System.out.println(seats[2][4]);

        String[][] seats2 = {
                {"A1", "A2", "A3"},
                {"B1", "B2", "B3", "B4"},
                {"C1", "C2", "C3", "C4", "C5"}
        };
        // A3 접근
        System.out.println(seats[0][2]);

        // A5 접근
        System.out.println(seats[0][4]); // 오류
        System.out.println(Arrays.toString(seats2[0]));

        // 3차원 배열 만들기
        String[][][] marray = new String[3][3][3];

    }
}
