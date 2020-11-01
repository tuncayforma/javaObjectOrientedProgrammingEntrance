public class BybladeFabrikası {
    public Byblade bybladeUret(String bybladeTuru){
         if(bybladeTuru.equals("Dragon")){
             return new Dragon("Takao",800,300,"Mavi Ejderha","Kutsal Canavarla Konuşma");
         }
         else if(bybladeTuru.equals("Dranza")){
             return new Dranza("Kai",600,400,"Kırmızı Anka Kuşu");
         }
         else if(bybladeTuru.equals("Drayga")){
             return new Drayga("Rei",800,250,"Beyaz Kaplan");
         }
         else if(bybladeTuru.equals("Draciel")){
             return new Dranza("Max",400,1000,"Kara Kaplumbağa");
         }
         else{
             return null;
         }
    }
}
