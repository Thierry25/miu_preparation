public class CharacterCount {
    public static void main(String[] args) {
        System.out.println(characterCount("lolllo", 'l'));
    }

    public static int characterCount(String s, char character){
        int count = 0;
        for(char c : s.toCharArray()){
            if(c == character) count += 1;
        }
        return count;
    }
}
