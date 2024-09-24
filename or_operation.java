public class or_operation{
    public static void main(String[] args){
        int[] num = {3,4,5,6};
        int res = 0;
        for(int i:num){
            res = res | i;
        }
        System.out.println(res);
    }
}