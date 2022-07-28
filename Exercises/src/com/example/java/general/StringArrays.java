package com.example.java.general;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;


public class StringArrays {

    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> anagramas = new HashMap<>();
        for(String item : strs){

            char [] array = item.toCharArray();
            Arrays.sort(array);
            String sorted =  Arrays.toString(array);
            List<String> contains = anagramas.get(sorted) ;
            if(contains != null) {
                contains.add(item);
                anagramas.put(sorted,contains);
            }
            else{
                contains = new ArrayList<String>();
                contains.add(item);
                anagramas.put(sorted,contains);
            }
        }

        return anagramas.values().stream().map(x -> new ArrayList<>(x)).collect(Collectors.toList());
    }


        /*public static void main(String... args){
        Solution sol = new Solution();
        String []arg = {"eat","tea","tan","ate","nat","bat"};
        sol.groupAnagrams(arg);
    }*/
}
