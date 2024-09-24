import java.util.*;
public class setvalue {
    public static void main(String[] args){
        String str = "thunderstorm";
        String[] arr = {"hunder","storm","tom"};
        int max = Integer.MIN_VALUE;
        Set<String> set = new HashSet<>();
        for(int i = 0;i<arr.length;i++){
            set.add(arr[i]);
        }
        for(int i = 0;i<str.length();i++){
            for(int j = i+1;j<str.length()-1;j++){
                String sub = str.substring(i,j);
                if(set.contains(sub)){
                    max = Math.max(max, sub.length());
                }
            }
        }
        System.out.println(max);
    }
}
