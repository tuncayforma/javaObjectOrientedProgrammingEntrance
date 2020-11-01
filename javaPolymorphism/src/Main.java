public class Main {

    public static void main(String[] args) {
	Cat cat1, cat2, cat3;
	cat1 = new Cat("Rıfkı",2);
	cat2 = new VanCat("Mırmır",5,true);
	cat3 = new VanCat("Tarçın",4,false);

	cat1.ioCat();
	cat2.ioCat();
	cat3.ioCat();
    }
}
