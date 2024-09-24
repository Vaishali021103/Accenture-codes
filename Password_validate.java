class Password_validate{
    public static void main(String[] args){
        String str = "aaA";
        boolean ans =  validate(str);
        System.out.println(ans);
    }

    private static boolean validate(String str) {
        int cap = 0;
        int num = 0;
        if(str.length()<=4){
            return false;
        }
        if(str.charAt(0)>=48  && str.charAt(0)<=57){
            return false;
        }
        for(int i = 0;i<str.length();i++){
            char ch = str.charAt(i);
            if(ch==' ' || ch=='/'){
                return false;
            }
            if(ch>=48 || ch<=57){
                num = 1;
            }
            if(ch>=65 || ch<=90){
                cap = 1;
            }
        }
        if(num==0 || cap==0){
            return false;
        }
        return true;
    }
}
        