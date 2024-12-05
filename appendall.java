public class appendall {
    static  int count=0;
    public static void main(String[] args) {
        String a="axbxcxxx";
        char d='x';
        int n=a.length();
        String r;
        sort(a,0,"");
    }
    static void sort(String s,int n,String r){
        char d=s.charAt(n);
        if(n==s.length()-1){
            for(int i=0;i<count;i++){
            r+=d;
            }
            System.out.println(r);
            return;
            
        }
        if(d=='x'){
            count++;
            sort(s,  n+1, r);
            
        }
        else{
           
            r+=d;
            sort(s, n+1, r);
        }
    }
}
