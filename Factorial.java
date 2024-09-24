import java.util.*;
public class Factorial {
    public static void main(String[] args){
        String vowels = "aeiou";
        String str[] = {"hello" , "aeiouhsss","he"};
        int max = Integer.MIN_VALUE;
        int val = 1;
        for (int i = 0; i < str.length; i++) {
            int count = 0;
            for(int j = 0;j<str[i].length();j++){
                if(vowels.indexOf(str[i].charAt(j))==-1){
                    count++;
                }
            }
            max = Math.max(max, count);
        }
        for(int i = 1;i<=max;i++){ 
            val = val*i;
        }
        System.out.println(val);
    }
}
