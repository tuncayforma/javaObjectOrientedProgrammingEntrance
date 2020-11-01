public class Islemci {
    private String marka;
    private String model;
    private String calismaHizi;
    private String cekirdekSayisi;

    public Islemci(String marka, String model, String calismaHizi, String cekirdekSayisi) {
        this.marka = marka;
        this.model = model;
        this.calismaHizi = calismaHizi;
        this.cekirdekSayisi = cekirdekSayisi;
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getCalismaHizi() {
        return calismaHizi;
    }

    public void setCalismaHizi(String calismaHizi) {
        this.calismaHizi = calismaHizi;
    }

    public String getCekirdekSayisi() {
        return cekirdekSayisi;
    }

    public void setCekirdekSayisi(String cekirdekSayisi) {
        this.cekirdekSayisi = cekirdekSayisi;
    }
}
