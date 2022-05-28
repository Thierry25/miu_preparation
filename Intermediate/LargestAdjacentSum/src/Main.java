public class Main {
    public static void main(String[] args) {
        System.out.println(largestAdjacentSum(new int[]{1,2,3,4}));
        System.out.println(largestAdjacentSum(new int[]{18, -12, 9, -10}));
        System.out.println(largestAdjacentSum(new int[]{1,1,1,1,1,1,1,1,1,1,1,1,1}));
        System.out.println(largestAdjacentSum(new int[]{1,1,1,1,1,1,1,1,1,2,1,1,1,1}));
    }

    // Array will contain at least two elements
    public static int largestAdjacentSum(int[] arr){
        int sum = arr[0] + arr[1];
        for(int i = 1; i < arr.length - 1; i++) sum = Math.max(sum, arr[i] + arr[i + 1]);
        return sum;
    }
}