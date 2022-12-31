package algorithm;

import org.junit.Assert;
import org.junit.Test;

public class UnitTestSorting {

    /*
      This class is about Unit testing for Sorting Algorithm.
     */
//    public static void main(String[] args) {
//        int [] unSortedArray = {6,9,2,5,1,0,4};
//        int [] sortedArray =   {0,1,2,4,5,6,9};
//        //Create Sort object
//        Sort sort = new Sort();
//        //apply unsorted array to selectionSort.
//        sort.selectionSort(unSortedArray);
//        //verify if the unsorted array is sorted by the selection sort algorithm.
//        try {
//            Assert.assertEquals(sortedArray, unSortedArray);
//        }catch(Exception ex){
//            ex.getMessage();
//        }

    //Now implement Unit test for rest of the soring algorithm...................below
    @Test
    public void testInsertion(){
        int [] unSortedArray = {6,9,2,5,1,0,4};
        int [] sortedArray =   {0,1,2,4,5,6,9};
        algorithm.Sort s=new algorithm.Sort();
        int[]res=s.insertionSort(unSortedArray);
//             for (int i =0 ;i < res.length;i++){
//                 System.out.println(res[i]);
//             }
        Assert.assertArrayEquals(sortedArray,res);
        System.out.println("test passed ");

    }
    @Test
    public void testInsertion1(){
        int [] unSortedArray = {6,9,2,5,1,0,4};
        int [] sortedArray =   {0,2,1,4,5,6,9};
        algorithm.Sort s=new algorithm.Sort();
        int[]res=s.insertionSort(unSortedArray);
//             for (int i =0 ;i < res.length;i++){
//                 System.out.println(res[i]);
//             }
        Assert.assertArrayEquals(sortedArray,res);
        System.out.println("test passed ");

    }
    @Test
    public void testSelction(){
        int [] unSortedArray = {6,9,2,5,1,0,4};
        int [] sortedArray =   {0,2,1,4,5,6,9};
        algorithm.Sort s=new algorithm.Sort();
        int[]res=s.selectionSort(unSortedArray);
//             for (int i =0 ;i < res.length;i++){
//                 System.out.println(res[i]);
//             }
        Assert.assertArrayEquals(sortedArray,res);
        System.out.println("test passed ");

    }
    @Test
    public void testSelection1(){
        int [] unSortedArray = {6,9,2,5,1,0,4};
        int [] sortedArray =   {0,1,2,4,5,6,9};
        algorithm.Sort s=new algorithm.Sort();
        int[]res=s.selectionSort(unSortedArray);
//             for (int i =0 ;i < res.length;i++){
//                 System.out.println(res[i]);
//             }
        Assert.assertArrayEquals(sortedArray,res);
        System.out.println("test passed ");

    }
    @Test
    public void testHeapSort(){
        int [] unSortedArray = {6,9,2,5,1,0,4};
        int [] sortedArray =   {0,8,2,4,5,6,9};
        algorithm.Sort s=new algorithm.Sort();
        int[]res=s.heapSort(unSortedArray);
//             for (int i =0 ;i < res.length;i++){
//                 System.out.println(res[i]);
//             }
        Assert.assertArrayEquals(sortedArray,res);
        System.out.println("test passed ");

    }
    @Test
    public void testHeapSort1(){
        int [] unSortedArray = {6,9,2,5,1,0,4};
        int [] sortedArray =   {0,1,2,4,5,6,9};
        algorithm.Sort s=new algorithm.Sort();
        int[]res=s.heapSort(unSortedArray);
//             for (int i =0 ;i < res.length;i++){
//                 System.out.println(res[i]);
//             }
        Assert.assertArrayEquals(sortedArray,res);
        System.out.println("test passed ");

    }
    @Test
    public void testShellSort(){
        int [] unSortedArray = {6,9,2,5,1,0,4};
        int [] sortedArray =   {0,1,2,4,5,6,9};
        algorithm.Sort s=new algorithm.Sort();
        int[]res=s.shellSort(unSortedArray);
//             for (int i =0 ;i < res.length;i++){
//                 System.out.println(res[i]);
//             }
        Assert.assertArrayEquals(sortedArray,res);
        System.out.println("test passed ");

    }
    @Test
    public void testShellSort1(){
        int [] unSortedArray = {6,9,2,5,1,0,4};
        int [] sortedArray =   {0,1,2,4,15,6,9};
        algorithm.Sort s=new algorithm.Sort();
        int[]res=s.shellSort(unSortedArray);
//             for (int i =0 ;i < res.length;i++){
//                 System.out.println(res[i]);
//             }
        Assert.assertArrayEquals(sortedArray,res);
        System.out.println("test passed ");

    }
    @Test
    public void testbucketSort(){
        int [] unSortedArray = {6,9,2,5,1,0,4};
        int [] sortedArray =   {0,1,2,4,15,6,9};
        algorithm.Sort s=new algorithm.Sort();
        int[]res=s.bucketSort(unSortedArray);
//             for (int i =0 ;i < res.length;i++){
//                 System.out.println(res[i]);
//             }
        Assert.assertArrayEquals(sortedArray,res);
        System.out.println("test passed ");

    }
    @Test
    public void testbucketSort1(){
        int [] unSortedArray = {6,9,2,5,1,0,4};
        int [] sortedArray =   {0,1,2,4,5,6,9};
        algorithm.Sort s=new algorithm.Sort();
        int[]res=s.bucketSort(unSortedArray);
//             for (int i =0 ;i < res.length;i++){
//                 System.out.println(res[i]);
//             }
        Assert.assertArrayEquals(sortedArray,res);
        System.out.println("test passed ");

    }







}