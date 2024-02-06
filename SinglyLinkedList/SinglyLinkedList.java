package SinglyLinkedList;

/**
 * LinkedList
 */
public class SinglyLinkedList {
    SinglyNode head;

    void insert(int value) {
        SinglyNode node = new SinglyNode(value, null);
        if (head == null) {
            // single node insertion
            head = node;
            System.out.println("Node inserted as head");
        } else {
            // node already exist
            SinglyNode tmp = head;

            while (tmp.next != null) {
                tmp = tmp.next;
            }

            tmp.next = node;
            System.out.println("Node inserted " + node);
        }
    }

    void display() {
        if (head == null) {
            System.out.println("List is empty");
        } else {
            System.out.println("Singly Linked List");
            SinglyNode node = head;
            while (node.next != null) {
                System.out.print(node.data + " => ");
                node = node.next;
            }
            System.err.print("NULL");
        }
    }

    void delete() {
        if (isListEmpty()) {
            System.out.println("List is empty");
        } else {
            SinglyNode currentNode = head;
            SinglyNode previousNode = null;

            while (currentNode.next != null) {
                previousNode = currentNode;
                currentNode = currentNode.next;
            }

            // disconnected the last node from the previous node
            previousNode.next = null;
            System.out.println("Last node deleted from the list.");
            System.out.println("[" + currentNode.data + "] deleted");
        }
    }

    void search(int value) {
        if (isListEmpty()) {
            System.out.println("List is empty");
        } else {
            boolean found = false;
            SinglyNode node = head;
            while (node != null) {
                if (node.data == value) {
                    found = true;
                    break;
                }
                node = node.next;
            }

            if (found) {
                System.out.println("Value exist in the list");
            } else {
                System.out.println("Value does not exist in the list");
            }
        }
    }

    void length() {
        if (isListEmpty()) {
            System.out.println("List is empty");
        } else {
            int length = 0;
            SinglyNode singlyNode = head;
            while (singlyNode != null) {
                length++;
                singlyNode = singlyNode.next;
            }

            System.out.println("Length : " + length);
        }

    }

    boolean isListEmpty() {
        if (head == null) {
            return true;
        } else {
            return false;
        }
    }

}