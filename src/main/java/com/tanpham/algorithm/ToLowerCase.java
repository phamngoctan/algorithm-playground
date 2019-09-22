package com.tanpham.algorithm;

public class ToLowerCase {

    public static String proceed(String str) {
        char[] charArray = str.toCharArray();
        for (int i = 0; i < str.length(); i++) {
            if (charArray[i] >= 'A' && charArray[i] < 'a') {
                charArray[i] = (char) (charArray[i] + 32);
            }
        }
        return new String(charArray);
//        return str.toLowerCase();
    }
    
    public static void main(String[] args) {
        System.out.println('A' - 'a');
        System.out.println((int)'A');
        System.out.println((int)'a');
        System.out.println((int)'T');
        System.out.println((int)'P');
        //"PiTAs"
    }
    
}
