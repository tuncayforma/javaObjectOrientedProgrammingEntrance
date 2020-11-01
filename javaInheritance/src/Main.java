public class Main {

    public static void main(String[] args) {
        VanCat  cat1 = new VanCat();
        BlueRussiaCat cat2 = new BlueRussiaCat();
        PersianCat cat3 = new PersianCat();
        cat1.name = "Rıfkı";
        cat2.color = "Mavi";
        cat3.age =4;
        System.out.println(cat1.name);
        System.out.println(cat2.color);
        System.out.println(cat3.age);
    }
}
