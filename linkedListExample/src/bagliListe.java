import java.util.Scanner;
// Tuncay FORMA 190290029
public class bagliListe {
    Node bas;

    public void ekle(int sayi){
        if(bas==null){
            bas=new Node(sayi);
        }
        else{
            Node yedek = bas;
            while (yedek.sonraki != null){
                yedek = yedek.sonraki;
            }
            yedek.sonraki = new Node(sayi);
        }
    }
    public Node sil(int sayi){
        Node yedek = bas;
        Node tutucu;
        if(bas.veri == sayi){
            tutucu = bas;
            bas = bas.sonraki;
            return bas;
        }
        while(yedek.sonraki != null && yedek.sonraki.veri != sayi){
            yedek = yedek.sonraki;
        }
        if(yedek.sonraki == null){
            System.out.println("Sayı bulunamadı");
            return bas;
        }
        tutucu = yedek.sonraki;
        yedek.sonraki = yedek.sonraki.sonraki;
        return bas;
    }

    public String listele(){
        Node yedek = bas;
        String liste ="";
        while (yedek != null){
            liste += yedek.veri+ " --->";
            yedek = yedek.sonraki;
        }
        return liste;
    }

    public void ara(){
        Scanner klavye = new Scanner(System.in);
        System.out.println("Aradığınız veriyi klavyeden giriniz:");
        int sayi = klavye.nextInt();
        Node yedek = bas;
        int siraNo=1;
        String mesaj = "";
        while (yedek != null){
            if(yedek.veri == sayi){
                mesaj+= "Veri listede mevcut ve "+siraNo+". sırada";
                System.out.println(mesaj);
                break;
            }
            siraNo+=1;
            yedek=yedek.sonraki;
        }
        if(mesaj.equals("")){
            System.out.println("Aradığınız veri listede mevcut değil.");
        }
    }
    public void remove(){
        Node current = bas;
        Node next;
        if(bas == null){
            return;
        }
        while (current.sonraki != null){
            if(current.veri == current.sonraki.veri){
                next = current.sonraki.sonraki;
                current.sonraki = null;
                current.sonraki = next;
            }
            else
                current = current.sonraki;
        }
    }

}
