package sorts;

import java.util.Scanner;

public class InsertionSort {
    public void insertionSort(){
        int temp,j;
        Scanner s= new Scanner(System.in);
        int arr[]= new int[5];
        System.out.println("Enter Integers");
        for (int i = 0; i < 5; i++) {
            arr[i]=s.nextInt();
        }

        for (int i = 1; i < arr.length ; i++) {
            temp=arr[i];
            j=i-1;
            while (temp<=arr[j]){
                arr[j+1]=arr[j];
                j=j-1;
            }
            arr[j+1]=temp;
        }

        for (int a:arr) {
            System.out.print(a);
        }


    }

    public static void main(String[] args) {
        InsertionSort is= new InsertionSort();
        is.insertionSort();
    }

}
