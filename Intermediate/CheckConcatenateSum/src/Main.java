public class Main {
    public static void main(String[] args) {
        System.out.println(checkConcatenatedSum(198, 2));
        System.out.println(checkConcatenatedSum(198, 3));
        System.out.println(checkConcatenatedSum(2997, 3));
        System.out.println(checkConcatenatedSum(2997, 2));
        System.out.println(checkConcatenatedSum(13332, 4));
        System.out.println(checkConcatenatedSum(9, 1));
    }

    public static int checkConcatenatedSum(int number, int catlen){
        // checkConcatenatedSum(198, 2) => 11 + 99 + 88 =>
        int originalNumber = number;
        int result = 0;
        while(number > 0){
            result += getValue(number % 10, catlen);
            number /= 10;
        }
        return (result == originalNumber) ? 1 : 0;
    }

    public static int getValue(int number, int exponent){
        if(exponent == 1) return number;
        int sum = 0;
        while(exponent >= 0){
            sum += number * (int) Math.pow(10, exponent - 1);
            exponent -= 1;
        }
        return sum;
    }
}