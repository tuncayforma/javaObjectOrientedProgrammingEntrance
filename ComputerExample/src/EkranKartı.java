public class EkranKartı {
    private String marka;
    private String model;
    private String kapasite;
    private String bitHizi;

    public EkranKartı(String marka, String model, String kapasite, String bitHizi) {
        this.marka = marka;
        this.model = model;
        this.kapasite = kapasite;
        this.bitHizi = bitHizi;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setKapasite(String kapasite) {
        this.kapasite = kapasite;
    }

    public void setBitHizi(String bitHizi) {
        this.bitHizi = bitHizi;
    }
}
