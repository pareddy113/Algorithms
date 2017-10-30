package me.avinashreddyp.algorithms;

import java.util.HashMap;

public class String_Bigrams {

    public static void main(String[] args) {
        String string = new String("The house was old but it was old not just because the house was built in the 60s");
        String[] array = string.split(" ");
        HashMap<String, Integer> map = new HashMap<>();
        String doubleString = new String("");
        for(int i = 0; i < array.length - 1; i++){
            doubleString = array[i] + ' ' + array[i+1];
            if(!(map.containsKey(doubleString))){
                map.put(doubleString, 1);
            }
            else{
                map.put(doubleString, map.get(doubleString)+1);
            }
            doubleString = "";
        }
        System.out.println(map.toString());
    }
}
