package SinglyLinkedList;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        SinglyLinkedList singlyLinkedList = new SinglyLinkedList();
        int choice, value;
        Scanner scanner = new Scanner(System.in);
        boolean takeInput = true;
        while (takeInput) {
            System.out.println("\n*** Linked List ***\n");
            System.out.println("1. Insert");
            System.out.println("2. Delete");
            System.out.println("3. Search");
            System.out.println("4. Display");
            System.out.println("5. Length");
            System.out.println("6. Exit");

            System.out.println("Enter your choice : ");
            choice = scanner.nextInt();
            switch (choice) {
                case 1: {
                    System.out.println("Enter value : ");
                    value = scanner.nextInt();
                    singlyLinkedList.insert(value);
                }
                    break;

                case 2: {
                    singlyLinkedList.delete();
                }
                    break;
                case 3: {
                    System.out.println("Enter an value : ");
                    value = scanner.nextInt();

                    singlyLinkedList.search(value);
                }
                    break;
                case 4: {
                    singlyLinkedList.display();
                }

                    break;
                case 5: {
                    singlyLinkedList.length();
                }

                    break;

                default: {
                    System.out.println("Invalid choice");
                }

                    break;
            }

        }
        scanner.close();
    }
}
