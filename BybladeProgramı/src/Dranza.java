public class Dranza extends Byblade{
    private String kutsalCanavar;

    public Dranza(String bybladeci, int donusHizi, int saldiriGucu, String kutsalCanavar) {
        super(bybladeci, donusHizi, saldiriGucu);
        this.kutsalCanavar = kutsalCanavar;
    }

    @Override
    public void kutsalCanavarOrtayaCikar() {
        System.out.println(getBybladeci() + " " + kutsalCanavar + " ı ortaya çıkarıyor");
        System.out.println(getBybladeci() + " ın saldırısı : Alev kılıcı");
    }

    @Override
    public void bilgileriGoster() {
        super.bilgileriGoster();
        System.out.println("Kutsal canavar adı: " + kutsalCanavar);
    }
}
