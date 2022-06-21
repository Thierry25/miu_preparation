public class Main {
    public static void main(String[] args) {
        System.out.println(equivalentArrays(new int[]{0,1,2}, new int[]{2,0,1}));
        System.out.println(equivalentArrays(new int[]{0,1,2,1}, new int[]{2,0,1}));
        System.out.println(equivalentArrays(new int[]{2, 0, 1}, new int[]{0, 1,2,1}));
        System.out.println(equivalentArrays(new int[]{0,5,5,5,1,2,1}, new int[]{5,2,0,1}));
        System.out.println(equivalentArrays(new int[]{5,2,0,1}, new int[]{0,5,5,5,1,2,1}));
        System.out.println(equivalentArrays(new int[]{0,2,1,2}, new int[]{3,1,2,0}));
        System.out.println(equivalentArrays(new int[]{3,1,2,0}, new int[]{0,2,1,0}));
        System.out.println(equivalentArrays(new int[]{1,1,1,1,1,1}, new int[]{1,1,1,1,1,1,2}));
        System.out.println(equivalentArrays(new int[]{}, new int[]{2,0,1}));
        System.out.println(equivalentArrays(new int[]{}, new int[]{}));
    }

    public static int equivalentArrays(int[] arr1, int[] arr2){
        int val = 1;
        for (int num : arr1) {
            if (!contains(arr2, num)){
                val = 0;
                break;
            }
        }
        if(val == 1){
            for (int num : arr2) {
                if (!contains(arr1, num)){
                    val = 0;
                    break;
                }
            }
        }
        return val;
    }

    public static boolean contains(int[] arr, int i){
        boolean isThere = false;
        for(int num: arr){
            if(num == i){
                isThere = true;
                break;
            }
        }
        return isThere;
    }

}