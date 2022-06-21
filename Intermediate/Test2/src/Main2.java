public class Main2 {
    public static void main(String[] args) {
        System.out.println(is121Array(new int[]{1,2,1}));
        System.out.println(is121Array(new int[]{1,1,2,2,2,1,1}));
        System.out.println(is121Array(new int[]{1,1,2,2,2,1,1,1}));
        System.out.println(is121Array(new int[]{1,1,2,1,2,1,1,1}));
        System.out.println(is121Array(new int[]{1,1,1,2,2,2,1,1,1,3}));
        System.out.println(is121Array(new int[]{1,1,1,1,1,1}));
        System.out.println(is121Array(new int[]{2,2,2,1,1,1,2,2,2,1,1}));
        System.out.println(is121Array(new int[]{1,1,1,2,2,2,1,1,2,2}));
        System.out.println(is121Array(new int[]{2,2,2}));
    }

    public static int is121Array(int[] arr){
        if(arr[0] != 1) return 0;
        int length = arr.length -1;
        if(arr[length] != 1 && arr[length] != 2) return 0;
        int startOneCount = 0;
        int endOneCount = 0;
        int i = 0;
       int end = arr.length - 1;
        for(int j = 1; j < arr.length; j++){
            if(arr[i] == 1){
                startOneCount += 1;
                i++;
            }
            while(arr[end] == 1){
                endOneCount += 1;
                if(end == 0) break;
                end--;
            }
        }
        while(i <= end){
            if(arr[i] != 2) return 0;
            i++;
        }
       // System.out.println(end);
        return (startOneCount == endOneCount) ? 1: 0;
    }

}
