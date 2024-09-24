import java.util.*;
public class Count{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int count = Integer.MIN_VALUE;

        String[] words = str.split("\\.");
        for(int i = 0;i<words.length;i++){
            int max = words[i].length(); //4
            count = Math.max(count, max); //3 (3,4) 4
        }
        System.out.println(count);
    }
}