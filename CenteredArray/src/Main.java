public class Main {
    public static void main(String[] args) {
        System.out.println(centeredArray(new int[]{1, 2, 3, 4, 5}));
        System.out.println(centeredArray(new int[]{3, 2, 1, 4, 5}));
        System.out.println(centeredArray(new int[]{3, 2, 1, 4, 1}));
        System.out.println(centeredArray(new int[]{1, 2, 3, 4}));
        System.out.println(centeredArray(new int[]{}));
        System.out.println(centeredArray(new int[]{10}));
    }

    public static int centeredArray(int[] arr){
        if(arr.length % 2 == 0) return 0;
        if(arr.length == 1) return 1;
        int index = arr.length / 2;
        for(int i = 0; i < arr.length; i++){
            if(i == index) i += 1;
            if(arr[i] <= arr[index]) return 0;
        }
        return 1;
    }
}