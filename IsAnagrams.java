package com.mfs;

import java.util.HashMap;
import java.util.Scanner;

/*
    @Author muhammet feyzi sağlam
    @Date 19.02.2022
 */

public class IsAnagrams {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println((ret) ? "Anagrams" : "Not Anagrams");

    }
    static boolean isAnagram(String a, String b) {
        // Complete the function

        /* base code */
        // str1 = anagramm
        // str2 = marganaa

        char[] ch1 = a.toLowerCase().toCharArray();
        char [] ch2 = b.toLowerCase().toCharArray();
        b= b.toLowerCase();

        HashMap<Character, Integer> Amap = new HashMap<>();
        HashMap<Character, Integer> Bmap = new HashMap<>();
        // key a value 4 a 0 a 1 a 2
        int count = 0;

        for(int i = 0 ; i<a.length();i++){
            // string ilk elamnı map de var mı yoksa put var get et ++ put
            if(Amap.containsKey(a.charAt(i))){
                //Amap.get(a.charAt(i)).intValue()++;
                Amap.merge(a.charAt(i), 1, Integer::sum);
            }else{
                Amap.put(a.charAt(i),1);
            }
        }
        for(int i = 0 ; i<b.length();i++){
            // string ilk elamnı map de var mı yoksa put var get et ++ put
            if(Bmap.containsKey(b.charAt(i))){
                //Bmap.get(b.charAt(i)).intValue()++;
                Bmap.merge(b.charAt(i), 1, Integer::sum);
            }else{
                Bmap.put(b.charAt(i),1);
            }
        }
        return  Bmap.equals(Amap);

    }
}
