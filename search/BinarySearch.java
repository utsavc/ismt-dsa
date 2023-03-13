package search;

import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        int size,item,beg,end,mid,pos=-1;
        Boolean status=false;
        Scanner s= new Scanner(System.in);
        System.out.println("Enter the size of Array: ");
        size=s.nextInt();

        int arr[]= new int[size];
        System.out.println("Enter the elements in Array: ");
        for (int i = 0; i <size ; i++) {
            arr[i]=s.nextInt();
        }

        System.out.println("Enter elements to be searched : ");
        item=s.nextInt();

        beg=0;
        end=size-1;

        while (beg<=end){
            mid=(beg+end)/2;

            if (arr[mid]==item){
                pos=mid;
                status=true;
                break;
            }else if (item<arr[mid]){
                end=mid-1;
            }else{
                beg=mid+1;
            }
        }

        if (status==true){
            System.out.println("Item found at position "+pos);
        }else{
            System.out.println("Item Not Found");
        }

    }
}
