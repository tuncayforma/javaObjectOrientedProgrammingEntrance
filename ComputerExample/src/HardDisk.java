public class HardDisk {
    private String marka;
    private String model;
    private String kapasite;
    private String donusHizi;

    public HardDisk(String marka, String model, String kapasite, String donusHizi) {
        this.marka = marka;
        this.model = model;
        this.kapasite = kapasite;
        this.donusHizi = donusHizi;
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

    public String getKapasite() {
        return kapasite;
    }

    public void setKapasite(String kapasite) {
        this.kapasite = kapasite;
    }

    public String getDonusHizi() {
        return donusHizi;
    }

    public void setDonusHizi(String donusHizi) {
        this.donusHizi = donusHizi;
    }
}
