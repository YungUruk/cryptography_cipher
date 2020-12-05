import java.util.HashMap;
import java.util.Map;

public class SimpleChange {
    public static Map<Character,Character> getKey(String clearText,String cipherText){
        Map<Character,Character> map= new HashMap<Character, Character>();
char arrClearText[]= clearText.toCharArray();
char arrCipherText[] = cipherText.toCharArray();
for (int i=0;i<clearText.length();i++){
    if(!map.containsKey(arrClearText[i])){
        map.put(arrClearText[i],arrCipherText[i]);
    }
}
return map;
    }
}
