public class Main {
    public static void main(String[] args) {
        System.out.println(encodeArray(new int[]{0, -3, 0, -4, 0}));
        System.out.println(encodeArray(new int[]{-1, 5, 8, 17, 15}));
        System.out.println(encodeArray(new int[]{1, 5, 8, 17, 15}));
        System.out.println(encodeArray(new int[]{111, 115, 118, 127, 125}));
        System.out.println(encodeArray(new int[]{1, 1}));
    }

    public static int encodeArray(int[] arr){
        if(arr.length == 0) return -1;
        String value = "";
        int i = 0;
        for(int j = 1; j < arr.length; j++){
            int val = Math.abs(arr[i] - arr[j]);
            i++;
            value += val;
        }
        int returnVal = Integer.parseInt(value);
        return arr[0] >= 0 ? returnVal : returnVal * -1;
    }
}