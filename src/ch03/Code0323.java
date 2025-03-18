package ch03;

public class Code0323 {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();

        sb.append("오늘도 정말 못말려");
        sb.insert(0, "짱구는 ");
        String result = sb.toString();

        System.out.println(result); // 짱구는 오늘도 정말 못말려
   }
}
