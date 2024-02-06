package DoublyLinkedList;

public class DoublyLinkedList {
    DoublyNode head;

    public DoublyLinkedList() {
        head = null;
    }

    @SuppressWarnings("null")
    void insert(int value) {
        DoublyNode node = new DoublyNode(null, value, null);

        if (isListEmpty()) {
            // single node insertion
            head = node;
            System.out.println("Node inserted at head");
        } else {
            // node already exist
            DoublyNode tmp = head;

            while (tmp.next != null) {
                tmp = tmp.next;
            }

            tmp.next = node.previous;
            node.previous = tmp.next;

            System.out.println("Node inserted at the end");
        }
    }

    void delete() {

    }

    void display() {
        if (isListEmpty()) {
            System.out.println("List is empty");
        }
        DoublyNode tmp = head;

        while (tmp.next != null) {
            System.out.println(" <== " + tmp.data + " ==> ");
            tmp = tmp.next;
        }
    }

    void search(int value) {

    }

    void length() {
    }

    boolean isListEmpty() {
        if (head == null) {
            return true;
        } else {
            return false;
        }
    }

}
