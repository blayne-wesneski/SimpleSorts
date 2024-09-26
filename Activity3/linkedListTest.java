package Activity3;

public class linkedListTest {
    public static void main(String[] args) {
        linkedList li = new linkedList();

        System.out.println(li.size());

        li.addFirst("10");
        li.addFirst("20");
        li.addFirst("30");
        li.addFirst("40");

        li.printList();

        System.out.println(li.size());

        li.addLast("10");
        li.addLast("20");
        li.addLast("30");
        li.addLast("40");

        li.printList();

        linkedList li2 = new linkedList();

        li2.addLast("nn");
        li2.printList();
    }
}