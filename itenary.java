
import java.util.HashMap;

public class itenary {

    static String getStart(HashMap<String, String> tick){
        HashMap<String, String> revMap = new HashMap<>();
        for(String key:tick.keySet()){
            /// keys== key ; and value : tick.get(keys)
            revMap.put(tick.get(key), key);
        }
        for(String keys:tick.keySet()){
            if(!revMap.containsKey(keys)){
                    return keys;
            }
        }
        return null;
    }

    
    public static void main(String[] args) {
        HashMap<String, String> tick = new HashMap<>();
        tick.put("chennai", "Bengalore");
        tick.put("goa","chennai");
        tick.put("mumbai", "delhi");
        tick.put("delhi", "goa");
        String start=getStart(tick);

        while(tick.containsKey(start)){
            System.out.print(start+"-->");
            start=tick.get(start);
        }
        System.out.println(start);
    }
}
