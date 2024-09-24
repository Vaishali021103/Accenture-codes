public class hr_format {
    public static void main(String[] args){
        int x = 4;
        int y = 4;
        int result = x*y;
        int ans = result%12; //4
        if(ans==0){
            System.out.println(12);
        }
        else{
            System.out.println(ans);
        }
    }
}
