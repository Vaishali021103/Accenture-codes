import java.util.*;
class MaximumProduct{
    public static void main(String[] args) {
        int[] arr = {11,8,10,11,7,2,1};
        int n = arr.length;
        int[] val = new int[2];
        int x = 0;
        int y = 0;
        int max = Integer.MIN_VALUE;
        int prod = 0;
        Set<Integer> set = new HashSet<>();
        for(int i = 0; i < n; i++){
            set.add(arr[i]);
        }
        for(int i = 0;i<n;i++){
            x = arr[i];
            y = 18 - x;
            if(set.contains(y)){
                if(x>y){
                    prod = x*y;
                    max = Math.max(prod,max);
                    if(prod==max){
                        val[0] = x;
                        val[1] = y;
                    }
                }
            }
            
        }
        for(int i = 0;i<2;i++){
            System.out.println(val[i]);
        }
    }
}