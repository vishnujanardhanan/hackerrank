import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class LinkedList24 {
	
    public static Node removeDuplicates(Node head) {
        //Write your code here
          List nodeMap = new ArrayList();
          while(head!=null) {
              if(!nodeMap.contains(head.data)) {
                  nodeMap.add(head.data);
              }
              head = head.next;
          }
          Node newNode=null;
              
          Iterator nodeIterator = nodeMap.iterator();
          
          while(nodeIterator.hasNext()) {
              if(newNode == null) {
                  newNode = new Node((int)nodeIterator.next());
              }
              else {
                  Node start=newNode;
                  while(start.next!=null)
                      start=start.next;
                  start.next=new Node((int)nodeIterator.next()); 
              }
          }
          return newNode;
      }
    
	 public static  Node insert(Node head,int data)
     {
        Node p=new Node(data);			
        if(head==null)
            head=p;
        else if(head.next==null)
            head.next=p;
        else
        {
            Node start=head;
            while(start.next!=null)
                start=start.next;
            start.next=p;

        }
        return head;
    }
    public static void display(Node head)
        {
              Node start=head;
              while(start!=null)
              {
                  System.out.print(start.data+" ");
                  start=start.next;
              }
        }
        public static void main(String args[])
        {
              Scanner sc=new Scanner(System.in);
              Node head=null;
              int T=sc.nextInt();
              while(T-->0){
                  int ele=sc.nextInt();
                  head=insert(head,ele);
              }
              head=removeDuplicates(head);
              display(head);

       }

}
