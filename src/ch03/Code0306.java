package ch03;

public class Code0306{
    // 조건문의 판단 기준으로 사용됨
    public static void main(String[] args){
        int melona = 1200;
        int worldCone = 2000;
        boolean cheaper = melona < worldCone; // true
        if (cheaper) {
            // true이므로 출력됨
            System.out.println("우와! 더 싸요!");
        }
    }
}
