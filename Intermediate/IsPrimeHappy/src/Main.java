public class Main {
    public static void main(String[] args) {
        System.out.println(isPrimeHappy(5));
        System.out.println(isPrimeHappy(25));
        System.out.println(isPrimeHappy(32));
        System.out.println(isPrimeHappy(8));
        System.out.println(isPrimeHappy(2));
    }

    public static int isPrimeHappy(int n){
        if(n <= 2) return 0;
        int primeSum = 0;
        for(int i = 2; i < n; i++){
            if(isPrime(i)){
                primeSum += i;
            }
        }
        return (primeSum % n== 0) ? 1: 0;
    }

    public static boolean isPrime(int n){
        for(int i =2; i <= Math.sqrt(n); i++){
            if(n % i == 0) return false;
        }
        return true;
    }

}