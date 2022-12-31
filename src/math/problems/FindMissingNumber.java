package math.problems;

public class FindMissingNumber {

    //sort the array
    public static int[] sort(int[] arr) {
        int temp = 0;
        int pos = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;

    }
    // find the missing number
    public  static int findMissing(int array[]) {
        int i = 0 ;
        int[] ArraySort=sort(array);
        while(ArraySort[i]-ArraySort[i+1]==1) {
            i++;
        }
        return ArraySort[i]-1;
    }


    public static void main(String[] args) {
        /*
         * If n = 10, then array will have 9 elements in the range from 1 to 10.
         * For example {10, 2, 1, 4, 5, 3, 7, 8, 6}. One number will be missing in array (9 in this case).
         * Write java code to find the missing number from the array. Write static helper method to find it.
         */
        int[] array = new int[]{10, 2, 1, 4, 5, 3, 7, 8, 6};
        int res=findMissing(array);
        System.out.println(res);

        //  int miss=0;

    }
}