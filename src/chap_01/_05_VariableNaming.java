package chap_01;

public class _05_VariableNaming {
    public static void main(String[] args) {
        // 변수 이름 짓는 법
        // 1. 저장할 값에 어울리는 이름
        // 2. 밑줄(_) 문자(abc) 숫자(123) 사용 가능 (공백불가)
        // 3. 밑줄 또는 문자로 시작 가능
        // 4. 한 단어 또는 2개 이상 단어의 연속
        // 5. 소문자로 시작, 각 단어의 시작 글자는 대문자( 첫 단어는 제외)
        // 6. 예약어 사용 불가 (public, static, void, int)

        String nationality = "대한민국";
        String firstName = "현설";
        String lastName = "김";
        String dateOfBirth = "2001-12-31";

        // 상수 final을 붙이면 다른 값을 할당 할 수 없다 JS의 const 같은것
        final String CODE = "KR";

    }
}
