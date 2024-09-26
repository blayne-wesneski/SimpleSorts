package Activity3;

public class linkedList implements ListI {

    class node {
        node next;
        String data;

        node(String obj) {
            data = obj;
        }
    }

    private node head;
    private long size;

    linkedList() {
        head = null;
        size = 0;
    }

    /**
     * Add an element to the front of the list.
     * O(1)
     */
    public void addFirst(String obj) {
        // poof a node
        node node = new node(obj);

        // repoint the head
        node.next = head;

        // repoint head
        head = node;

        // increment size
        size++;
    }

    /**
     * Add an element to the end of the list.
     * O(n)/theta(n)
     */
    public void addLast(String obj) {
        node node = new node(obj);

        node tmp = head;

        // if list empty
        if (size == 0) {
            head = node;
            size++;
            return;
        }

        while (tmp.next != null) {
            tmp = tmp.next;
        }

        tmp.next = node;

        size++;

    }

    /**
     * print the contents of the list
     * O(n) linear time
     */
    public void printList() {
        node tmp = head;

        while (tmp != null) {
            System.out.println(tmp.data);
            tmp = tmp.next;
        }
    }

    /**
     * Return size of the list
     * O(1) constant time access to the n elements in the list
     */
    public long size() {
        return size;
    }
}
