public class Byblade {
    private String bybladeci;
    private int donusHizi;
    private int saldiriGucu;

    public Byblade(String bybladeci, int donusHizi, int saldiriGucu) {
        this.bybladeci = bybladeci;
        this.donusHizi = donusHizi;
        this.saldiriGucu = saldiriGucu;
    }

    public String getBybladeci() {
        return bybladeci;
    }

    public void setBybladeci(String bybladeci) {
        this.bybladeci = bybladeci;
    }

    public int getDonusHizi() {
        return donusHizi;
    }

    public void setDonusHizi(int donusHizi) {
        this.donusHizi = donusHizi;
    }

    public int getSaldiriGucu() {
        return saldiriGucu;
    }

    public void setSaldiriGucu(int saldiriGucu) {
        this.saldiriGucu = saldiriGucu;
    }
    public void saldır(){
        System.out.println(bybladeci + " " + saldiriGucu + " ve " + donusHizi + " ile saldırıyor");
    }
    public void kutsalCanavarOrtayaCikar(){
        System.out.println("Bu bybladenin kutsal canavarı bulunmuyor");
    }
    public void bilgileriGoster(){
        System.out.println("Bybladeci ismi: " +bybladeci);
        System.out.println("Saldırı gücü: " +saldiriGucu);
        System.out.println("Dönüş hızı: " +donusHizi);
    }
}
