import java.util.*;

//////PROBLEM STATEMENT

    // KEYS | VALUES 
    // INDIA | 100
    // CHINA | 150
    // USA | 200

    // CODE IN HASHMAP

public class HASHMAP {
    
    public static void main(String[] args) {
        HashMap<String,Integer> map=new HashMap<>();
        map.put("india", 100);
        map.put("china", 150);
        map.put("usa", 200);
        System.out.println(map);
        if(map.containsKey("india")){
            System.out.println("yes");
        }
        else{
            System.out.println("Nooo");
        }
        System.out.println(map.get("india"));

        //// Iteration in hash map


        ////type 1

        for (Map.Entry<String, Integer> e : map.entrySet()) {
            System.out.print(e.getKey()+" ");
            System.out.println(e.getValue());
            
        }
        System.out.println();

        ////type 2
            Set<String> keys = map.keySet();

        for(String key:keys ){
            System.out.println(key+ " "+map.get(key));

        }

    }
    
}
