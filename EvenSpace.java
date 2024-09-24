import java.util.*;
public class EvenSpace{
    public static void main(String[] args){
        String[] str = {"", "  hell o wor  ld"};
        String word1 = str[0];
        String word2 = str[1];
        int count1 = 0;
        int count2 = 0;
        for(int i = 0;i<word1.length();i++){
            if(word1.charAt(i)==' '){
                count1++;
            }
        }
        for(int i = 0;i<word2.length();i++){
            if(word2.charAt(i)==' '){
                count2++;
            }
        }
        int ans = Math.abs(count1-count2);
        if(ans%2==0){
            System.out.println("even"+ans);
        }else{
            System.out.println("odd"+ans);
        }
    }
}