package chap_06;

public class _03_Return {
    // 호텔 전화번호
    public static String getPhoneNumber() {
        String phonenumber = "02-12345-5678";
        return phonenumber;
    }
    // 호텔 주소
    public static String getAddress() {
        return "서울시 어딘가";
    }

    // 호텔 엑티비티
    public static String getActivity() {
        return "볼링장, 수영장, 당구장";
    }
    public static void main(String[] args) {
        // 반환값
        String contactNumber = getPhoneNumber();
        System.out.println("호텔 전화번호" + contactNumber);

        String address = getAddress();
        System.out.println("호텔 주소" + address);

        String activity = getActivity();
        System.out.println("엑티비티" + activity);
    }
}
