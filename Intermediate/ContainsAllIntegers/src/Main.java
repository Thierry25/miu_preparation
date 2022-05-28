public class Main {
    public static void main(String[] args) {
        System.out.println(isSequencedArray(new int[]{1,2,3,4,5}, 1, 5));
        System.out.println(isSequencedArray(new int[]{1,3,4,2,5}, 1, 5));
        System.out.println(isSequencedArray(new int[]{-5, -5, -4, -4, -4, -3, -3, -2, -2, -2}, -5, -2));
        System.out.println(isSequencedArray(new int[]{0, 1, 2, 3, 4, 5}, 1, 5));
        System.out.println(isSequencedArray(new int[]{1,2,3,4}, 1, 5));
        System.out.println(isSequencedArray(new int[]{1,2,5}, 1, 5));
        System.out.println(isSequencedArray(new int[]{5,4,3,2,1}, 1, 5));
    }

    public static int isSequencedArray(int[] arr, int start, int end){
        if(arr[0] != start || arr[arr.length -1] != end) return 0;
        for(int i = 0; i < arr.length - 1; i++){
            if(arr[i] != arr[i + 1] && arr[i] + 1 != arr[i + 1]) return 0;
        }
        return 1;
    }
}