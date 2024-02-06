package DoublyLinkedList;

public class DoublyNode {
    DoublyNode previous;
    int data;
    DoublyNode next;

    public DoublyNode(DoublyNode previous, int data, DoublyNode next) {
        this.previous = previous;
        this.data = data;
        this.next = next;
    }

    public DoublyNode getPrevious() {
        return previous;
    }

    public void setPrevious(DoublyNode previous) {
        this.previous = previous;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public DoublyNode getNext() {
        return next;
    }

    public void setNext(DoublyNode next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return "DoublyNode [previous=" + previous + ", data=" + data + ", next=" + next + "]";
    }

}