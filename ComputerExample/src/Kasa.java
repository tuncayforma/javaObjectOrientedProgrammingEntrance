public class Kasa {
    private Anakart anakart;
    private PowerSupply powerSupply;

    public Kasa(Anakart anakart, PowerSupply powerSupply) {
        this.anakart = anakart;
        this.powerSupply = powerSupply;
    }

    public Anakart getAnakart() {
        return anakart;
    }

    public void setAnakart(Anakart anakart) {
        this.anakart = anakart;
    }

    public PowerSupply getPowerSupply() {
        return powerSupply;
    }

    public void setPowerSupply(PowerSupply powerSupply) {
        this.powerSupply = powerSupply;
    }
}
