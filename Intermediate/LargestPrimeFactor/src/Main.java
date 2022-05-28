public class Main {
    public static void main(String[] args) {
        System.out.println(largestPrimeFactor(10));
        System.out.println(largestPrimeFactor(6936));
        System.out.println(largestPrimeFactor(1));
    }

    public static int largestPrimeFactor(int number){
        int largestPrime = 0;
        for(int i = 2; i <= number; i++){
            if(number % i == 0 && isPrime(i)) largestPrime = i;
        }
        return largestPrime;
    }

    public static boolean isPrime(int number){
        for(int i = 2; i <= Math.sqrt(number); i++){
            if(number % i == 0) return false;
        }
        return true;
    }
}