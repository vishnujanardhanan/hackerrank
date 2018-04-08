import java.util.*;
import java.util.LinkedList;

public class palndrome1 {
	
	Deque stack = new ArrayDeque<>();
	Queue queue = new LinkedList<>();
	
	void pushCharacter(char ch) {
		stack.push(ch);
	}
	
	void enqueueCharacter(char ch)  {
		queue.add(ch);
	}
	
	char popCharacter() {
		return (char)stack.pop();
	}
	
	char dequeueCharacter() {
		return (char)queue.poll();
	}
	
    // Write your code here.
	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        scan.close();

        // Convert input String to an array of characters:
        char[] s = input.toCharArray();

        // Create a Solution object:
        palndrome1 p = new palndrome1();

        // Enqueue/Push all chars to their respective data structures:
        for (char c : s) {
            p.pushCharacter(c);
            p.enqueueCharacter(c);
        }

        // Pop/Dequeue the chars at the head of both data structures and compare them:
        boolean isPalindrome = true;
        for (int i = 0; i < s.length/2; i++) {
            if (p.popCharacter() != p.dequeueCharacter()) {
                isPalindrome = false;                
                break;
            }
        }

        //Finally, print whether string s is palindrome or not.
        System.out.println( "The word, " + input + ", is " 
                           + ( (!isPalindrome) ? "not a palindrome." : "a palindrome." ) );
    }
}