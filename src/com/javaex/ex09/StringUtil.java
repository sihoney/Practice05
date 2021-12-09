package com.javaex.ex09;

public class StringUtil {
    
    public static String concatString(String[] arr){
       
        //메소드 내용작성
       String str = "";
       
       for(int i = 0; i < arr.length; i++) {
    	   str += arr[i];
       }
       
       return str;
    }

}
