public class Anakart {
    private String marka;
    private String model;
    private String islemciPin;
    private int biosPassword;
    private Islemci islemci;
    private Ram ram;
    private EkranKartı ekranKartı;
    private HardDisk hardDisk;

    public Anakart(String marka, String model, String islemciPin, int biosPassword, Islemci islemci, Ram ram, EkranKartı ekranKartı, HardDisk hardDisk) {
        this.marka = marka;
        this.model = model;
        this.islemciPin = islemciPin;
        this.biosPassword = biosPassword;
        this.islemci = islemci;
        this.ram = ram;
        this.ekranKartı = ekranKartı;
        this.hardDisk = hardDisk;
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

    public String getIslemciPin() {
        return islemciPin;
    }

    public void setIslemciPin(String islemciPin) {
        this.islemciPin = islemciPin;
    }

    public int getBiosPassword() {
        return biosPassword;
    }

    public void setBiosPassword(int biosPassword) {
        this.biosPassword = biosPassword;
    }

    public Islemci getIslemci() {
        return islemci;
    }

    public void setIslemci(Islemci islemci) {
        this.islemci = islemci;
    }

    public Ram getRam() {
        return ram;
    }

    public void setRam(Ram ram) {
        this.ram = ram;
    }

    public EkranKartı getEkranKartı() {
        return ekranKartı;
    }

    public void setEkranKartı(EkranKartı ekranKartı) {
        this.ekranKartı = ekranKartı;
    }

    public HardDisk getHardDisk() {
        return hardDisk;
    }

    public void setHardDisk(HardDisk hardDisk) {
        this.hardDisk = hardDisk;
    }
}
