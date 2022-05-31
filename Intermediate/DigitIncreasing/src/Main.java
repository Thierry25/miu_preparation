public class Main {
    public static void main(String[] args) {
        System.out.println(isDigitIncreasing(7));
        System.out.println(isDigitIncreasing(36));
        System.out.println(isDigitIncreasing(984));
        System.out.println(isDigitIncreasing(7404));
    }

    public static int isDigitIncreasing(int n){
        if(n <= 10) return 1;
        String temp = String.valueOf(n);
        int length = temp.length();
        int oneToTen = 1;
        String result = "";
        int sum = 0;
        while(oneToTen < 10){
            int totalLoop = 0;
            while(totalLoop < length){
                result += oneToTen;
                sum += Integer.parseInt(result);
                totalLoop += 1;
            }
            if(sum == n) return 1;
            sum = 0;
            result = "";
            oneToTen += 1;
        }
        return 0;
    }
}