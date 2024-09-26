package Activity3;

/**
 * Basic interface for a Linked List implementation.
 */
public interface listI {

	void addFirst(String str);
	void addLast(String str);
	String removeFirst();
	String removeLast();
	boolean contains(String o);
	void printList();
	long size();

	//Other methods to make for a challenge
	//String remove(int);
	//void addMiddle(String obj);
	//int find(String key);
	//String get(int index);

	//double-linked list
	//tail pointer
}
