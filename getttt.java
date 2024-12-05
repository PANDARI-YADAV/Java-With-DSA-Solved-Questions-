
public class getttt {
    public static void main(String[] args) {
        me n = new me();
      n.setPassword("abc");
    System.out.println(n.getPassword());
    }

}

class me{
    private String password;

    public String getPassword(){
        //setPassword(randomPass);
        return this.password;
    }
    public void setPassword( String pass){
       // setPassword(randomPass);
         this.password=pass;
    }
    
}
