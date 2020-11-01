import java.util.Scanner;

public class Atm {
    public void calis(Hesap hesap){
        Login login = new Login();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bankamıza hoşgeldiniz.....");
        System.out.println("******************************");
        System.out.println("Kullanıcı girişi");
        System.out.println("******************************");

        int girisHakki = 3;

        while(true){
            if(login.login(hesap)){
                System.out.println("Giriş başarılı.");
                break;
            }
            else{
                System.out.println("Giriş başarısız...");
                girisHakki-=1;
                System.out.println("Kalan giriş hakkı: "+girisHakki);
            }
            if(girisHakki==0){
                System.out.println("Giriş hakkınız bitti.");
                return;
            }
        }
        System.out.println("******************************");
        String islemler = "1. Bakiye Görüntüle\n"
                        + "2. Para Yatırma\n"
                        + "3. Para Çekme\n"
                        + "Çıkış için q'ya basınız.";
        System.out.println(islemler);
        System.out.println("******************************");

        while (true){
            System.out.println("İşlemi seçiniz.");
            String islem = scanner.nextLine();
            if (islem.equals("q")){
                break;
            }
            else if (islem.equals("1")){
                System.out.println("Bakiyeniz: "+hesap.getBakiye());
            }
            else if (islem.equals("2")){
                System.out.println("Yatırmak istediğiniz tutar: ");
                int tutar = scanner.nextInt();
                scanner.nextLine();
                hesap.paraYatir(tutar);
            }
            else if (islem.equals("3")){
                System.out.println("Çekmek istediğiniz tutar: ");
                int tutar = scanner.nextInt();
                scanner.nextLine();
                hesap.paraCek(tutar);
            }
            else {
                System.out.println("Geçersiz işlem...");
            }
        }
    }
}
