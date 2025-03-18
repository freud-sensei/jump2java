package quiz;

public class quiz0305 {
    public static void main(String[] args) {
        String a = "a:b:c:d";
        String b = a.replaceAll(":", "#");
        System.out.println(b);
    }
}