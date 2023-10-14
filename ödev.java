import java.util.Scanner;
public class ödev {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Tabanı girin: ");
        int taban = input.nextInt();
        System.out.print("Üssü girin: ");
        int us = input.nextInt();
        long sonuc = usHesapla(taban, us);
        System.out.println(taban + "^" + us + " = " + sonuc);
    }
    public static int usHesapla(int taban, int us) {
        if (us == 0) {
            return 1;
        } else if (us % 2 == 0) {
            int altUsSonuc = usHesapla(taban, us / 2);
            return altUsSonuc * altUsSonuc;
        } else {
            int altUsSonuc = usHesapla(taban, (us - 1) / 2);
            return taban * altUsSonuc * altUsSonuc;
        }
    }
}
