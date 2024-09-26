package Activity3;

public class linkedList implements listI {

    /**
     * Inner class to represent a node in the linked list.
     */
    class node {
        node next;
        node prev;
        String data;

        node(String obj) {
            data = obj;
        }
    }

    private node head;
    private long size;

    /**
     * Constructor for the linked list.
     */
    linkedList() {
        head = null;
        size = 0;
    }

    /**
     * Add an element to the front of the list.
     * O(1)
     * 
     * @param obj string to add to the list
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
     * 
     * @param obj string to add to the list
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
     * 
     * @return size of the list as a long
     */
    public long size() {
        return size;
    }

    /**
     * Remove the first elements from list and return the data.
     * 
     * If item doesn't exist, return null.
     * 
     * @return String stored in first node.
     */
    public String removeFirst() {

        // BOUNDARIES
        if (head == null) { // empty list
            return null;
        }

        node tmp = head;

        head = head.next;

        size--;

        return tmp.data;
    }

    /**
     * Remove last element and returns the data in the node.
     * 
     * Null if element doesn't exist.
     * 
     * @return String stored in last node.
     */
    public String removeLast() {

        // EMPTY
        if (head == null) {
            return null;
        }

        node curr = head, prev = null;

        while (curr.next != null) {
            prev = curr;
            curr = curr.next;
        }

        // the two pointers are pointing at the last and penultimate nodes

        prev.next = null;

        size--;

        //after method returns, last node gets garbage collected
        return curr.data;
    }

    /**
     * Check if the list contains a certain string.
     * 
     * @param obj string to check for
     * 
     * @return true if string is in list, false otherwise
     */
    public boolean contains(String obj) {
        node tmp = head;

        while (tmp != null) {
            if (tmp.data.equals(obj)) {
                return true;
            }
            tmp = tmp.next;
        }

        return false;
    }
}
