package simpleCode;

public class EnumExample {
    enum HaftaKunlar {Dushanba, Seshanba, Chorshanba, Payshanba, Juma, Shanba,Yakshanba}

    ;

    public static void main(String[] args) {
        HaftaKunlar kecha = HaftaKunlar.Dushanba;
        HaftaKunlar bugun = HaftaKunlar.Seshanba;
        HaftaKunlar ertaga = HaftaKunlar.Chorshanba;
        HaftaKunlar indin = HaftaKunlar.Payshanba;
        HaftaKunlar juma = HaftaKunlar.Juma;
        HaftaKunlar shanba = HaftaKunlar.Shanba;
        HaftaKunlar yakshanba = HaftaKunlar.Yakshanba;
        System.out.printf("Kecha %s edi\n", kecha);
        System.out.printf("Bugun %s \n", bugun);
        System.out.printf("Ertaga %s bo'ladi\n", ertaga);
        System.out.printf("Indinga %s bo'ladi\n",indin);
        System.out.printf("3 kun dan keyin esa %s bo'ladi\n",juma);
        System.out.printf("4 kuni esa %s bo'ladi\n",shanba);
        System.out.printf("Dam olish kuni esa %s bo'ladi",yakshanba);
    }
}
