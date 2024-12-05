public class keypad {
    static  String [] keypad ={".","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};

    public static void main(String[] args) {
        String str="23";
        int n;
        String com;
        sort(str,0,"");
    }
    static void sort(String str,int n,String comb){
        if(n==str.length()){
            System.out.println(comb);
            return;
        }
            char curr=str.charAt(n);
            String map=keypad[curr-'0'];
            for(int i=0;i<map.length();i++){
                sort(str, n+1, comb+map.charAt(i));
            }

    }
}
