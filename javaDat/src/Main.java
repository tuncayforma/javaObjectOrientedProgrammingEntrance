package javaDat;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;
public class JavaDat {
    public static void main(String[] args) throws FileNotFoundException, IOException{
        int n=0;
        File dosya = new File("A.DAT");
        FileOutputStream ab = new FileOutputStream(dosya);
        BufferedOutputStream s = new BufferedOutputStream(ab);
        do{
            Scanner klavye1 =new Scanner(System.in);
            System.out.println("Lütfen Bir kelime giriniz: ");
            String bilgi1=klavye1.nextLine();
            char a = bilgi1.charAt(0);
            if(a=='a'||a=='A'){
                byte[] byteArrray = bilgi1.getBytes();
                s.write(byteArrray);
                n++;
            }
        }while(n!=20);
    }
}