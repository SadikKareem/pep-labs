import java.security.Key;
import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.annotation.JacksonInject.Value;

public class MostCommonCharacter {
    /**
     * Find the most common character in str.
     * You could use a HashMap that maps a Character key to an Int value to represent how many times a Character has
     * been spotted.
     * @param str A String.
     * @return the most common character within str.
     */
    public char recurringChar(String str) {
        Map<Character, Integer> countChar = new HashMap<>();
        for(char c : str.toCharArray()){
            if(countChar.containsKey(c)){
                //increment countChar for everytime char c is found in the string.
                countChar.put(c, countChar.getOrDefault(c, 0)+1);
            }else{
                countChar.put(c, 1);
            }

        }   
        char MostCommonCharacter = ' ';
        int maxCount = 0;
        for(Map.Entry<Character, Integer>entry : countChar.entrySet()){
            if(entry.getValue()> maxCount){
                MostCommonCharacter = entry.getKey();
                maxCount = entry.getValue();
            }
        }

        return MostCommonCharacter;
    }
}
