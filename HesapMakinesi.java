import java.util.Scanner;

public class HesapMakinesi{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("İlk sayıyı giriniz: ");
        int sayi1 = sc.nextInt();

        System.out.print("ikinci sayıyı giriniz: ");
        int sayi2 = sc.nextInt();

        System.out.print("1-Toplama 2-Çıkarma 3-Çarpma 4-Bölme");
        int secim = sc.nextInt();

        switch(secim){
            case 1:
                System.out.print("Toplam:"+(sayi1 + sayi2));
                break;
            case 2:
                System.out.print("Çıkarma:"+(sayi1 - sayi2));
                break;
            case 3:
                System.out.print("Çarpma:"+(sayi1 * sayi2));
                break;
            case 4:
                System.out.print("Bölme:"+(sayi1 / sayi2));
                break;
        }
    }
}