public class abra {
    public static void main(String[] args) {
        horse me = new horse();
        me.walk();
        me.eats();
    }
}

 abstract class animl{
        abstract void walk();
          public void eats(){
            System.out.println("Animal eating");
          }  
        
}

class horse extends animl{
    public void walk(){
            System.out.println("horse walking");
    }
}
class rat extends animl{
    public void walk(){
            System.out.println("rat running");
    }
}
