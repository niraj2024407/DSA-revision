package LinkedList;

//class Node{
//    int data;
//    Node next;
//
//    Node(int data1, Node next1){
//        this.data = data1;
//        this.next = next1;
//    }
//    Node(int data1){
//        this.data = data1;
//        this.next = null;
//    }
//}
//public class LinkedList {
//    private static Node convertArr2LL(int[] arr) {
//        Node head = new Node(arr[0]);
//        Node mover = head;
//        for (int i = 0; i < arr.length; i++) {
//            Node temp = new Node(arr[i]);
//            mover.next = temp;
//        }
//        return head;
//    }
//
//    public static void main(String[] args) {
//        int[] arr = {12, 5, 6, 8};
////        Node y = new Node(arr[3]);
////        System.out.println(y.data);
//        Node head = convertArr2LL(arr);
//        System.out.println(head.data);
//    }
//}

//  Creating a Linked List
//import java.util.*;
//
//class Node {
//    public int data;
//    public Node next;
//
//    public Node(int data, Node next) {
//        this.data = data;
//        this.next = next;
//    }
//}
//
//public class LinkedList {
//    public static void main(String[] args) {
//        ArrayList<Integer> arr = new ArrayList<>();
//        arr.add(2);
//        arr.add(5);
//        arr.add(8);
//        arr.add(7);
//
//        /*
//         * Assigning values to
//         * the nodes
//         */
//        Node y1 = new Node(arr.get(0), null);
//        Node y2 = new Node(arr.get(1), null);
//        Node y3 = new Node(arr.get(2), null);
//        Node y4 = new Node(arr.get(3), null);
//
//        /*
//         * Linking of
//         * Nodes
//         */
//        y1.next = y2;
//        y2.next = y3;
//        y3.next = y4;
//
//        /*
//         * Printing Nodes with their
//         * values and data
//         */
//        System.out.println(y1.data + " " + y1.next);
//        System.out.println(y2.data + " " + y2.next);
//        System.out.println(y3.data + " " + y3.next);
//        System.out.println(y4.data + " " + y4.next);
//    }
//}

//Convert an array to Linked List
//import java.util.*;
//
//class Node {
//    int data;
//    Node next;
//
//    // Constructor to initialize a new node
//    Node(int val) {
//        data = val;
//        next = null;
//    }
//}
//
//public class LinkedList {
//    // Function to convert an array to a linked list
//    public static Node arrayToLinkedList(int[] arr) {
//        int size = arr.length;
//        if (size == 0) return null;
//
//        // Create head of the linked list
//        Node head = new Node(arr[0]);
//        Node current = head;
//
//        /* Iterate through the array
//        and create linked list nodes */
//        for (int i = 1; i < size; i++) {
//            current.next = new Node(arr[i]);
//            current = current.next;
//        }
//
//        return head;
//    }
//
//    // Function to print the linked list
//    public static void printLinkedList(Node head) {
//        Node current = head;
//        while (current != null) {
//            System.out.print(current.data + " -> ");
//            current = current.next;
//        }
//        System.out.println("null");
//    }
//
//    public static void main(String[] args) {
//        int[] arr = {1, 2, 3, 4, 5};
//
//        // Convert array to linked list
//        Node head = arrayToLinkedList(arr);
//
//        // Print the linked list
//        printLinkedList(head);
//    }
//}

//Length of Linked List
//import java.util.*;
//
//class Node {
//    int data;
//    Node next;
//
//    // Constructor to initialize a new node
//    Node(int val) {
//        data = val;
//        next = null;
//    }
//}
//
//// Function to convert an array to a linked list
//class LinkedList {
//    public static Node arrayToLinkedList(int[] arr) {
//        int size = arr.length;
//        if (size == 0) return null;
//
//        // Create head of the linked list
//        Node head = new Node(arr[0]);
//        Node current = head;
//
//        /* Iterate through the array
//        and create linked list nodes */
//        for (int i = 1; i < size; i++) {
//            current.next = new Node(arr[i]);
//            current = current.next;
//        }
//
//        return head;
//    }
//
//    // Function to print the linked list
//    public static void printLinkedList(Node head) {
//        Node current = head;
//        while (current != null) {
//            System.out.print(current.data + " -> ");
//            current = current.next;
//        }
//        System.out.println("null");
//    }
//
//    // To calculate length of linked list
//    public static int lengthOfLinkedList(Node head) {
//        int length = 0;
//        Node current = head;
//
//        // Count the nodes
//        while (current != null) {
//            length++;
//            current = current.next;
//        }
//
//        return length;
//    }
//
//    public static void main(String[] args) {
//        int[] arr = {1, 2, 3, 4, 5};
//
//        // Convert array to linked list
//        Node head = arrayToLinkedList(arr);
//
//        // Print the linked list
//        printLinkedList(head);
//
//        // Calculate the length of the linked list
//        int length = lengthOfLinkedList(head);
//        System.out.println("Length of the linked list: " + length);
//    }
//}

//Search an Element in Linked List
import java.util.*;

class Node {
    int data;
    Node next;

    // Constructor to initialize a new node
    Node(int val) {
        data = val;
        next = null;
    }
}

public class LinkedList {
    // Function to print the linked list
    public static void printLinkedList(Node head) {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    // To search for an element in the linked list
    public static boolean searchElement(Node head, int target) {
        Node current = head;

        // Traverse the linked list
        while (current != null) {
            if (current.data == target) {
                return true;
            }
            current = current.next;
        }

        return false;
    }

    public static void main(String[] args) {
        // Create a linked list manually
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);

        // Print the linked list
        printLinkedList(head);

        // Search for an element in the linked list
        int target = 3;
        if (searchElement(head, target)) {
            System.out.println("Element " + target + " found in the linked list.");
        } else {
            System.out.println("Element " + target + " not found in the linked list.");
        }
    }
}




