import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Islemci islemci = new Islemci("İntel","i7-9700K","3,6gHz","12");
	    Ram ram = new Ram("Corsair","Vengeance","16","3200MHz");
	    EkranKartı ekranKartı = new EkranKartı("ASUS","RTX 2070","8GB","256");
	    HardDisk hardDisk = new HardDisk("Seagate","Barracuda","1TB","7200RPM");
	    PowerSupply powerSupply = new PowerSupply("Corsair","VS650","650W");
	    Anakart anakart = new Anakart("ASUS","B150M-C","1151",6404,islemci,ram,ekranKartı,hardDisk);
	    Kasa kasa = new Kasa(anakart,powerSupply);
	    String islemler = "Kapatmak için için q basın....+\n"
                        + "1.Yönetici İşlemleri\n"
                        + "2.Kullanıcı İşlemleri\n";
	    while (true){
            System.out.println(islemler);
            Scanner scanner = new Scanner(System.in);
            String girilen = scanner.nextLine();
            if(girilen.equals("1")){
                int hak = 3;
                while(true){
                    System.out.println("Lütfen bios şifresini giriniz:");
                    int inputPassword = scanner.nextInt();
                    scanner.nextLine();
                    if(inputPassword == kasa.getAnakart().getBiosPassword()){
                        System.out.println("Giriş başarılı...");
                        return;
                    }
                    else if(inputPassword != kasa.getAnakart().getBiosPassword()){
                        hak = hak-1;
                        System.out.println("Yanlış şifre tekrar deneyin...");
                        if(hak==0){
                            System.out.println("Giriş hakkınız bitti. Programdan çıkarıldınız...");
                            break;
                        }
                    }
                }
            }
            else if(girilen.equals("2")){

            }
            else if (girilen.equals("q")){
                System.out.println("Sistem kapatılıyor...");
                break;
            }
            else {
                System.out.println("Geçersiz işlem");
            }
        }
    }
}
