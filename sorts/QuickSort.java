package sorts;

import java.util.*;

public class QuickSort {

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

        quickSort(arr,0,size-1);
        System.out.println("The sorted array is");
        System.out.println(Arrays.toString(arr));

    }

    public static int partition(int arr[],int beg,int end){
        int pivot=arr[beg];
        int i=beg;
        int j=end;
        int temp;
        while(i<j) {
            while (pivot>arr[i]) {
                i++;
            }

            while (pivot<arr[j]) {
                j--;
            }

            if (i < j) {
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        return j;
    }

    public static void quickSort(int arr[],int beg,int end){
        if (beg<end){
            int p=partition(arr,beg,end);
            quickSort(arr,beg,p-1);
            quickSort(arr,p+1,end);
        }
    }
}
