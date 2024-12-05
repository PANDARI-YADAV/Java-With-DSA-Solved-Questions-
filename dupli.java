public class dupli {
    public static void main(String[] args) {
        String str="bcabc";
        String newStr;
        int n;
        dup( str,"");
    }
    static  void dup(String s,String newStr){
        for(int i=0;i<s.length()-1;i++){
            if(s.charAt(i)==s.charAt(i+1)){
                continue;
            }
            else{
                 newStr+=s.charAt(i);
            }
        }
        System.out.println(newStr);
    }
}
