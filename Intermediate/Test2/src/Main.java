public class Main {
    public static void main(String[] args) {
        System.out.println(sameNumberOfFactors(-6,21));
        System.out.println(sameNumberOfFactors(6,21));
        System.out.println(sameNumberOfFactors(8,12));
        System.out.println(sameNumberOfFactors(23,97));
        System.out.println(sameNumberOfFactors(0,1));
        System.out.println(sameNumberOfFactors(0,0));
    }

    public static int sameNumberOfFactors(int n1, int n2){
        if(n1 == n2) return 1;
        if(n1 < 0 || n2 < 0) return -1;
        int n1Factors = numberOfFactors(n1);
        int n2Factors = numberOfFactors(n2);
        return n1Factors == n2Factors ? 1 : 0;
    }

    public static int numberOfFactors(int n){
        int count = 0;
        for(int i = 1; i <= n; i++){
            if(n % i == 0){
                count += 1;
            }
        }
        return count;
    }
}