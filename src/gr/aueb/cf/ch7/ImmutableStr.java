package gr.aueb.cf.ch7;

public class ImmutableStr {

    public static void main(String[] args) {
        String s1 = "Coding";
        String s2 = "Coding";

        s2 = "Factory";
        s1 = "Athens";

        System.out.println(s1);
        System.out.println(s2);
    }
}
