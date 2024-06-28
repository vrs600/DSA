package singly_linked_list;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        SinglyLinkedList singlyLinkedList = new SinglyLinkedList();
        Scanner scanner = new Scanner(System.in);
        boolean takeInput = true;
        int choice;
        int value;
        while (takeInput) {
            System.out.println("\n1. Insert");
            System.out.println("2. Display");
            System.out.println("3. Delete tail");
            System.out.println("4. Search");
            System.out.println("5s. Exit");
            System.out.print("Enter your choice : ");

            choice = scanner.nextInt();

            switch (choice) {
                case 1: {
                    System.out.print("Enter value : ");
                    value = scanner.nextInt();
                    singlyLinkedList.insert(value);
                }
                break;
                case 2: {
                    singlyLinkedList.display();
                }
                break;
                case 3: {
                    singlyLinkedList.deleteTail();
                }
                break;
                case 4: {
                    System.out.print("Enter value to search : ");
                    value = scanner.nextInt();
                    singlyLinkedList.search(value);
                }
                break;
                case 5: {
                    takeInput = false;
                }
            }
        }
    }
}
