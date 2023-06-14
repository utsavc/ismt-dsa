package linkedlist;

import java.util.Scanner;

public class LinkedList {
    Node head;

    public LinkedList() {
        this.head = null;
    }

    public void insertFirst(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    public void insertLast(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    public void insertAfter(int nodeVal, int data) {
        Node ptr=head;
        Node newNode = new Node(data);
        while (ptr.data!=nodeVal){
            ptr=ptr.next;
        }
        newNode.next=ptr.next;
        ptr.next=newNode;
    }

    public void deleteFirst() {
        if (isEmpty()){
            System.out.println("Linked List Empty");
        }else {
            Node ptr = head;
            System.out.println("The deleted element is " + ptr.data);
            head = head.next;
            ptr = null;
        }
    }


    public void deleteLast() {
        if (isEmpty()){
            System.out.println("Linked List Empty");
        }else {
            Node ptr = head;
            Node preptr=ptr;
            while (ptr.next!=null){
                preptr=ptr;
                ptr=ptr.next;
            }
            preptr.next=null;
            System.out.println("The deleted element is " + ptr.data);
            ptr = null;
        }
    }

    public void deleteAfter(int val) {
        if (isEmpty()){
            System.out.println("Linked List Empty");
        }else {
            Node ptr = head;
            Node preptr=ptr;
            while (preptr.data!=val){
                preptr=ptr;
                ptr=ptr.next;
            }

            preptr.next=ptr.next;
            System.out.println("The deleted element is " + ptr.data);
            ptr = null;
        }
    }

    public boolean isEmpty(){
        if (head==null){
            return  true;
        }
        return false;
    }



    public void displayList() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + ",");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);

        int element;
        LinkedList linkedList = new LinkedList();

        while (true) {
        System.out.print("Enter your choice \n1.At First \t2.At Last \t3.After Node \t4.Display \t6.Exit");
        System.out.println("\n Delete from \t5.First \t6.Last \t7.After node");
        int choice=s.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter the element to insert");
                    element = s.nextInt();
                    linkedList.insertFirst(element);
                    break;
                case 2:
                    System.out.println("Enter the element to insert");
                    element = s.nextInt();
                    linkedList.insertLast(element);
                    break;

                case 3:
                    System.out.println("Enter the node value");
                    int val=s.nextInt();
                    System.out.println("Enter the element to insert");
                    element = s.nextInt();
                    linkedList.insertAfter(val,element);
                    break;

                case 4:
                    linkedList.displayList();
                    break;
                case 5:
                    linkedList.deleteFirst();
                    break;
                case 6:
                    linkedList.deleteLast();
                    break;
                case 7:
                    System.out.println("Enter the node value");
                    int nodeItem=s.nextInt();
                    linkedList.deleteAfter(nodeItem);
                    break;



                case 8:
                    System.out.println("Exiting");
                    System.exit(0);
                    break;

                    case 9:
                        break;

                default:
                    System.out.println("Wrong Choice");
            }
        }


    }
}
