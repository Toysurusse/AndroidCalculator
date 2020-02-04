package com.first.values;

public enum Var {

    ZERO("0", "0",0), UN("1", "1",1), DEUX("2", "2",2),
    TROIS("3", "3",3), QUATRE("4", "4",4), CINQ("5", "5",5),
    SIX("6", "6",6), SEPT("7", "7",7), HUIT("8", "8",8),
    NEUF("9", "9",9);

    private final CharSequence c;
    private final String str;
    private final int num;


    private Var(CharSequence c, String str, int num){
        this.c = c;
        this.str = str;
        this.num = num;
    }

    public CharSequence getC() {
        return c;
    }

    public String getStr() {
        return str;
    }

    public int getNum() {
        return num;
    }
}
