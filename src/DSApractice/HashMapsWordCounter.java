package DSApractice;

import java.util.HashMap;
import java.util.Map;

public class HashMapsWordCounter {
    public static void main(String[] args) {
        String s = "java is fun java is good for brain and for play";
        String[] word = s.split(" ");

        HashMap<String, Integer> hm = new HashMap<>();
        for (int i = 0; i < word.length; i++) {
            if (hm.containsKey(word[i])){
                hm.put(word[i], hm.get(word[i])+1);
            }
            else{
                hm.put(word[i], 1);

            }

        }
        for(Map.Entry entry: hm.entrySet() )
        {
            System.out.println(entry.getKey()+"  "+ entry.getValue());
        }
    }
}
