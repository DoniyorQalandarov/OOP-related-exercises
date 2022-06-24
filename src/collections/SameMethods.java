package collections;

import java.util.*;

public class SameMethods {
    public static void main(String[] args) {
        String[] massiv1 = {"bir", "ikki", "uch", "to'rt"};
        List<String> toplam1 = new LinkedList<>(Arrays.asList(massiv1));
        System.out.printf("%s,\n", toplam1);

        String[] massiv2 = {"besh", "olti", "yetti", "sakkiz"};
        List<String> toplam2 = new LinkedList<>(Arrays.asList(massiv2));
        System.out.printf("%s,\n",toplam2);

        toplamlarniQoshish(toplam1,toplam2);
        toplamlardanOchirish(toplam1,4,7);
        toplamniAylantirish(toplam2);
    }
    public static void toplamlarniQoshish(Collection<String> t1,Collection<String> t2) {
        t1.addAll(t2);
        System.out.printf("%s\n",t1);
    }
    public static void toplamlardanOchirish(List<String> toplam,int dan ,int gacha) {
        toplam.subList(dan,gacha).clear();
        System.out.printf("%s,",toplam);
    }
    public static void toplamniAylantirish(List<String> royhat) {
        ListIterator<String> iterator = royhat.listIterator();
        while (iterator.hasPrevious()) {
            System.out.printf("%s", iterator.previous());
        }
    }
}
