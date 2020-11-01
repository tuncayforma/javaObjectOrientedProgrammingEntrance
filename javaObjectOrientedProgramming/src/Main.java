public class Main {

    public static void main(String[] args) {
	Cat cat1 = new Cat();
	Cat cat2 = new Cat();
	Cat cat3 = new Cat("Eylül","Pink",5,8);
	cat2.name = "Rıfkı";
	cat2.age = 5;
		System.out.println(  cat1.name + "\n"
							+cat1.color + "\n"
							+cat1.age + "\n"
							+cat1.hungry + "\n");
		System.out.println(  cat2.name + "\n"
				+cat2.color + "\n"
				+cat2.age + "\n"
				+cat2.hungry + "\n");
		System.out.println(  cat3.name + "\n"
				+cat3.color + "\n"
				+cat3.age + "\n"
				+cat3.hungry + "\n");
    }
}

