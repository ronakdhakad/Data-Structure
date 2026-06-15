public class Anagram {
    public static void main(String[] args) {
        String s1 = "care";
        String s2 = "race";
        int count=0;
        if(s1.length()!=s2.length()){
            System.out.println("String are not anagram");
        }else{
            for(int i=0;i<s1.length();i++){
                for(int j=0;j<s2.length();j++){
                    if(s1.charAt(i)==s2.charAt(j)){
                        count++;
                    }
                }
            }
        }
        System.out.println(count);
        System.out.println(s1.length());
        if(count==s1.length())
            System.out.println("Strings are anagram");
        else
            System.out.println("Strings are not a anagram");
    }
}
