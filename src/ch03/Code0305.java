package ch03;

public class Code0305 {
    public static void main(String[] args) {
        int i = 0;

        // i++: 값을 참조한 후에 증가
        System.out.println(i++); // 0, 코드 실행 순간에는 값 변경 X
        System.out.println(i); // 1, 실행된 이후 값이 증가

        int j = 0;
        // ++i: 값을 참조하기 전에 증가
        System.out.println(++j); // 1
        System.out.println(j); // 1

        // i--, --i는 1을 감소시킨다는 점 빼고 동일한 규칙을 따름
    }
}
