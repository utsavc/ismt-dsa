package sorts;

import java.util.*;

public class RadixSort {

    public static void main(String[] args) {

        int size;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter size of array");
        size=s.nextInt();
        int arr[]=new int[size];
        System.out.println("Enter array Elements");
        for (int i = 0; i<size; i++) {
            arr[i]=s.nextInt();
        }

        radixSort(arr,size);
        System.out.println("The sorted array is");
        System.out.println(Arrays.toString(arr));

    }

    public static int largest(int arr[]){
        int large=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>large)
                large = arr[i];
        }
        return large;
    }

    public static void radixSort(int arr[],int size){

        int bucket[][]= new int[size][size];
        int bucket_count[]=new int[size];
        int i, j, k, remainder, NOP=0, divisor=1, large, pass;
        large = largest(arr);
        while(large>0)
        {
            NOP++;
            large/=size;
        }

        for(pass=0;pass<NOP;pass++) {
            for (i = 0; i < size; i++) {
                bucket_count[i] = 0;
            }
            for (i = 0; i < arr.length; i++) {
                remainder = (arr[i] / divisor) % size;
                bucket[remainder][bucket_count[remainder]] = arr[i];
                bucket_count[remainder] += 1;
            }

            i = 0;
            for (k = 0; k < size; k++) {
                for (j = 0; j < bucket_count[k]; j++) {
                    arr[i] = bucket[k][j];
                    i++;
                }
            }
            divisor *= size;
        }

    }
}
