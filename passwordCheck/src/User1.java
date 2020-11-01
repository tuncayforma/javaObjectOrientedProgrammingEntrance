import java.util.Scanner;

public class User1 {
    public int userId = 1;
    private int userPassword = 6404;
    public void setUserPassword(){
        System.out.println("Lütfen şifrenizi giriniz");
        Scanner klavye = new Scanner(System.in);
        int pw =  klavye.nextInt();
        while(pw!=this.userPassword){
            System.out.println("Şifre yanlış lütfen tekrar deneyiniz");
            pw = klavye.nextInt();
        }
        if(pw==this.userPassword){
            System.out.println("Yeni şifreyi giriniz");
            int userPassword = klavye.nextInt();
            this.userPassword = userPassword;
            System.out.println("Şifreniz başarıyla değiştirilmiştir. Yeni şifreniz :"+userPassword);
        }
    }
    public boolean checkPassword(int userPassword){
        if(this.userPassword == userPassword){
            return true;
        }
        else
            return false;
    }
}
