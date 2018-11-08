package org.pursuit;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Algorithms implements DataStructures {
    @Override
    public char[] stringToCharArray(String word) {
        char[] charArray = new char[word.length()];
        for (int x = 0; x < word.length(); x++){
            charArray[x] = word.charAt(x);
        }
        return charArray;
    }

    @Override
    public ArrayList<Integer> multiplicationTableList(int number) {
        ArrayList<Integer> multiples = new ArrayList<>();
        for (int x = 0; x < 11; x++){
            multiples.add(x * number);
        }
        return multiples;
    }

    @Override
    public HashMap<String, Integer> wordLength(String[] wordArray) {
        HashMap<String, Integer> map = new HashMap<>();
        for (int x = 0; x < wordArray.length;x++ ){
            map.put(wordArray[x], wordArray[x].length());
        }
        return map;
    }

    @Override
    public HashSet<Character> uniqueCharacters(String word) {
        HashSet<Character> set = new HashSet<>();
        for(int x = 0; x < word.length(); x++){
            if (!set.contains(word.charAt(x))){
                set.add(word.charAt(x));
            }
        }
        return set;
    }
}
