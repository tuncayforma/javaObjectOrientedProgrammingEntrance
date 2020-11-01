public class Drayga extends Byblade {
    private String kutsalCanavar;

    public Drayga(String bybladeci, int donusHizi, int saldiriGucu, String kutsalCanavar) {
        super(bybladeci, donusHizi, saldiriGucu);
        this.kutsalCanavar = kutsalCanavar;
    }

    @Override
    public void kutsalCanavarOrtayaCikar() {
        System.out.println(getBybladeci() + " " + kutsalCanavar + " ı ortaya çıkarıyor");
        System.out.println(getBybladeci() + " ın saldırısı : Kaplan pençesi");

    }

    @Override
    public void bilgileriGoster() {
        super.bilgileriGoster();
        System.out.println("Kutsal canavar adı: " + kutsalCanavar);
    }
}
