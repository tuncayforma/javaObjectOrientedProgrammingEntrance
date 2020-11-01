import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("İdman programına hoşgeldiniz...");
        String idmanlar = "Geçerli Hareketler...\n"
                        + "Burpee\n"
                        + "Pushup(Şınav)\n"
                        + "Situp(Mekik)\n"
                        + "Squat\n";
        System.out.println(idmanlar);
        System.out.println("Bir idman oluşturun...");
        System.out.print("Burpee sayisi: ");
        int burpee = scanner.nextInt();
        System.out.print("Pushup sayisi: ");
        int pushup = scanner.nextInt();
        System.out.print("Situp sayisi: ");
        int situp = scanner.nextInt();
        System.out.print("Squat sayisi: ");
        int squat = scanner.nextInt();
        scanner.nextLine();

        Idman idman = new Idman(burpee,pushup,situp,squat);
        System.out.println("İdmanınız başlıyor...");

        while (idman.idmanBittiMi() == false){
            System.out.print("Hareket Türü(Burpee , Pushup , Situp , Squat) :");
            String tur = scanner.nextLine();
            System.out.print(tur+ "'dan kaç tane yapacaksınız: ");
            int sayi = scanner.nextInt();
            scanner.nextLine();
            idman.hareketYap(tur,sayi);

        }

    }
}
