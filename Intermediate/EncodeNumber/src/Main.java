import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(encodeNumber(6936)));
        System.out.println(Arrays.toString(encodeNumber(2)));
        System.out.println(Arrays.toString(encodeNumber(6)));
        System.out.println(Arrays.toString(encodeNumber(14)));
        System.out.println(Arrays.toString(encodeNumber(24)));
        System.out.println(Arrays.toString(encodeNumber(1200)));
        System.out.println(Arrays.toString(encodeNumber(1)));
        System.out.println(Arrays.toString(encodeNumber(-18)));
    }

    public static int[] encodeNumber(int number){
        if(number <= 1) return null;
        int[] temp = new int[100];
        int k = 0;
        for(int i = 2; i <= number; i++){
            if(number % i == 0 && isPrime(i)) {
                while(number % i == 0){
                    temp[k++] = i;
                    number /= i;
                }
            }
        }
        int[] primes = new int[k];
        System.arraycopy(temp, 0, primes, 0, primes.length);
        return primes;
    }

    public static boolean isPrime(int number){
        for(int i = 2; i <= Math.sqrt(number); i++){
            if(number % i == 0) return false;
        }
        return true;
    }
}