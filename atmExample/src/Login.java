import java.util.Scanner;

public class Login {
    public boolean login (Hesap hesap){
        Scanner scanner = new Scanner(System.in);
        String kullanıcıAdı;
        String parola;
        System.out.print("Kullanıcı adı:");
        kullanıcıAdı = scanner.nextLine();
        System.out.print("Parola:");
        parola = scanner.nextLine();
        if(hesap.getKullaniciAdi().equals(kullanıcıAdı) && hesap.getParola().equals(parola)){
            return true;
        }
        else {
            return false;
        }
    }
}
