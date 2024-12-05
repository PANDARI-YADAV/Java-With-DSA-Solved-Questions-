
import java.util.HashSet;

public class duplict {
static void UniniHash(int [] arr1,int [] arr2){
    HashSet<Integer> map = new HashSet<>();
    for(int i=0;i<arr1.length;i++){
        map.add(arr1[i]);
    }
    for(int i=0;i<arr2.length;i++){
        map.add(arr2[i]);
    }
    
    System.out.println(map);
    System.out.println(map.size());
}

    public static void main(String[] args) {
        int [] arr1 = {1,2,3};
        int [] arr2 = {3,4,5};
        UniniHash(arr1,arr2);
    }
}
