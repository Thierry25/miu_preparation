public class Main3 {
    public static void main(String[] args) {
        System.out.println(isSelfReferential(new int[]{2,0,0}));
        System.out.println(isSelfReferential(new int[]{0}));
        System.out.println(isSelfReferential(new int[]{1}));
        System.out.println(isSelfReferential(new int[]{1,2,1,0}));
        System.out.println(isSelfReferential(new int[]{2,0,2,0}));
        System.out.println(isSelfReferential(new int[]{3,2,1,1,0,0,0}));
        System.out.println(isSelfReferential(new int[]{4,2,1,0,1,0,0,0}));
        System.out.println(isSelfReferential(new int[]{5,2,1,0,0,1,0,0,0}));
        System.out.println(isSelfReferential(new int[]{6,2,1,0,0,0,1,0,0,0}));
    }

    public static int isSelfReferential(int[] a){
        int returnVal = 1;
        for(int i = 0 ; i < a.length; i++){
            int countVal = count(a, i);
            if(a[i] != countVal){
                returnVal = 0;
                break;
            }
        }
        return returnVal;
    }
    public static int count(int[] arr, int number){
        int count = 0;
        for(int n : arr){
            if(n == number) count += 1;
        }
        return count;
    }
}
