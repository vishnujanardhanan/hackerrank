import java.io.*;
import java.util.*;

class Node {
	int data;
	Node next;
	Node(int d) {
        data = d;
        next = null;
    }
	Node(int d, Node next) {
		this.data = d;
		this.next = next;
	}
}