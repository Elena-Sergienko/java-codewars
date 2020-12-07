// 8 kyu
// Array plus array
// I'm new to coding and now I want to get the sum of two arrays...actually the sum of all their elements. I'll appreciate for your help.
// P.S. Each array includes only integer numbers. Output is a number too.

public class Array_plus_array {
    public static int arrayPlusArray(int[] arr1, int[] arr2) {
        int sum = 0;
        for (int i = 0; i < arr1.length; i++){
            sum+=arr1[i];
        }
        for(int i = 0; i < arr2.length; i++){
            sum+=arr2[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(arrayPlusArray(new int[]{1,2,3}, new int[]{4,5,6}));//21
    }
}
