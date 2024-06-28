package singly_linked_list;

public class SinglyLinkedList {
    Node head;
    Node tail;

    void insert(int value) {
        // create a node with the given value
        Node node = new Node(value);

        if (head == null) {
            // this is the first node of the list
            head = node;
            tail = node;
        } else {
            // attaching the tail with the current node
            tail.next = node;
            // updating the current node as tail
            tail = node;
        }
    }

    void display() {
        Node node = head;
        if (node == null) {
            System.out.println("List is empty");
        } else {
            while (node != null) {
                System.out.print(node.data + " -> ");
                node = node.next;
            }
        }
    }

    void deleteTail() {
        if (head == null) {
            System.out.println("List is empty");
        } else if (head == tail) {
            head = tail = null;
            System.out.println("Head deleted");
        } else {
            Node currentNode = head;
            Node previousNode = head;

            while (currentNode.next != null) {
                previousNode = currentNode;
                currentNode = currentNode.next;
            }

            previousNode.next = null;

            System.out.println("Node deleted : " + currentNode.data);
        }
    }

    void search(int value) {
        Node node = head;
        boolean found = false;
        while (node != null) {
            if (node.data == value) {
                found = true;
                break;
            }
            node = node.next;
        }

        if (found) {
            System.out.println("Element exist in the list");
        } else {
            System.out.println("Element does not exist in the list");
        }
    }
}
