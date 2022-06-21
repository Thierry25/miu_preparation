public class Main {
    public static void main(String[] args) {
        System.out.println(decodeArray(new int[]{1}));
        System.out.println(decodeArray(new int[]{0, 1}));
        System.out.println(decodeArray(new int[]{-1, 0, 1}));
        System.out.println(decodeArray(new int[]{0, 1, 1, 1, 1, 1, 0, 1}));
        System.out.println(decodeArray(new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1}));
    }

    public static int decodeArray(int[] arr) {
        int count = 0;
        String value = "";
        for (int i = 0; i < arr.length; i++) {
            if (arr[0] < 0) i++;
            if (arr[i] == 0) {
                while (arr[i] == 0) {
                    count += 1;
                    if (i == arr.length - 1) break;
                    i++;
                }
                value += count;
                count = 0;
            } else value += 0;
        }
        return (arr[0] >= 0) ? Integer.parseInt(value) : Integer.parseInt(value) * -1;
    }
}