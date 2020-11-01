public class Cat {
    public int age;
    public String name;
    public String color;
    public int hungry;
    void eatFood(int foodVal){
        this.hungry+=foodVal;
    }
    public Cat() {
        this.name = "Değer girilmedi...";
        this.color = "Değer girilmedi...";
        this.age = 0;
        this.hungry = 0;
    }
    public Cat(String name, int age){
        this.name = name;
        this.age = age;
    }
    public Cat(String name , String color , int age , int hungry){
        this.name = name;
        this.color = color;
        this.age = age;
        this.hungry = hungry;
    }

}
