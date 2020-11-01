 class VanCat extends Cat{
    private boolean eyeColor;

    public VanCat(String name, int age, boolean eyeColor) {
        super(name,age);
        this.eyeColor=eyeColor;
    }
    //Değer Döndürme
     public boolean getEyeColor(){
        return this.eyeColor;
     }
     //Değer Gönderme
     public void setEyeColor(boolean eyeColor){
        this.eyeColor = eyeColor;
     }
     public void ioCat(){
        if(this.eyeColor==true){
            System.out.println("Kedimizin adı: "+this.getName()
                            +"\nKedimizin yaşı: "+this.getAge()
                            +"\nKedimizin göz renkleri farklıdır.\n");
        }
        else {
            System.out.println("Kedimizin adı: "+this.getName()
                    +"\nKedimizin yaşı: "+this.getAge()
                    +"\nKedimizin göz renkleri farklı değildir.\n"
                    +"Nesne yanlış yerde tanımlanmıştır, lütfen ait olduğu sınıfı düzeltiniz.\n ");
        }
     }
}
