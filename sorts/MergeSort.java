package sorts;

import java.util.*;

public class MergeSort {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int arr[]=new int[5];
        System.out.println("Enter the elements of the array: ");
        for(int i=0;i< arr.length;i++){
            arr[i]=s.nextInt();
        }
        mergeSort(arr,0,arr.length-1);
        System.out.println("Sorted Array:");
        System.out.println(Arrays.toString(arr));
    }

    public static void merge(int arr[], int beg, int mid, int end) {
        int i=beg, j=mid+1, index=beg, k;
        int temp[]= new int[100];
        while((i<=mid) && (j<=end)) {
            if(arr[i] < arr[j]) {
                temp[index] = arr[i];
                i++;
            }else{
                temp[index] = arr[j];
                j++;
            }
            index++;
        }
        if(i>mid){
            while(j<=end){
                temp[index] = arr[j];
                j++;
                index++;
            }
        }else{
            while(i<=mid){
                temp[index] = arr[i];
                i++;
                index++;
            }
        }
        for(k=beg;k<index;k++) {
            arr[k] = temp[k];
        }
    }

    public static void mergeSort(int arr[],int left,int right){
        if (left<right){
            int mid=(left+right)/2;
            mergeSort(arr,left,mid);
            mergeSort(arr,mid+1,right);

            merge(arr,left,mid,right);
        }

    }
}
