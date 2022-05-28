public class Main {
    public static void main(String[] args) {
       // Test cases
        System.out.println(reverseNumber(1234));
        System.out.println(reverseNumber(12005));
        System.out.println(reverseNumber(1));
        System.out.println(reverseNumber(1000));
        System.out.println(reverseNumber(0));
        System.out.println(reverseNumber(-12345));
    }

    public static int reverseNumber(int number){
        int originalNumber = number;
        if(number < 0) number *= -1;
        int reversed = 0;
        while(number > 0){
            reversed = reversed * 10 + number % 10;
            number /= 10;
        }
        return (originalNumber > 0) ? reversed : reversed * -1;
    }
}