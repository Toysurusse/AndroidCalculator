package com.first.values;

public final class utilitiesStatic {

    public static int charAt(String str, Character character){
        //initialized the counter to 0
        int counter = 0;

        for (int i=0; i<=str.length()-1; i++) {
            if(str.charAt(i) == character) {
                //increasing the counter value at each occurrence of 'B'
                break;
            }
            counter++;
        }
        return counter;
    }
}
