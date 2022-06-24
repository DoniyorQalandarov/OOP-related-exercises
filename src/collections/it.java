package collections;

import java.util.*;
import java.util.function.UnaryOperator;

public class it {
    public static void main(String args[]) {
        String massiv1[] = {"bir", "ikki", "uch", "to'rt", "besh", "olti", "yetti"};
        List<String> toplam1 = new ArrayList<>();
        for (String x : massiv1)
            toplam1.add(x);
        String massiv2[] = {"ikki", "to'rt"};
        List<String> toplam2 = new ArrayList<>();
        for (String x : massiv2)
            toplam2.add(x);
        System.out.println(toplam1);
        royhatniTahrirlash(toplam1, toplam2);
        System.out.println(toplam1);
        System.out.println("");
        royhatniKorsatish(toplam1);
        System.out.println("");
        royhatniOchirish(toplam1, 2, 3);

    }

    public static void royhatniTahrirlash(Collection<String> t1, Collection<String> t2) {
        Iterator<String> iterator = t1.iterator();
        while (iterator.hasNext()) {
            if (t2.contains(iterator.next())) {
                iterator.remove();
            }
        }
    }

    public static void royhatniKorsatish(List<String> royhat) {
        for (String x : royhat) {
            System.out.printf("%s,", x);
        }
    }

    public static void royhatniOchirish(List<String> royhat, int dan, int gacha) {
       for (int i = 0; i < royhat.size();i++) {
           System.out.printf("%s,",dan,gacha);
       }
    }

}
