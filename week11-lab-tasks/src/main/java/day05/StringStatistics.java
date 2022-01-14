package day05;

import java.util.*;

public class StringStatistics {
    public int numberOfDifferentLetters(String text) {
        Set<Character> result = new HashSet<>();
        for (Character c: text.toCharArray()) {
            result.add(c);
        }
        return result.size();
    }

    public Map<Character, Integer> numberOfCharacters(String text) {
        Map<Character, Integer> result = new HashMap<>();
        for (Character c: text.toCharArray()) {
            if (!result.containsKey(c)) {
                result.put(c, 1);
            } else {
                result.put(c, result.get(c) + 1);
            }
        }
        return result;
    }
}
