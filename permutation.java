public class permutation {
    public static void main(String[] args){
        String str = "CDF";
        String vowels = "AEIOU";
        int count = 0;
        for(int i = 0;i<str.length();i++){
            if(vowels.indexOf(str.charAt(i))==-1){
                count++;
            }
        }
        int val = 1;
        for(int i = 1;i<=count;i++){
            val = val*i;
        }
        System.out.println(val);
    }
}
