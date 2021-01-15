import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Queue q1 = new Queue();
	    while (true) {
			System.out.println("***************************");
			System.out.println(" ************************* ");
			System.out.println("1.Enqueue(Ekleme)");
			System.out.println("2.Dequeue(Çıkarma)");
			System.out.println("3.Listing(Listeleme)");
			System.out.println("4.Listedeki Veri Sayısı");
			System.out.println("5.Baştaki Veriyi Öğrenme");
			System.out.println("  * Çıkış için q basınız. *");
			System.out.println(" ************************* ");
			System.out.println("***************************");
			Scanner klavye = new Scanner(System.in);
			String girilen = klavye.nextLine();
			if (girilen.equals("1")) {
				System.out.println("Eklenecek sayıyı giriniz:");
				int deger = klavye.nextInt();
				klavye.nextLine();
				q1.enqueue(deger);
			} else if (girilen.equals("2")) {
				q1.dequeue();
			} else if (girilen.equals("3")) {
				q1.listele();
			} else if (girilen.equals("4")) {
				System.out.println(q1.getVeriSayisi());
			} else if (girilen.equals("5")) {
				System.out.print("Baştaki veri: ");
				q1.basBulma();
			} else if (girilen.equals("q")) {
				System.out.println("Programdan çıkılıyor...");
				break;
			}
		}
    }
}
