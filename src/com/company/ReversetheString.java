package com.company;

public class ReversetheString {

    public static String specialReverseString(String str) {

        StringBuilder reversed = new StringBuilder(str.replaceAll("\\s+", "").toLowerCase()).reverse();

       for (int i = 0; i < str.length() ; i++) {
            char c = str.charAt(i);
            if (Character.isSpaceChar(c)){
                reversed.insert(i,' ');
            }else if (Character.isUpperCase(c)){
                char lower = reversed.charAt(i);
                reversed.setCharAt(i,Character.toUpperCase(lower));
            }
        }
        System.out.println(reversed);
        return reversed.toString();
    }
}
