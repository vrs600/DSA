package SinglyLinkedList;

class SinglyNode {
    int data;
    SinglyNode next;

    public SinglyNode(int data, SinglyNode next) {
        this.data = data;
        this.next = next;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public SinglyNode getNext() {
        return next;
    }

    public void setNext(SinglyNode next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return "Node [data=" + data + ", next=" + next + "]";
    }

}
