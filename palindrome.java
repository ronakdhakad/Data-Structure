public class palindrome {
    public static void main(String[] args) {
        String p="ronakanor";
        int left=0;
        int right=p.length()-1;
        Boolean check=true;
        while(left<right){
            if(p.charAt(right)!=p.charAt(left)){
                check =false;
                break;
            }
            left++;
            right--;        }
        if(check)
            System.out.println(p+" "+"is palindrome");
        else
            System.err.println(p+" is not palindrome");
    }
}
