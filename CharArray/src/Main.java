import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        /* Test Cases Provided*/
        System.out.println(Arrays.toString(getCharArray(new char[]{'a', 'b', 'c'}, 0, 4)));
        System.out.println(Arrays.toString(getCharArray(new char[]{'a', 'b', 'c'}, 0, 3)));
        System.out.println(Arrays.toString(getCharArray(new char[]{'a', 'b', 'c'}, 0, 2)));
        System.out.println(Arrays.toString(getCharArray(new char[]{'a', 'b', 'c'}, 0, 1)));
        System.out.println(Arrays.toString(getCharArray(new char[]{'a', 'b', 'c'}, 1, 3)));
        System.out.println(Arrays.toString(getCharArray(new char[]{'a', 'b', 'c'}, 1, 2)));
        System.out.println(Arrays.toString(getCharArray(new char[]{'a', 'b', 'c'}, 1, 1)));
        System.out.println(Arrays.toString(getCharArray(new char[]{'a', 'b', 'c'}, 2, 2)));
        System.out.println(Arrays.toString(getCharArray(new char[]{'a', 'b', 'c'}, 2, 1)));
        System.out.println(Arrays.toString(getCharArray(new char[]{'a', 'b', 'c'}, 3, 1)));
        System.out.println(Arrays.toString(getCharArray(new char[]{'a', 'b', 'c'}, 1, 0)));
        System.out.println(Arrays.toString(getCharArray(new char[]{'a', 'b', 'c'}, -1, 2)));
        System.out.println(Arrays.toString(getCharArray(new char[]{'a', 'b', 'c'}, -1, -2)));
        System.out.println(Arrays.toString(getCharArray(new char[]{}, 0, 1)));
    }

    public static char[] getCharArray(char[] chars, int start, int len){
        if(chars.length == 0 || start + len > chars.length || start < 0 || len < 0) return null;
        char[] newArr = new char[len];
        int k = 0;
        int count = 0;
        while(count < len){
            newArr[k++] = chars[start++];
            count++;
        }
        return newArr;
    }
}