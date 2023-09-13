package com.splineguy.junit.quotent;

public class MyClass {

    public int quotent(int x, int y){
        if (y == 0){
            throw new IllegalArgumentException("Y cannot be zero");
        }
        return x/y;
    }

    public String truncateAInFirst2Positions(String str)
    {
        if (str.length() <=2){
            return str.replaceAll("A","");
        }
        String first2Chars = str.substring(0,2);
        String stringMinusFirst2Chars = str.substring(2);
        return first2Chars.replaceAll("A","") + stringMinusFirst2Chars;

    }

    public boolean areFirstAndLastTwoCharacterstheSame(String str){
        if (str.length()<=1)
            return false;
        if (str.length() == 2)
            return true;
        String first2Chars = str.substring(0,2);
        String last2Chars = str.substring(str.length()-2);
        return first2Chars.equals(last2Chars);
    }

}
