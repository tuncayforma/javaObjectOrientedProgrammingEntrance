public class Main {

    public static void main(String[] args) {
        bagliListe b1 = new bagliListe();
        b1.ekle(45);
        b1.ekle(35);
        b1.ekle(25);
        b1.ekle(15);
        b1.ekle(5);
        b1.ara();
        System.out.println(b1.listele());
        b1.sil(45);
        b1.ara();
        System.out.println(b1.listele());
    }
}

