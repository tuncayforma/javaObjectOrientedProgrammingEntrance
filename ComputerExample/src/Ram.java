public class Ram {
    private String marka;
    private String model;
    private String kapasite;
    private String hizi;

    public Ram(String marka, String model, String kapasite, String hizi) {
        this.marka = marka;
        this.model = model;
        this.kapasite = kapasite;
        this.hizi = hizi;
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

    public String getHizi() {
        return hizi;
    }

    public void setHizi(String hizi) {
        this.hizi = hizi;
    }
}
