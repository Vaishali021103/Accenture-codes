public class Square {
    public static void main(String[] args){
        int x1 = 1;
        int x2 = 3;
        int y1 = 2;
        int y2 = 4;

        int x3 = x1;
        int y3 = y2;
        int x4 = x2;
        int y4 = y1; 

        int diff1 = Math.abs(x2-x3);
        int diff2 = Math.abs(y2-y4);
        int diff3 = Math.abs(x4-x1);
        int diff4 = Math.abs(y3-y1);
        if(diff1==diff2 && diff1==diff3 && diff1==diff4){
            System.out.println("true");
        }else{
            System.out.println("false");
        }
    }
}
