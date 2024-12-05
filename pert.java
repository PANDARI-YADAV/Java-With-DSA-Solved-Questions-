
import java.util.HashSet;

public class pert {
    public static void main(String[] args) {
        String str="abb";
        int n;
        String perm;
        HashSet<String> set = new HashSet<>();
        permutation(str,"",set);
    }
    static void permutation(String p,String perm,HashSet<String> set){
if(p.length()==0){
    if(set.contains(perm)){
        return;
    }
    System.out.println(perm);
    set.add(perm);
    return;
}


        for(int i=0;i<p.length();i++){
            char C=p.charAt(i);
            String newStr= p.substring(0,i)+p.substring(i+1);
            permutation(newStr, perm+C,set);
        }
    }
}
