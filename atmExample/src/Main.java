public class Main {

    public static void main(String[] args) {
	    Atm atm = new Atm();
	    Hesap hesap = new Hesap("forma38","6404",2000);
	    atm.calis(hesap);
        System.out.println("Programdan çıkılıyor");
    }
}
