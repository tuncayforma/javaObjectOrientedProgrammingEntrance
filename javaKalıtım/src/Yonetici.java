public class Yonetici extends Calisan { //SubClass
    private int sorumluKisi;
    public Yonetici(String isim, int maas, String departman, int sorumluKisi){
        /* this.isim=isim;
        this.maas=maas;
        this.departman=departman;  */
        super(isim,maas,departman);
        this.sorumluKisi=sorumluKisi;
    }
    public void zamYap (int zamMiktarı){
        System.out.println("Çalışanlara "+zamMiktarı + " TL zam yapıldı..");
    }
    @Override
    public void bilgileriGoster() {
        super.bilgileriGoster();
        System.out.println("Sorumlu kişi sayısı:"+sorumluKisi);
    }
}
