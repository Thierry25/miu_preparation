public class ReverseInt {

    public static void main(String[] args){
        System.out.println(reverseNumber(-123));
    }

    public static int reverseNumber(int number){
        int originalNumber = number;
        int value = 0;
        if(number < 0) number *= -1;
        while(number > 0){
            int remainder = number % 10;
            value = value * 10 + remainder;
            number /= 10;
        }
        return originalNumber >= 0 ? value : value * -1;
    }
}
