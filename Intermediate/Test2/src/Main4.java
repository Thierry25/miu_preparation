import java.util.Arrays;

public class Main4 {
    public static void main(String[] args){
        String[] arr = {"LOL", "HAHA", "FUNNY", "SCORE"};
        Integer[] fun = {1,2,3,4,5,6,7,8,9};
        reverseArray(arr);
        System.out.println(Arrays.toString(arr));
        reverseArray(fun);
        System.out.println(Arrays.toString(fun));

    }
    public static <E> void reverseArray(E[] arr){
        for(int i = 0, j = arr.length - 1; i < j; i++, j--){
            E temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }
}
