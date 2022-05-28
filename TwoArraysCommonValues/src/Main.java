import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(getCommonValue(new int[]{1, 8, 3, 2}, new int[]{4, 2, 6, 1})));
        System.out.println(Arrays.toString(getCommonValue(new int[]{1, 8, 3, 2, 6}, new int[]{2, 6, 1})));
        System.out.println(Arrays.toString(getCommonValue(new int[]{1, 3, 7, 9}, new int[] {7, 1, 9, 3})));
        System.out.println(Arrays.toString(getCommonValue(new int[]{1, 2},  new int[]{3, 4})));
        System.out.println(Arrays.toString(getCommonValue(new int[]{}, new int[]{1, 2, 3})));
        System.out.println(Arrays.toString(getCommonValue(new int[]{1, 2}, new int[]{})));
        System.out.println(Arrays.toString(getCommonValue(new int[]{1, 2}, null)));
        System.out.println(Arrays.toString(getCommonValue(null, new int[]{})));
        System.out.println(Arrays.toString(getCommonValue(null, null)));
    }
    // Brute-force (0n2)
    public static int[] getCommonValue(int[] first, int[] second){
        if(first == null || second == null) return null;
        if(first.length == 0 || second.length == 0) return new int[]{};
        int[] temp = new int[Math.min(first.length, second.length)];
        int k = 0;
        for(int num : first){
            for(int num1 : second){
                if(num == num1) temp[k++] = num;
            }
        }
        int[] arr = new int[k];
        System.arraycopy(temp, 0 , arr, 0, arr.length);
        return arr;
    }
}