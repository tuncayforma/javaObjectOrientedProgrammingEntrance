public class Cat {
    private String name;
    private int age;

    //Varsayılan yapılandırıcı
    public Cat(){
        this.name = "İsim değeri girilmedi";
        this.age = 0;
    }
    public Cat(String name, int age){
        this.name = name;
        this.age = age;
    }
    //Değer Döndürme
    public String getName(){
        return this.name;
    }
    public int getAge(){
        return this.age;
    }
    //Değer Gönderme
    public void setName(String name){
        this.name = name;
    }
    public void setAge(int age){
        this.age = age;
    }
    public void ioCat(){
        System.out.println("Kedimizin adı: "+this.getName()
                    +"\nKedimizin yaşı: "+this.getAge()+"\n");
    }
}
