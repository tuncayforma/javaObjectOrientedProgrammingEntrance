// Tuncay FORMA 190290029
public class Stack {
    int boyut = 0;
    Node bas;
    public void push(int sayi){ //Ekleme
        if(bas==null){
            bas=new Node(sayi);
            boyut = boyut + 1;
        }
        else{
            Node yedek = new Node(sayi);
            yedek.sonraki = bas;
            bas = yedek;
            boyut = boyut + 1;
        }
    }
    public void pop(){ //Son elemanı silme veri geriye değerini dönme
        if( bas == null){
            System.out.println("Yığında veri yok");
        }
        else {
            Node yedek = bas;
            Node tutucu;
            System.out.println(bas.veri);
            tutucu = bas;
            bas = bas.sonraki;
            boyut = boyut - 1;
        }
    }
    public void size(){ //Boyutu
        System.out.println(boyut);
    }
    public void top(){ //En üstteki elemanın değerini dönme
        if(bas!=null){
            System.out.println(bas.veri);
        }
        else {
            System.out.println("Yığında veri yok");
        }
    }
    public void list(){ //Elemanları listeleme
        Node yedek = bas;
        String liste ="";
        while (yedek != null){
            liste += yedek.veri+ " --->";
            yedek = yedek.sonraki;
        }
        return liste;
    }
    public boolean sayiAra(int sayi){ //Arama yapma
        Node yedek = bas;
        int siraNo=1;
        String mesaj = "";
        while (yedek != null){
            if(yedek.veri == sayi){
                mesaj+= "Veri listede mevcut ve "+siraNo+". sırada";
                System.out.println(mesaj);
                break;
                return true;
            }
            siraNo+=1;
            yedek=yedek.sonraki;
        }
        if(mesaj.equals("")){
            System.out.println("Aradığınız veri listede mevcut değil.");
            return false;
        }
    }
}

