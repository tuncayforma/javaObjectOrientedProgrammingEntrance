import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Byblade programına hoşgeldiniz...");
        System.out.println("Çıkış için q'ya basın.");
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.println("Hangi byblade'i üretmek istiyorsunuz");
            String islem = scanner.nextLine();
            if(islem.equals("q")){
                System.out.println("Programdan çıkılıyor...");
                break;
            }
            else{
                BybladeFabrikası fabrika = new BybladeFabrikası();
                Byblade byblade = fabrika.bybladeUret(islem);
                if(byblade == null){
                    System.out.println("Lütfen geçerli bir byblade ismi girin...");
                }
                else {
                    byblade.bilgileriGoster();
                    byblade.saldır();
                    byblade.kutsalCanavarOrtayaCikar();
                }
            }
        }
    }
}
