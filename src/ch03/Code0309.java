package ch03;

public class Code0309 {
    public static void main(String[] args){
    // equals: 문자열 2개가 같은지 비교
    String a = "홍창기";
    String b = "신민재";
    String c = "신민재";
    String d = new String("신민재");
    System.out.println(a.equals(b)); // false
    System.out.println(b.equals(c)); // true
    System.out.println(b == c); // true
    System.out.println(b == d); // false - 왜?
    }
}
