public class CharacterFrequency {
    public static void main(String[] args) {

        String str = "programming";

        for(int i = 0; i < str.length(); i++) {

            int count = 1;
            boolean visited = false;

            for(int k = 0; k < i; k++) {
                if(str.charAt(i) == str.charAt(k)) {
                    visited = true;
                    break;
                }
            }

            if(visited)
                continue;

            for(int j = i + 1; j < str.length(); j++) {
                if(str.charAt(i) == str.charAt(j)) {
                    count++;
                }
            }

            System.out.println(str.charAt(i) + " : " + count);
        }
    }
}