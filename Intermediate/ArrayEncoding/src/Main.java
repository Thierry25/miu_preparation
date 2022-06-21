public class Main {
    public static void main(String[] args) {
        System.out.println(encodeArray(new int[]{0, -3, 0, -4, 0}));
        System.out.println(encodeArray(new int[]{-1, 5, 8, 17, 15}));
        System.out.println(encodeArray(new int[]{1, 5, 8, 17, 15}));
        System.out.println(encodeArray(new int[]{111, 115, 118, 127, 125}));
        System.out.println(encodeArray(new int[]{1, 1}));
    }

    public static int encodeArray(int[] arr) {
        if (arr.length < 2) return Integer.MIN_VALUE;
        int firstNum = Math.abs(arr[0] - arr[1]);
        String val = String.valueOf(firstNum);
        for (int i = 1; i < arr.length - 1; i++) {
            val += Math.abs(arr[i] - arr[i + 1]);
        }
        return arr[0] >= 0 ? Integer.parseInt(val) : Integer.parseInt(val) * -1;
    }
}