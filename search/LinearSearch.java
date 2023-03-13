package search;

import java.util.Scanner;

public class LinearSearch {

    public static void main(String[] args) {
        int size,item;
        Boolean status=false;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the Size of Array");
        size=s.nextInt();
        int arr[]= new int[size];

        System.out.println("Enter the Elements of Array");
        for (int i = 0; i <size ; i++) {
            arr[i]=s.nextInt();
        }

        System.out.println("Enter the element you want to search : ");
        item=s.nextInt();

        for (int i = 0; i <size ; i++) {
            if (arr[i]==item){
                status=true;
                System.out.println("Item has been found");
                break;
            }
        }

        if (status==false){
            System.out.println("Item Not found");
        }
    }
}
