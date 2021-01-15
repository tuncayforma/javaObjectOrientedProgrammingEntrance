import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int[] sayilar = {4, 93, 30, 99, 62, 86, 55, 5, 19, 68, 72, 2, 8, 53, 32, 56, 61, 28, 10, 90, 93, 86, 81, 4, 20, 67, 68, 17, 8, 8, 1, 71, 32, 24, 10, 85, 3, 87, 73, 17};
        int[] sayilar1 = {4, 93, 30, 99, 62, 86, 55, 5, 19, 68, 72, 2, 8, 53, 32, 56, 61, 28, 10, 90, 93, 86, 81, 4, 20, 67, 68, 17, 8, 8, 1, 71, 32, 24, 10, 85, 3, 87, 73, 17};
        int boyut = sayilar.length;
        while (true){
            System.out.println("**************************");
            System.out.println(" ************************ ");
            System.out.println("1.Bubble Sort Algoritması ile sırala");
            System.out.println("2.Selection Sort Algoritması ile sırala");
            System.out.println("3.Bubble Sort ile Selection Sort karşılaştırma.");
            System.out.println("Çıkış için 'q' basın.");
            System.out.println(" ************************ ");
            System.out.println("**************************");
            Scanner klavye = new Scanner(System.in);
            String girilen = klavye.nextLine();
            if(girilen.equals("1")){
                long startTime = System.nanoTime(); //Kronometre başlatma
                for (int i = 0; i < boyut-1; i++){ // Dizinin elamanları üzerinde gezinme
                    for (int j = 0; j < boyut-i-1; j++){ // Karşılaştırma döngüsü
                        if (sayilar[j] > sayilar[j+1]){ // Dizinin sıralı iki elemanını karşılaştırma(örneğin 5. ve 6. eleman)
                            int temp = sayilar[j];   // Eğer küçük elaman 6. elamansa 5.elemanın geçici bir değişkende tutulması
                            sayilar[j] = sayilar[j+1]; // Eğer küçük elaman 6. elamansa 6.elemanın 5.elemana taşınması
                            sayilar[j+1] = temp; // Geçiçi değişkende tutulan 5.elemanın 6. elemana taşınması
                        }
                    }
                }
                long endTime = System.nanoTime(); //Kronometre durdurma
                for(int k= 0; k< boyut-1 ; k++){ // Dizideki elemanları ekrana yazdırma
                    System.out.print(sayilar[k]+" ");
                }
                System.out.println("");
                long estimatedTime = endTime - startTime;
                System.out.println("Sıralama " +estimatedTime+ " nanosaniyede yapılmıştır.");
            }
            else if (girilen.equals("2")){
                long startTime = System.nanoTime(); // Kronometre başlatma
                for (int i = 0; i < boyut-1; i++){ //Dizinin elemanları üzerinde gezinme
                    int min = i; // Minumum sayı dizinin ilk terimi kabul edilmiştir.
                    for (int j = i+1; j < boyut; j++) //Karşılaştırma döngüsü
                        if (sayilar1[j] < sayilar1[min]) // Minumum sayı olarak kabul edilen dizinin ilk terimi ile dizinin ikinci terimi karşılaştırılmıştır.
                            min = j;  // Bulunan minimum elemanı ilk elemanla değiştiriliyor.
                            int temp = sayilar1[min]; // Minumum sayının geçiçi bir değişkende tutulması
                            sayilar1[min] = sayilar1[i]; // Yeni minumum sayının atanması
                            sayilar1[i] = temp; // Yeni minumum sayının dizideki eski yerine eski minumum sayının taşınması
                }
                long endTime = System.nanoTime(); // Kronometre durdurma.
                for(int k= 0; k< boyut-1 ; k++){ // Dizideki elemanları ekrana yazdırma
                    System.out.print(sayilar1[k]+ " ");
                }
                System.out.println("");
                long estimatedTime = endTime - startTime;
                System.out.println("Sıralama " +estimatedTime+ " nanosaniyede yapılmıştır.");
            }
            else if(girilen.equals("3")){
                String karsilastirma = "Her iki algoritmada da O.(n.n) durum olduğundan ikisininde hızları bir birine yakındır. "
                    +"Ama Selection Sort biraz daha hızlı çalışır. "
                    +"Bubble Sort ile Selection Sort arasındaki temel fark, Bubble Sortun, yanlış sıradaysa bitişik öğeleri tekrar tekrar değiştirerek çalışmasıdır. "
                    +"Buna karşılık, Selection Sort, sıralanmamış kısımdaki minimum elemanı tekrar tekrar bularak ve bunu dizinin başına yerleştirerek bir diziyi sıralar. ";
                System.out.println(karsilastirma);
            }
            else if(girilen.equals("q")){
                break;
            }
        }
    }
}
