public class Queue {
    Node bas = null;
    Node son = null;
    private int veriSayisi;
    public void enqueue(int sayi){ ////Ekleme
        if(bas == null){
            bas = new Node(sayi);
            bas.sonraki = null;
            son = bas;
            veriSayisi = veriSayisi + 1;
        }
        else{
            son.sonraki= new Node(sayi);
            son = son.sonraki;
            veriSayisi = veriSayisi + 1;
        }
    }
    public void dequeue(){ //// Çıkarma
        if(bas == null){
            System.out.println("Liste boş...");
            return;
        }
        else {
            System.out.println(bas.veri+ " çıkarıldı.");
            Node yedek = bas.sonraki;
            bas = yedek;
            veriSayisi = veriSayisi - 1;
        }
    }
    public int getVeriSayisi() { //// Veri sayısını döndürme
        return veriSayisi;
    }
    public void listele(){ //// Verileri listeleme
        if(bas == null){
            System.out.println("Veri yok");
        }
        else {
            Node yedek = bas;
            while(yedek.sonraki != null) {
                System.out.print(yedek.veri+"-->");
                yedek = yedek.sonraki;
            }
            System.out.print(yedek.veri);
        }
    }
    public void basBulma(){ //// Baştaki veriyi döndürme
        System.out.println(bas.veri);
    }
}
