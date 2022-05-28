public class Main {
    public static void main(String[] args) {
        System.out.println(sumDifference(new int[]{1}));
        System.out.println(sumDifference(new int[]{1, 2}));
        System.out.println(sumDifference(new int[]{1, 2, 3}));
        System.out.println(sumDifference(new int[]{1, 2, 3, 4}));
        System.out.println(sumDifference(new int[]{3, 3, 4, 4}));
        System.out.println(sumDifference(new int[]{3, 2, 3, 4}));
        System.out.println(sumDifference(new int[]{4, 1, 2, 3}));
        System.out.println(sumDifference(new int[]{1, 1}));
        System.out.println(sumDifference(new int[]{}));
    }

    public static int sumDifference(int[] arr){
        int oddSum = 0;
        int evenSum = 0;
        for(int num : arr){
            if(num % 2 == 0) evenSum += num;
            else oddSum += num;
        }
        return oddSum - evenSum;
    }
}