package simpleCode;

import java.util.Arrays;

public class StringExample {
    public static void main(String[] args) {
        String matn = "Salom hammaga bugun haftaning Seshanba kuni";
        String matn2 = "Salom hammaga bugun haftaning kuni";
        System.out.printf("%s\n", matn);

        System.out.printf("%s\n", matn.substring(14, 43));
        System.out.println(matn.charAt(2));

        System.out.println(matn.concat(" ,ertaga Chorshanba"));
        System.out.println(matn.equals(matn2));
        System.out.println(matn.replace('f','b'));
        String[] newString = matn.split(" ");
        System.out.println(Arrays.toString(newString));

        System.out.println(matn.intern());

    }
}
