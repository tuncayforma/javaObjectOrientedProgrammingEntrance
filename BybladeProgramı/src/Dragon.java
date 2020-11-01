public class Dragon extends Byblade{
    private String kutsalCanavar;
    private String gizliYetenek;

    public Dragon(String bybladeci, int donusHizi, int saldiriGucu, String kutsalCanavar, String gizliYetenek) {
        super(bybladeci, donusHizi, saldiriGucu);
        this.kutsalCanavar = kutsalCanavar;
        this.gizliYetenek = gizliYetenek;
    }

    @Override
    public void kutsalCanavarOrtayaCikar() {
        System.out.println(getBybladeci() + " " + kutsalCanavar + " ı ortaya çıkarıyor");
        System.out.println(getBybladeci() + " ın saldırısı : Hayalet kasırgası");
    }

    @Override
    public void bilgileriGoster() {
        super.bilgileriGoster();
        System.out.println("Kutsal canavar adı: " + kutsalCanavar);
    }
}
