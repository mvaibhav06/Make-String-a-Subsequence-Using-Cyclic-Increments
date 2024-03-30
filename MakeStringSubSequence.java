import java.util.List;

public class MakeStringSubSequence {
    public static boolean canMakeSubsequence(String str1, String str2) {
        List<Character> temp = List.of('a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z');
        char[] inp = str1.toCharArray();
        int j = 0;

        for(int i=0; i<inp.length; i++){
            char ch = inp[i];
            int index = (temp.indexOf(ch)+1)%26;
            if(str2.charAt(j) == ch){
                j++;
            }else if(temp.get(index) == str2.charAt(j)){
                j++;
            }
            if(j == str2.length()) return true;
        }
        if(j==str2.length()) return true;
        return false;
    }

    public static void main(String[] args) {
        System.out.println(canMakeSubsequence("dm","e"));
    }
}
