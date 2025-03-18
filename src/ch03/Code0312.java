package ch03;

public class Code0312 {
    public static void main(String[] args) {
        // replaceAll: 특정 문자열을 다른 문자열로 변경
        String a = "철수는 점심밥으로 오뚜기밥을 먹었다.";
        System.out.println(a.replaceAll("밥", "빵")); // "철수는 점심빵으로 오뚜기빵을 먹었다."
    }
}
