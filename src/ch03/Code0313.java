package ch03;

public class Code0313 {
    public static void main(String[] args) {
        // substring: 문자열에서 특정 문자열을 뽑아냄
        String a = "역시 나는 천재야";
        System.out.println(a.substring(6, 8)); // "천재"
        System.out.println(a.substring(6, a.length())); // "천재야"
    }
}
