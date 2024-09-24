public class Leaders {
    public static void main(String[] args) {
        int[] arr = {16, 17, 4, 3, 5, 2};
        int n = arr.length;
        int max = arr[n-1];
        int sum = arr[n-1];
        for(int i = n-1;i>=0;i--){
            if(arr[i]>max){
                max = arr[i];
                sum+=max;
            }
        }
        System.out.println(sum);
        return;
    }
}
