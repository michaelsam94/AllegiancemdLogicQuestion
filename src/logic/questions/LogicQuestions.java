/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logic.questions;

import java.util.Arrays;

/**
 *
 * @author PAM-Android
 */
public class LogicQuestions {
    
    public static String reorderStringManual(String unsorted){
        StringBuilder sb = new StringBuilder(unsorted);
        for(int i=0;i<sb.length();i++){
            for(int j=i+1;j<sb.length();j++){
                if(sb.charAt(i) > sb.charAt(j)){
                    char c = sb.charAt(i);
                    sb.setCharAt(i, sb.charAt(j));
                    sb.setCharAt(j, c);
                }
            }
        }
        return sb.toString();
    }
    
    public static String reorderString(String unsorted){
        char[] unsortedChars  = unsorted.toCharArray();
        Arrays.sort(unsortedChars);
        String sorted = new String(unsortedChars);
        return sorted;
    }
    
    public static int countConst(String word){
        int count = 0;
        for(int i=0;i<word.length();i++){
            if(word.charAt(i)!='a'&&word.charAt(i)!='e'
                    &&word.charAt(i)!='i'&&word.charAt(i)!='o'
                    &&word.charAt(i)!='u'&&word.charAt(i)!='A'
                    &&word.charAt(i)!='E'&&word.charAt(i)!='I'
                    &&word.charAt(i)!='O'&&word.charAt(i)!='U'){
                count++;
            }
        }
        return count;
    }
    

    public static void main(String[] args) {
        System.out.println(reorderString("DRRA"));
        System.out.println(reorderStringManual("ZDRRA"));
        System.out.println(countConst("hungry"));
    }
    
}
