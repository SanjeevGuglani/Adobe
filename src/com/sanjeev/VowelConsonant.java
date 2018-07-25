package com.sanjeev;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by Sanjeev Guglani
 */
public class VowelConsonant {

    private static final String BAD ="BAD";
    private static final String GOOD ="GOOD";
    private static final String MIXED ="MIXED";

    public static String typeOFString(String str){
        Set set = new HashSet<Character>();
        set.add('a');
        set.add('e');
        set.add('i');
        set.add('o');
        set.add('u');
        boolean vowel=set.contains(str.charAt(0));
        int vowelCount=0,consonantCount=0;
        for(int i=0;i<str.length();i++){
            System.out.println("char ="+str.charAt(i)+"===="+(str.charAt(i)=='?'));
            if(vowel && set.contains(str.charAt(i))){
                vowelCount++;
            }else if(!vowel && !set.contains(str.charAt(i)) && str.charAt(i)!='?'){
                consonantCount++;
            }else if(set.contains(str.charAt(i))){
                vowel=true;
                vowelCount =1;
                consonantCount =0;
            }else if(str.charAt(i)=='?'){
                vowelCount++;
                consonantCount++;
            }else {
                consonantCount = 1;
                vowel =false;
                vowelCount =0;
            }
            if(vowelCount>=5 || consonantCount>=3){
                if(str.charAt(i)=='?'){
                    return MIXED;
                }
                return BAD;
            }
        }
        return GOOD;
    }

    public static void main(String[] args) {
        //System.out.println(typeOFString("a?fafff")+" BAD ");
        System.out.println(typeOFString("??aa??")+"	MIXED");
        //System.out.println(typeOFString("abc")+"	GOOD");
        //System.out.println(typeOFString("aaa?aaafff")+" BAD");
        //System.out.println(typeOFString("aaaa?ff?aaa?aaa?fff")+"	BAD");
    }
}
