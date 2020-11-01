public class PowerSupply {
    private String marka;
    private String model;
    private String maxGuc;

    public PowerSupply(String marka, String model, String maxGuc) {
        this.marka = marka;
        this.model = model;
        this.maxGuc = maxGuc;
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

    public String getMaxGuc() {
        return maxGuc;
    }

    public void setMaxGuc(String maxGuc) {
        this.maxGuc = maxGuc;
    }
}
