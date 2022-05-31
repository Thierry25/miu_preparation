public class Main {
    public static void main(String[] args) {
        System.out.println(isZeroPlentiful(new int[]{0,0,0,0,0}));
        System.out.println(isZeroPlentiful(new int[]{1,2,0,0,0,0,2,-18,0,0,0,0,0,12}));
        System.out.println(isZeroPlentiful(new int[]{0,0,0,0,0,1,0,0,0,0,8,0,0,0,0,0,0}));
        System.out.println(isZeroPlentiful(new int[]{1,2,3,4}));
        System.out.println(isZeroPlentiful(new int[]{1,0,0,0,2,0,0,0,0}));
        System.out.println(isZeroPlentiful(new int[]{0}));
    }

    public static int isZeroPlentiful(int[] arr){
        int count = 0;
        int zeroCount = 0;
        for(int number: arr){
            if(count == 4){
                count = 0;
                zeroCount += 1;
            }
            if(number == 0){
                count += 1;
            }else count = 0;
        }
        return zeroCount;
    }
}