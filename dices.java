public class dices {
    public static void main(String[] args){
        int[] dice1 = {1,2,3,4,5,6};
        int[] dice2 = {1,2,3,4,5,6};
        int sum = 12;
        int count = 0;
        for(int i = 0;i<6;i++){
            for(int j = 0;j<6;j++){
                if((dice1[i]+dice2[j])==sum){
                    count++;
                }
            }
        }
        System.out.println(count);
        return;
    }
}
