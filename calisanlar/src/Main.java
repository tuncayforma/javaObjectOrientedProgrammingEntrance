import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Çalışanlar programına hoşgeldiniz...");
        String islemler = "İşlemler...\n"
                        + "1.Yazılımcı İşlemleri\n"
                        + "2.Yönetici İşlemleri\n"
                        + "Çıkış için q basın. ";
        System.out.println("************************************");
        System.out.println(islemler);
        System.out.println("************************************");
        while (true){
            System.out.println("İşlemi seçiniz ");
            String islem = scanner.nextLine();
            if(islem.equals("q")){
                System.out.println("Programdan çıkılıyor");
                break;
            }
            else if(islem.equals("1")){
                Yazilimci yazilimci = new Yazilimci("Tuncay","Forma",38,"C,Python,Java");
                String yazilimciIslem = "1.Format at\n"
                                        + "2.Bilgilerini göster\n"
                                        + "Çıkış için q'ya basın.";
                System.out.println(yazilimciIslem);
                while (true){
                    System.out.println("İşlemi seçiniz: ");
                    String yIslem = scanner.nextLine();
                    if(yIslem.equals("q")){
                        System.out.println("Yazılımcı işlemlerinden çıkılıyor...");
                        break;
                    }
                    else if(yIslem.equals("1")){
                        System.out.println("İşletim Sistemi : ");
                        String isletimSistemi = scanner.nextLine();
                        yazilimci.formatAt(isletimSistemi);
                    }
                    else if(yIslem.equals("2")){
                        yazilimci.bilgileriGoster();
                    }
                    else{
                        System.out.println("Geçersiz yazılımci işlemi...");
                    }
                }
            }
            else if(islem.equals("2")){
                Yonetici yonetici =new Yonetici("Arif","FORMA",39,5);
                String yoneticiIslem = "Yönetici işlemleri...\n"
                                        +"1.Zam Yap\n"
                                        +"2.Bilgileri Göster\n"
                                        +"Çıkış için q'ya basın.";
                System.out.println(yoneticiIslem);
                while (true){
                    System.out.println("İşlem seçiniz: ");
                    String yIslem = scanner.nextLine();
                    if(yIslem.equals("q")){
                        System.out.println("Yöntetici işlemlerinden çıkılıyor...");
                        break;
                    }
                    else if(yIslem.equals("1")){
                        System.out.println("Yöneticinin ne kadar zam yapmasını istiyorsunuz: ");
                        int zamMiktarı = scanner.nextInt();
                        scanner.nextLine();
                        yonetici.zamYap(zamMiktarı);
                    }
                    else if(yIslem.equals("2")){
                        yonetici.bilgileriGoster();
                    }
                    else {
                        System.out.println("Geçersiz yönetici işlemi...");
                    }
                }
            }
            else{
                System.out.println("Geçersiz işlem...");
            }
        }
    }
}
