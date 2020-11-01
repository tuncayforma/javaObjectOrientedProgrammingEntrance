public class Main {

    public static void main(String[] args) {
        Resolution resolution = new Resolution(1920,1080);
        Monitor monitor = new Monitor("PB27Q","ASUS","27",resolution);
        Kasa kasa = new Kasa("Shadow Blade","Shadow","Temperli Cam");
        Anakart anakart = new Anakart("B250-Pro","Asus",10,"Windows 10");
        Bilgisayar pc = new Bilgisayar(monitor,kasa,anakart);
        pc.getKasa().bilgisayariAc();
        pc.getMonitor().monitoruKapat();
        pc.getAnakart().isletimSistemiYukle("Linux");

    }
}
